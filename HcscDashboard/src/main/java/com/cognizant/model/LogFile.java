package com.cognizant.model;

public class LogFile {

	private String LogStamp;
	private String TaskName;
	private String DestHost;
	private String DestPath;
	private String DestFile;
	private int DestBytes;
	
	public String getLogStamp() {
		return LogStamp;
	}
	public void setLogStamp(String logStamp) {
		LogStamp = logStamp;
	}
	public String getTaskName() {
		return TaskName;
	}
	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	public String getDestHost() {
		return DestHost;
	}
	public void setDestHost(String destHost) {
		DestHost = destHost;
	}
	public String getDestPath() {
		return DestPath;
	}
	public void setDestPath(String destPath) {
		DestPath = destPath;
	}
	public String getDestFile() {
		return DestFile;
	}
	public void setDestFile(String destFile) {
		DestFile = destFile;
	}
	public int getDestBytes() {
		return DestBytes;
	}
	public void setDestBytes(int destBytes) {
		DestBytes = destBytes;
	}
	@Override
	public String toString() {
		return "LogFile [LogStamp=" + LogStamp + ", TaskName=" + TaskName + ", DestHost=" + DestHost + ", DestPath="
				+ DestPath + ", DestFile=" + DestFile + ", DestBytes=" + DestBytes + "]";
	}
	
	
	
}
