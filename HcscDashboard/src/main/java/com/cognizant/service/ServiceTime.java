package com.cognizant.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.SlaDaily;
@Service
public class ServiceTime {
public List<SlaDaily> FileTime(List<SlaDaily> sladaily) throws ParseException{

List<SlaDaily> slafinal= new ArrayList<SlaDaily>();
LocalDate date = LocalDate.now();
String sdate=date.toString();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");


for(SlaDaily s1:sladaily)
{
SlaDaily s = new SlaDaily();
s=s1;
int out=0;
if (s.getSearchResults().equals("File Found"))
{
String logtime = s.getTimeStamp();
String time=logtime.replace('T', ' ');
   Date givendate=sdf.parse(time);
   if(s.getSlaTime().equals("10AM")) {
    String stime=" 10:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("10PM")) {
    String stime=" 22:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("11AM")) {
    String stime=" 11:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("11PM")) {
    String stime=" 23:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("2AM")) {
    String stime=" 02:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("2PM")) {
    String stime=" 14:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("3AM")) {
    String stime=" 03:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("3PM")) {
    String stime=" 15:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("4AM")) {
    String stime=" 04:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("4PM")) {
    String stime=" 16:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("5AM")) {
    String stime=" 05:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("5PM")) {
    String stime=" 17:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("6AM")) {
    String stime=" 06:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("6PM")) {
    String stime=" 18:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("7AM")) {
    String stime=" 07:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("7PM")) {
    String stime=" 19:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("8AM")) {
    String stime=" 08:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("8PM")) {
    String stime=" 20:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("9AM")) {
    String stime=" 09:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("9PM")) {
    String stime=" 21:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("Noon")) {
    String stime=" 12:00:00.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   if(s.getSlaTime().equals("Midnight")) {
    String stime=" 23:59:59.000";
   String sres=sdate+stime;
   Date sladate=sdf.parse(sres);
   out = givendate.compareTo(sladate);
   
   if(out<0) {
    s.setSlaFound("Achieved");
   }
   else {
    s.setSlaFound("breached");
   }
   
   }
   
   
   



}
slafinal.add(s);
}


return slafinal;

}

}

