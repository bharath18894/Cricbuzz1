package aut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Cricbuzz_Excel {
	public static String excelpath="C:\\Users\\MANOJKUMAR RAMASAMY\\Desktop\\sample1.xlsx";
	
	public static File excel;
	public static FileInputStream fin;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static FileOutputStream fout;
	public static XSSFRow Row;
	public static XSSFCell Cell;
	public static XSSFFont font;
	public static XSSFCellStyle style;
	public static int n=0;
	public static boolean foe=false;
	
	
	
	public Cricbuzz_Excel() {
		excel=new File(excelpath);
		
		try {
			fin=new FileInputStream(excel);
			wb=new XSSFWorkbook(fin);
			try {
				int index = 0;
				sheet=wb.getSheet("CricBuzz");
				if(sheet != null)
				{
					index = wb.getSheetIndex(sheet);
				    wb.removeSheetAt(index);
				}
			}
			finally {
			sheet=wb.createSheet("CricBuzz");
			}
			
			//sheet.createRow(0).createCell(0).setCellValue("working");

		} catch (Exception e) {
			System.out.println("excelopen error"+e.getMessage());
			foe=true;
			ScorecardPage.driver.quit();
		}
	}
	public static void excel_TitleMatch(String title) {
		Row=sheet.createRow(0);
		Cell=Row.createCell(0);
		style=wb.createCellStyle();
		font=wb.createFont();
		font.setBold(true);
		style.setFont(font);
		
		Cell.setCellStyle(style);
		Cell.setCellValue(title);
	}
	public static void excel_scrstatus(String scrstatustxt) {
		//int rownum=sheet.getLastRowNum()+1;
		Row=sheet.createRow(1);
		Cell=Row.createCell(0);
		font=wb.createFont();
		style=wb.createCellStyle();
		if(ScorecardPage.color.contains("red")) {
			font.setColor(HSSFColor.HSSFColorPredefined.RED.getIndex());
		}
		else{
			font.setColor(HSSFColor.HSSFColorPredefined.BLUE.getIndex());
		}
		Cell.setCellValue(scrstatustxt);
		style.setFont(font);
		Cell.setCellStyle(style);	
	}
	
	public static void excel_Ing1Head(String[] ing1_Htxt) {
		int rownum=sheet.getLastRowNum()+1;
		Row=sheet.createRow(rownum);
		font=wb.createFont();
		style=wb.createCellStyle();
		font.setColor(HSSFColor.HSSFColorPredefined.WHITE.getIndex());
		style.setFillForegroundColor(IndexedColors.BLACK.getIndex());
	    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    style.setFont(font);
		for(int i=0;i<ing1_Htxt.length;i++) {
			Cell=Row.createCell(i);
			Cell.setCellValue(ing1_Htxt[i]);
			Cell.setCellStyle(style);	
		}
		//sheet.autoSizeColumn(0);
	}
	public static void excel_Ing1titletxt(String[] ing1_Titletxt) {
		int rownum=sheet.getLastRowNum()+1;
		Row=sheet.createRow(rownum);
		
		for(int i=0;i<ing1_Titletxt.length;i++) {
			if((i==2&&ing1_Titletxt.length==7)||(i==4&&ing1_Titletxt.length==8)) {
				font=wb.createFont();
				style=wb.createCellStyle();
				font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
				style.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
			    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			    style.setFont(font);
				font.setBold(true);
				style.setFont(font);
				Cell=Row.createCell(i);
				Cell.setCellValue(ing1_Titletxt[i]);
				Cell.setCellStyle(style);
			}
			else {
				font=wb.createFont();
				style=wb.createCellStyle();
				font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
				style.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
			    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			    
				//font.setBold(true);
				style.setFont(font);
				Cell=Row.createCell(i);
				Cell.setCellValue(ing1_Titletxt[i]);
				Cell.setCellStyle(style);
			}
			
			}
		
	}
	
	public static void excel_Ing1BATplTxt(List<String[]> ing1_playertxt) {
		for(int i=0;i<ing1_playertxt.size();i++) {
			int rownum=sheet.getLastRowNum()+1;
			Row=sheet.createRow(rownum);
			String[] temp=ing1_playertxt.get(i);
			for(int j=0;j<temp.length;j++) {
				if((j==0&&temp.length==7)||(j==1&&temp.length==2)||(j==0&&temp.length==8)) {
					font=wb.createFont();
					style=wb.createCellStyle();
					style.setBorderBottom(BorderStyle.THIN);  
		            style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
					font.setColor(HSSFColor.HSSFColorPredefined.BLUE.getIndex());
					font.setBold(false);
					style.setFont(font);
					Cell=Row.createCell(j);
					Cell.setCellValue(temp[j]);
					Cell.setCellStyle(style);
				}
				else if((j==2&&temp.length==7)||(j==4&&temp.length==8))
				{
					font=wb.createFont();
				style=wb.createCellStyle();
				style.setBorderBottom(BorderStyle.THIN);  
	            style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
				font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
				font.setBold(true);
				style.setFont(font);
				Cell=Row.createCell(j);
				Cell.setCellValue(temp[j]);
				Cell.setCellStyle(style);
				
			}
			else if(j==1&temp.length==3) {
				font=wb.createFont();
				style=wb.createCellStyle();
				style.setBorderBottom(BorderStyle.THIN);  
	            style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
				font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
				font.setBold(true);
				style.setFont(font);
				Cell=Row.createCell(j);
				Cell.setCellValue(temp[j]);
				Cell.setCellStyle(style);
			}
			
			else {
				font=wb.createFont();
				style=wb.createCellStyle();
				style.setBorderBottom(BorderStyle.THIN);  
	            style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
				font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
				font.setBold(false);
				style.setFont(font);
				Cell=Row.createCell(j);
				Cell.setCellValue(temp[j]);
				Cell.setCellStyle(style);
				
			}
				
			}
			
			
		}
	}
	public static void excel_Ing1FOWHead(String fow) {
		 int rownum=sheet.getLastRowNum()+1;
		 Row=sheet.createRow(rownum);
		
		for(int i=0;i<8;i++) {
			style=wb.createCellStyle();
			style.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
		    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		    Cell=Row.createCell(i);
		    if(i==0) {
				Cell.setCellValue(fow);	
		    }
		    Cell.setCellStyle(style);
		}
	}
	public static void excel_Ing1FOWtxt(String fowtxt) {
		int rownum=sheet.getLastRowNum()+1;
		Row=sheet.createRow(rownum);
		Cell=Row.createCell(0);
		Cell.setCellValue(fowtxt);
	}
	
	public static void excel_PPtxt(String[] pptxt) {
		int rownum=sheet.getLastRowNum()+1;
		Row=sheet.createRow(rownum);
		for(int i=0;i<pptxt.length;i++) {
		Cell=Row.createCell(i);
		Cell.setCellValue(pptxt[i]);
		}
	}
	
	
	public static void excel_close() {
		try {
			sheet.setColumnWidth(0, 10000);
			sheet.setColumnWidth(1, 10000);
			sheet.setColumnWidth(6, 4000);
			sheet.setColumnBreak(8);
			//sheet.autoSizeColumn(1);
			fout=new FileOutputStream(excel);
			wb.write(fout);
			wb.close();
		} 
		catch (Exception e) {
			System.out.println("file output error");
			foe=true;
			ScorecardPage.driver.quit();
		} 
	}

}
