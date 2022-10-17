package com.cognizant.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.cognizant.model.LogFile;
import com.cognizant.model.SlaDaily;
import com.cognizant.model.SlaFile;
import com.cognizant.service.ServiceDaily;
import com.cognizant.service.ServiceLogFile;
import com.cognizant.service.ServiceSlaFile;
import com.cognizant.service.ServiceTime;

@Controller
public class DashboardController {
	
	@Autowired
	ServiceSlaFile service1;
	ServiceLogFile service2;
	ServiceDaily service3 ;
	ServiceTime service4;
	
		public String navigateToMain() throws IOException, ParseException
		{
			List<SlaFile> slafile = service1.ExcelRead();
			List<LogFile> logfile = service2.ExcelRead();
			//System.out.println(slafile);
			//System.out.println(logfile);
			List<SlaDaily> sladaily = service3.FileSearch(slafile,logfile);
			//System.out.println(sladaily);
			List<SlaDaily> slafinal = service4.FileTime(sladaily);
			return "Main";
		
	}

	
}
