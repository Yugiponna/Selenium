package yugi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {

	public String getExcelData(String SheetName,int RowNo,int CellNo) {
		String retval=null;
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\gui\\Desktop\\yugi\\SheetExcel.xlsx");
			
			Workbook w=WorkbookFactory.create(fis);
			Sheet s=w.getSheet(SheetName);
			Row r=s.getRow(RowNo);
			Cell c=r.getCell(CellNo);
			retval =	c.getStringCellValue();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retval;
		
			}public int getLastRowNum(String SheetName) {
				int retval=0;
				try {
					FileInputStream fis=new FileInputStream("C:\\Users\\gui\\Desktop\\yugi\\SheetExcel.xlsx");
					
					Workbook w=WorkbookFactory.create(fis);
					Sheet s=w.getSheet(SheetName);
				retval=	s.getLastRowNum();
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (EncryptedDocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return retval;
				
					}
	}