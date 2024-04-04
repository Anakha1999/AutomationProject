package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PinterestUtilities {
	public static String getCellValue(String xl,String sheet,int r,int c)
	{
		try
		{
			FileInputStream f1=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(f1);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
		public static int getRowCount(String xl,String sheet)
		{
			try
			{
				FileInputStream f1=new FileInputStream(xl);
				XSSFWorkbook wb=new XSSFWorkbook(f1);
				return wb.getSheet(sheet).getLastRowNum();
			}
			catch(Exception e)
			{
				return 0;
				
			
		}
	
		
	}


}
