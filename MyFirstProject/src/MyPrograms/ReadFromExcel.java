package MyPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException
	{
		FileInputStream f = new FileInputStream("‪C:\\Users\\Krishna\\Documents\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(1);
		String value = c.getStringCellValue();
		System.out.println(value);
	}
}
