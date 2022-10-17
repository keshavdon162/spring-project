package com.cognizant.model;

public class SlaDaily {

		private int DataExchangeID;
		private String SlaState;
		private String PlanName;
		private String Priority;
		private String Lob;
		private String FileName;
		private String Fileconvention;
		private String HcscSentinalControl;
		private String SearchKey;
		private String FileDetailedDescription;
		private String FileNamePattern;
		private int ActiveBatchId;
		private String ActiveBatchProccess;
		private String SlaFrequency;
		private String SlaDay;
		private String SlaTime;
		private String Comments;
		private String WeekDaySchedule;
		private String SearchResults;
		private String DestinationFile;
		private String TimeStamp;
		private String SlaFound;

		public int getDataExchangeID() {
		return DataExchangeID;
		}
		public void setDataExchangeID(int dataExchangeID) {
		DataExchangeID = dataExchangeID;
		}
		public String getSlaState() {
		return SlaState;
		}
		public void setSlaState(String slaState) {
		SlaState = slaState;
		}
		public String getPlanName() {
		return PlanName;
		}
		public void setPlanName(String planName) {
		PlanName = planName;
		}
		public String getPriority() {
		return Priority;
		}
		public void setPriority(String priority) {
		Priority = priority;
		}
		public String getLob() {
		return Lob;
		}
		public void setLob(String lob) {
		Lob = lob;
		}
		public String getFileName() {
		return FileName;
		}
		public void setFileName(String fileName) {
		FileName = fileName;
		}
		public String getFileconvention() {
		return Fileconvention;
		}
		public void setFileconvention(String fileconvention) {
		Fileconvention = fileconvention;
		}
		public String getHcscSentinalControl() {
		return HcscSentinalControl;
		}
		public void setHcscSentinalControl(String hcscSentinalControl) {
		HcscSentinalControl = hcscSentinalControl;
		}
		public String getSearchKey() {
		return SearchKey;
		}
		public void setSearchKey(String searchKey) {
		SearchKey = searchKey;
		}
		public String getFileDetailedDescription() {
		return FileDetailedDescription;
		}
		public void setFileDetailedDescription(String fileDetailedDescription) {
		FileDetailedDescription = fileDetailedDescription;
		}
		public String getFileNamePattern() {
		return FileNamePattern;
		}
		public void setFileNamePattern(String fileNamePattern) {
		FileNamePattern = fileNamePattern;
		}
		public int getActiveBatchId() {
		return ActiveBatchId;
		}
		public void setActiveBatchId(int activeBatchId) {
		ActiveBatchId = activeBatchId;
		}
		public String getActiveBatchProccess() {
		return ActiveBatchProccess;
		}
		public void setActiveBatchProccess(String activeBatchProccess) {
		ActiveBatchProccess = activeBatchProccess;
		}
		public String getSlaFrequency() {
		return SlaFrequency;
		}
		public void setSlaFrequency(String slaFrequency) {
		SlaFrequency = slaFrequency;
		}
		public String getSlaDay() {
		return SlaDay;
		}
		public void setSlaDay(String slaDay) {
		SlaDay = slaDay;
		}
		public String getSlaTime() {
		return SlaTime;
		}
		public void setSlaTime(String slaTime) {
		SlaTime = slaTime;
		}
		public String getComments() {
		return Comments;
		}
		public void setComments(String comments) {
		Comments = comments;
		}
		public String getWeekDaySchedule() {
		return WeekDaySchedule;
		}
		public void setWeekDaySchedule(String weekDaySchedule) {
		WeekDaySchedule = weekDaySchedule;
		}
		public String getSearchResults() {
		return SearchResults;
		}
		public void setSearchResults(String searchResults) {
		SearchResults = searchResults;
		}
		public String getDestinationFile() {
		return DestinationFile;
		}
		public void setDestinationFile(String destinationFile) {
		DestinationFile = destinationFile;
		}
		public String getTimeStamp() {
		return TimeStamp;
		}
		public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
		}
		public String getSlaFound() {
		return SlaFound;
		}
		public void setSlaFound(String slaFound) {
		SlaFound = slaFound;
		}
		@Override
		public String toString() {
		return "SlaDaily [DataExchangeID=" + DataExchangeID + ", SlaState=" + SlaState + ", PlanName=" + PlanName
		+ ", Priority=" + Priority + ", Lob=" + Lob + ", FileName=" + FileName + ", Fileconvention="
		+ Fileconvention + ", HcscSentinalControl=" + HcscSentinalControl + ", SearchKey=" + SearchKey
		+ ", FileDetailedDescription=" + FileDetailedDescription + ", FileNamePattern=" + FileNamePattern
		+ ", ActiveBatchId=" + ActiveBatchId + ", ActiveBatchProccess=" + ActiveBatchProccess
		+ ", SlaFrequency=" + SlaFrequency + ", SlaDay=" + SlaDay + ", SlaTime=" + SlaTime + ", Comments="
		+ Comments + ", WeekDaySchedule=" + WeekDaySchedule + ", SearchResults=" + SearchResults
		+ ", DestinationFile=" + DestinationFile + ", TimeStamp=" + TimeStamp + ", SlaFound=" + SlaFound + "]";
		}
	

}
