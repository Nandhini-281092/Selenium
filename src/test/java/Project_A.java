

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;

public class Project_A {
	
public static void main(String args[]) throws Throwable {
		
		File f = new File("C:\\Users\\admin\\Desktop\\Sheet1.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c= r.getCell(j);
				int cellType = c.getCellType();
				 if(cellType==1) {
					                   //1 - String 0 - number&date - return
				 String Value = c.getStringCellValue();
				 System.out.println(Value);
				 
				 
				 }
				 
				 else if(cellType==0) {
					 if(DateUtil.isCellDateFormatted(c)) {
						 Date d=c.getDateCellValue();
						 SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yy");
						 String value = sd.format(d);
						 System.out.println(value);
						 
					 }
					 else {
						 double d= c.getNumericCellValue();
						 long l =(long)d;
						 System.out.println(l);

					 }
				 }
				 
				 
				
			}
			
		}
		
}	

}
