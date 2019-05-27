package genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excelLib {
	String path="D:\\EclipseWorkSpace\\actitimepROJECT\\TESTdata\\TESTDATA.xlsx";
	@Test
	public String getdata(String sheetname,int rownum,int cellnum) throws Throwable{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row rw=sh.getRow(rownum);
		String data=rw.getCell(cellnum).getStringCellValue();
		return data;
	}
	@Test
	public void setdata(String sheetname,int rownum,int cellnum,String set) throws Throwable{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row rw=sh.getRow(rownum);
		Cell c=rw.createCell(cellnum);
		c.setCellValue(set);
		
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
	}

}
