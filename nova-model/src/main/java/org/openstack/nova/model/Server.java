package org.openstack.nova.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName("server")
public class Server implements Serializable {
	
	public static final class Addresses implements Serializable {
		
		public static final class Address implements Serializable {
			
			private String version;
			
			private String addr;

			/**
			 * @return the version
			 */
			public String getVersion() {
				return version;
			}

			/**
			 * @return the addr
			 */
			public String getAddr() {
				return addr;
			}

			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Address [version=" + version + ", addr=" + addr + "]";
			}
			
		}
		
		@JsonProperty("private")
		private List<Address> privateList;
		
		@JsonProperty("public")
		private List<Address> publicList;

		/**
		 * @return the privateList
		 */
		public List<Address> getPrivateList() {
			return privateList;
		}

		/**
		 * @return the publicList
		 */
		public List<Address> getPublicList() {
			return publicList;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Addresses [privateList=" + privateList + ", publicList="
					+ publicList + "]";
		}
		
	}
	
	public static final class Fault {
		
		private Integer code;
		
		private String message;
		
		private Calendar created;

		/**
		 * @return the code
		 */
		public Integer getCode() {
			return code;
		}

		/**
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}

		/**
		 * @return the created
		 */
		public Calendar getCreated() {
			return created;
		}
		
	}
		

	private String id;
	
	private String name;
	
	private Addresses addresses;
	
	private List<Link> links;
	
	private Image image;
	
	private Flavor flavor;
	
	private String accessIPv4;
	
	private String accessIPv6;
	
	@JsonProperty("config_drive")
	private String configDrive;
	
	private String status;
	
	private Integer progress;
	
	private Fault fault;
	
	@JsonProperty("tenant_id")
	private String tenantId;
	
	@JsonProperty("user_id")
	private String userId;
	
	@JsonProperty("key_name")
	private String keyName;
	
	private String hostId;
	
	private String updated;
	
	private String created;
	
	private Map<String, String> metadata;
	
	@JsonProperty("security_groups")
	private List<SecurityGroup> securityGroups;
	
	@JsonProperty("OS-EXT-STS:task_state")
	private String taskState;
	
	@JsonProperty("OS-EXT-STS:power_state")
	private String powerState;
	
	@JsonProperty("OS-EXT-STS:vm_state")
	private String vmState;
	
	@JsonProperty("OS-EXT-SRV-ATTR:host")
	private String host;
	
	@JsonProperty("OS-EXT-SRV-ATTR:instance_name")
	private String instanceName;
	
	@JsonProperty("OS-EXT-SRV-ATTR:hypervisor_hostname")
	private String hypervisorHostname;
	
	@JsonProperty("OS-DCF:diskConfig")
	private String diskConfig;
	
	private String uuid;
	
	private String adminPass;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the addresses
	 */
	public Addresses getAddresses() {
		return addresses;
	}

	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return the flavor
	 */
	public Flavor getFlavor() {
		return flavor;
	}
	
	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	/**
	 * @return the accessIPv4
	 */
	public String getAccessIPv4() {
		return accessIPv4;
	}

	/**
	 * @return the accessIPv6
	 */
	public String getAccessIPv6() {
		return accessIPv6;
	}

	/**
	 * @return the configDrive
	 */
	public String getConfigDrive() {
		return configDrive;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the progress
	 */
	public Integer getProgress() {
		return progress;
	}

	/**
	 * @return the fault
	 */
	public Fault getFault() {
		return fault;
	}

	/**
	 * @return the tenantId
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @return the keyName
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * @return the hostId
	 */
	public String getHostId() {
		return hostId;
	}

	/**
	 * @return the updated
	 */
	public String getUpdated() {
		return updated;
	}

	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * @return the metadata
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}

	/**
	 * @return the securityGroups
	 */
	public List<SecurityGroup> getSecurityGroups() {
		return securityGroups;
	}

	/**
	 * @return the taskState
	 */
	public String getTaskState() {
		return taskState;
	}

	/**
	 * @return the powerState
	 */
	public String getPowerState() {
		return powerState;
	}

	/**
	 * @return the vmState
	 */
	public String getVmState() {
		return vmState;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @return the instanceName
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * @return the hypervisorHostname
	 */
	public String getHypervisorHostname() {
		return hypervisorHostname;
	}

	/**
	 * @return the diskConfig
	 */
	public String getDiskConfig() {
		return diskConfig;
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @return the adminPass
	 */
	public String getAdminPass() {
		return adminPass;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Server [id=" + id + ", name=" + name + ", addresses="
				+ addresses + ", links=" + links + ", image=" + image
				+ ", flavor=" + flavor + ", accessIPv4=" + accessIPv4
				+ ", accessIPv6=" + accessIPv6 + ", configDrive=" + configDrive
				+ ", status=" + status + ", progress=" + progress + ", fault="
				+ fault + ", tenantId=" + tenantId + ", userId=" + userId
				+ ", keyName=" + keyName + ", hostId=" + hostId + ", updated="
				+ updated + ", created=" + created + ", metadata=" + metadata
				+ ", securityGroups=" + securityGroups + ", taskState="
				+ taskState + ", powerState=" + powerState + ", vmState="
				+ vmState + ", host=" + host + ", instanceName=" + instanceName
				+ ", hypervisorHostname=" + hypervisorHostname
				+ ", diskConfig=" + diskConfig + ", uuid=" + uuid
				+ ", adminPass=" + adminPass + "]";
	}

}
