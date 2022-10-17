package com.cognizant.service;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.cognizant.model.LogFile;

@Service
public class ServiceLogFile {

	public List<LogFile> ExcelRead() throws IOException
	{
		List<LogFile> loglist = new ArrayList<LogFile>();
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\Downloads\\hcsc log file.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);//creating workbook
		XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve data from the sheet
		Iterator<Row> itr = sheet.iterator(); // iterating over excel file
		int rowNum = 0;
		while (itr.hasNext()) {
		LogFile sf = new LogFile();
		Row row = itr.next();
		if (rowNum == 0 ||rowNum == 1) {
		rowNum++;
		continue;
		}
		Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
		while (cellIterator.hasNext()) {
		Cell cell = cellIterator.next();
		int cellindex = cell.getColumnIndex();// creating column index
		switch (cellindex) {
		case 0: // case to set value in the elements of the class
		sf.setLogStamp(cell.getStringCellValue());
		break;
		case 1:
		sf.setTaskName(cell.getStringCellValue());
		break;
		case 2:

		sf.setDestHost(cell.getStringCellValue());
		break;
		case 3:
		sf.setDestPath(cell.getStringCellValue());
		break;
		case 4:
		sf.setDestFile(cell.getStringCellValue());
		break;
		case 5:
		sf.setDestBytes((int)cell.getNumericCellValue());
		break;
		
		default:
		break;
		}
		}
		loglist.add(sf);
		}
		wb.close();
		
		return loglist;
	}

}
