package com.cognizant.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.LogFile;
import com.cognizant.model.SlaDaily;
import com.cognizant.model.SlaFile;


@Service
public class ServiceDaily {
public SlaDaily  setter (SlaFile s)
{
SlaDaily sla = new SlaDaily();
sla.setDataExchangeID (s.getDataExchangeID());
sla.setSlaState(s.getSlaState());
sla.setPlanName(s.getPlanName());
sla.setPriority(s.getPriority());
sla.setLob(s.getLob());
sla.setFileName(s.getFileName());
sla.setFileconvention(s.getFileconvention());
sla.setHcscSentinalControl(s.getHcscSentinalControl());
sla.setSearchKey(s.getSearchKey());
sla.setFileDetailedDescription(s.getFileDetailedDescription());
sla.setFileNamePattern(s.getFileNamePattern());
sla.setActiveBatchId(s.getActiveBatchId());
sla.setActiveBatchProccess(s.getActiveBatchProccess());
sla.setSlaFrequency(s.getSlaFrequency());
sla.setSlaDay(s.getSlaDay());
sla.setSlaTime(s.getSlaTime());
sla.setComments(s.getComments());
sla.setWeekDaySchedule(s.getWeekDaySchedule());
return sla;

}
public List<SlaDaily> FileSearch(List<SlaFile> slafile,List<LogFile> logfile)
{
int count=0;
int c=0;
LogFile l1 = new LogFile();
List<SlaDaily> sladaily = new ArrayList<SlaDaily>();
LocalDateTime currentTime = LocalDateTime.now();
//LocalDateTime yesterday = currentTime.minusDays(1);
LocalDateTime nextday = currentTime.plusDays(1);
   //System.out.println(currentTime);
//System.out.println(nextday);
   LocalDate date = LocalDate.now();
   int currentday = currentTime.getDayOfMonth();
   //System.out.println("current day "+ currentday);
   //System.out.println(yesterday);
   LocalDate firstday = date.withDayOfMonth( 1 ) ;
   //System.out.println(firstday);
   int lod = nextday.getDayOfMonth();
   //System.out.println("last day "+lod);
   DayOfWeek Weekday = currentTime.getDayOfWeek();
   int weekday=Weekday.getValue();
   //System.out.println("current day "+ weekday);
   DayOfWeek firstWeek = firstday.getDayOfWeek();
  int fs=firstWeek.getValue();
  if (fs==7)
   {
    fs=0;
   }
  int sat2=14-fs;
   int sat4=28-fs;
   //System.out.println("2nd Saturday"+ sat2);
   //System.out.println("4th Saturday"+ sat4);
  int fw=firstWeek.getValue();
  //System.out.println("FIRST DAY "+fw);
   
   int wed=0;
   switch(fw) {
   case 1:
    wed=3;
    break;
   case 2:
    wed=2;
    break;
   case 3:
    wed=1;
    break;
   case 4:
    wed=7;
    break;
   case 5:
    wed=6;
    break;
   case 6:
    wed=5;
    break;
   case 7:
    wed=4;
    break;
   default:
    break;
   
   }
   //System.out.println("Firstwed "+wed);
   
for (SlaFile s: slafile)
{
SlaDaily sla = new SlaDaily();
int flag=0;


for(LogFile l : logfile)
{

l1=l;
if (s.getWeekDaySchedule().equals("All 7 days"))
{
flag=1;
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("present "+ l.getDestFile());
break;
}
}
if (s.getWeekDaySchedule().equals("Last Day"))
{
flag=1;
if (lod==1)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("lod present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Monday-Friday"))
{
flag=1;
if (weekday>=1 && weekday<=5)
{

if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("Monday-Friday present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Tuesday - Sunday"))
{
flag=1;
if (weekday>=2 && weekday<=7)
{

if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("Tuesday - Sunday "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Monday, Thursday"))
{
flag=1;
if (weekday==1 || weekday==4)
{

if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("Monday, thursday present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Monday, Wednesday, Friday"))
{
flag=1;
if (weekday==1 || weekday==3 || weekday==5)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("Monday, Wednesday, Friday present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Monday"))
{
flag=1;
if (weekday==1)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("Monday present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Tuesday"))
{
flag=1;
if (weekday==2)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("tuesday present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Thursday"))
{
flag=1;
if (weekday==4)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("thursday present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Friday"))
{
flag=1;
if (weekday==5)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("friday present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Sunday"))
{
flag=1;
if (weekday==7)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("sunday present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("5th"))
{
flag=1;
if (currentday==5)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("5th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("6th"))
{
flag=1;
if (currentday==6)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("6th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("8th"))
{
flag=1;
if (currentday==8)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("8th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("10th"))
{
flag=1;
if (currentday==10)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("10th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("12th"))
{
flag=1;
if (currentday==12)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("12th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("13th"))
{
flag=1;
if (currentday==13)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("13th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("15th"))
{
flag=1;
if (currentday==15)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("15th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("20th"))
{
flag=1;
if (currentday==20)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("20th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("25th"))
{
flag=1;
if (currentday==25)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("25th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("29th"))
{
flag=1;
if (currentday==29)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("29th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("Saturday(2nd,4th)"))
{
flag=1;
if (currentday==sat2 || currentday==sat4)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("6th present "+ l.getDestFile());
break;
}
}
}
if (s.getWeekDaySchedule().equals("First Wednesday"))
{
flag=1;
if (currentday==wed)
{
if (l.getDestFile().startsWith(s.getSearchKey())){
flag = 2;
c++;
//System.out.println("First Wednesday "+ l.getDestFile());
break;
}
}
}

}
sla = setter(s);

if (flag == 0) {
sla.setSearchResults("No File");
sla.setDestinationFile("No File Found, Manually validate and verify");
//System.out.println(s.getWeekDaySchedule()+" "+ s.getSearchKey());
}
if (flag == 1) {
count++;
sla.setSearchResults("Not Applicable");
sla.setDestinationFile("Criterion didn't match for report run date");
//System.out.println(s.getWeekDaySchedule()+" No File "+ s.getSearchKey());
}
if (flag == 2) {
sla.setSearchResults("File Found");
sla.setDestinationFile(l1.getDestFile());
sla.setTimeStamp(l1.getLogStamp());
//System.out.println(l1.getDestFile()+l1.getLogStamp()+s.getSlaTime()+s.getDataExchangeID());


//System.out.println("File found "+s.getWeekDaySchedule()+" "+ s.getSearchKey());
}
sladaily.add(sla);

}
//System.out.println("count 1 "+ count);
//System.out.println("file found count "+ c);


return sladaily;

}

}

