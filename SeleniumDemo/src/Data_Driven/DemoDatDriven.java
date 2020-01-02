package Data_Driven;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DemoDatDriven {
	String data;
public void getData() throws IOException
{
	FileInputStream fs=new FileInputStream("D:\\Sel_Softwares\\LoginData.xls");
	//Access Workbook
	HSSFWorkbook wb=new HSSFWorkbook(fs);
	
	//Access sheet from workbook
	HSSFSheet sheet=wb.getSheet("Login");
	
	//Acess Row from Sheet
	int count=sheet.getLastRowNum();
	System.out.println("Total no of rows are:"+count);
	
	HSSFRow row=sheet.getRow(1);
	
	//Fetch data from 0 row
	HSSFCell cell=row.getCell(1);
	data=cell.getStringCellValue();
	System.out.println("data is:"+data);
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DemoDatDriven oo=new DemoDatDriven();
		oo.getData();
	}

}
