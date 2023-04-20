package MyPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis =new FileInputStream("‪‪C:\\Users\\Krishna\\Documents\\Book1.xlsx");
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet= xsf.getSheetAt(1);
		String entry1 = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(entry1);
		xsf.close();
		}
}
