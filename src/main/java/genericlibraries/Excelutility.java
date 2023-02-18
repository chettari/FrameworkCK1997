
package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains reusable methods to perform operations in excel workbook
 * @author vishnu
 *
 */

public class Excelutility {
	private Workbook wb;
	
	/**
	 * this method is used to initialize excel workbook
	 * @param excelpath
	 */
	public void excelInitialization(String excelpath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelpath);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		try {
			wb = WorkbookFactory.create(fis);
		}catch (EncryptedDocumentException | IOException e) {
		e.printStackTrace();
	}

	}
	
	/**
	 * This method is used to fetch single data from excel
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String fetchDataFromExcel(String SheetName, int rowNum, int cellNum) {
		return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	public List<String> fetchDataFromExcel(String SheetName){
		List<String> datalist = new ArrayList<>();
		org.apache.poi.ss.usermodel.Sheet Sheet = wb.getSheet(SheetName);
		for(int i=0;i<getLastRowNum();i++) {
			String data = Sheet.getRow(i).getCell(1).getStringCellValue();
			datalist.add(data);
		}
		/**
		 * This method is used to fetch multiple data from excel workbook
		 */
		return datalist;
		}
	
	private int getLastRowNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * This method is used close excel workbook
	 */
		public void closeExcel() {
			try {
				wb.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}
