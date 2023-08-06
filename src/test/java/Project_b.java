


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;

public class Project_b {
	
public static void main(String args[]) throws Throwable {
		
		File f = new File("C:\\Users\\admin\\Desktop\\Sheet_Write.xlsx");
		//FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet s= w.createSheet("ExcelWrite");
		Row r = s.createRow(0);
		for(int i=0;i<5;i++) {
			Cell c = r.createCell(i);
			if(i==1) {
			c.setCellValue("Nandhini");
			}
			else if(i==2){
				c.setCellValue("Ragu");
				
			}
			else {
				c.setCellValue("Jashmi");
			}
		}
		
		FileOutputStream f2 = new FileOutputStream(f);
		w.write(f2);
		f2.close();
		
}
}

