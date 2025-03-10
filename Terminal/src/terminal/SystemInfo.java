package terminal;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SystemInfo {
	
	private String userName;
	private String pcName;
	
	public SystemInfo() {
		this.userName = System.getProperty("user.name");
		try {
			this.pcName = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			this.pcName = "localhost";
		}
	}

	public String getUserName() {
		return userName;
	}

	public String getPcName() {
		return pcName;
	}
}
