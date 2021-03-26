package com.Project.org.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ddr {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\USER\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fi=new FileInputStream(f);
       XSSFWorkbook g = new XSSFWorkbook(fi);
		Sheet s=g.getSheetAt(0);
		
		for (int r = 0; r < s.getPhysicalNumberOfRows(); r++) {
		Row ro = s.getRow(r);
		
			for(int c = 0; c < ro.getPhysicalNumberOfCells(); c++) {
				Cell cell = ro.getCell(c);
				
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(cellType.STRING)){
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if(cellType.equals(cellType.NUMERIC))
				{
						double numericCellValue = cell.getNumericCellValue();
						String valueOf = String.valueOf(numericCellValue);
						System.out.println(valueOf);
				}
			
			
		}
		}
		
		
		

	
	
	  Sheet createSheet = g.createSheet("kiran data"); 
	  Row createRow =createSheet.createRow(0); 
	  Cell createCell = createRow.createCell(0);
	  createCell.setCellValue("Vijay");
	  Row createRow1 = createSheet.createRow(1);
	  Cell createCell2 = createRow1.createCell(1);
	  createCell2.setCellValue("GOPI");
	  FileOutputStream fil = new FileOutputStream(f);
	  g.write(fil);
	 g.close();
	 System.out.println("Success1");
	}
	
}
