package frameworks.hybrid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReader {

	
	public Object[][] fetchData(String filePath) throws FileNotFoundException{
		Object [][] data = null; //{{"A","1"},{"B","2"},{"C","3"}};
		
		System.out.println("File to be read is : " + filePath);
		File dataFile = new File(filePath);
		FileInputStream f = new FileInputStream(dataFile);
		
		try {
			XSSFWorkbook wb = new XSSFWorkbook(f);
			XSSFSheet sheet = wb.getSheetAt(0);
			int rows = sheet.getLastRowNum();
			System.out.println("rows in sheet = "+rows);
			data = new Object[rows+1][2];
			for(int i=0; i<= rows; i++){
				String uname = sheet.getRow(i).getCell(0).getStringCellValue();
				String passwd = sheet.getRow(i).getCell(1).getStringCellValue();
				data[i][0] = uname;
				data[i][1] = passwd;
				System.out.println("Username is : " + data[i][0]);
				System.out.println("Password is : " + data[i][1]);
				
			}
			
			
			wb.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Read excel file
		
		return data;
		
	}
}
