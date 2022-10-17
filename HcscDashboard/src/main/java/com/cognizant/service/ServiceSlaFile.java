package com.cognizant.service;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.cognizant.model.SlaFile;

@Service
public class ServiceSlaFile  {
	
	public List<SlaFile> ExcelRead() throws IOException
	{
		List<SlaFile> slaList = new ArrayList<SlaFile>();
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\Downloads\\sla fullfile.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);//creating workbook
		XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve data from the sheet
		Iterator<Row> itr = sheet.iterator(); // iterating over excel file
		int rowNum = 0;
		while (itr.hasNext()) {
		SlaFile sf = new SlaFile();
		Row row = itr.next();
		if (rowNum == 0) {
		rowNum++;
		continue;
		}
		Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
		while (cellIterator.hasNext()) {
		Cell cell = cellIterator.next();
		int cellindex = cell.getColumnIndex();// creating column index
		switch (cellindex) {
		case 0: // case to set value in the elements of the class
		sf.setDataExchangeID((int)cell.getNumericCellValue());

		break;
		case 1:
		sf.setSlaState(cell.getStringCellValue());
		break;
		case 2:

		sf.setPlanName(cell.getStringCellValue());
		break;
		case 3:
		sf.setPriority(cell.getStringCellValue());
		break;
		case 4:
		sf.setLob(cell.getStringCellValue());
		break;
		case 5:
		sf.setFileName(cell.getStringCellValue());
		break;
		case 6:
		sf.setFileconvention(cell.getStringCellValue());
		break;
		case 7:
		sf.setHcscSentinalControl(cell.getStringCellValue());
		break;
		case 8:
		sf.setSearchKey(cell.getStringCellValue());
		break;
		case 9:
		sf.setFileDetailedDescription(cell.getStringCellValue());
		break;
		case 10:
		sf.setFileNamePattern(cell.getStringCellValue());
		break;
		case 11:
		sf.setActiveBatchId((int)cell.getNumericCellValue());
		break;
		case 12:
		sf.setActiveBatchProccess(cell.getStringCellValue());
		break;
		case 13:
		sf.setSlaFrequency(cell.getStringCellValue());
		break;
		case 14:
		sf.setSlaDay(cell.getStringCellValue());
		break;
		case 15:
		sf.setSlaTime(cell.getStringCellValue());
		break;
		case 16:
		sf.setComments(cell.getStringCellValue());
		break;
		case 17:
		sf.setWeekDaySchedule(cell.getStringCellValue());
		break;

		default:
		break;
		}
		}
		slaList.add(sf);
		}
		wb.close();
		return slaList;
	}

}

