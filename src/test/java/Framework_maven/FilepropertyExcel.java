package Framework_maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FilepropertyExcel {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new EdgeDriver();
		FileInputStream fis=new FileInputStream("./commondata10.properties.txt.txt");
    
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url1");
		driver.get(URL);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//Fetching data from Excel
		//connecting the path
		FileInputStream fes=new FileInputStream("Testdata.xlsx");
		
		//load the data
		Workbook book=WorkbookFactory.create(fes);
		
		//sheet
		Sheet sheet=book.getSheet("Flipkart");
		
		//row
		Row row=sheet.getRow(3);
		
		//cell
		Cell cell = row.getCell(1);
		
		String Exceldata=cell.getStringCellValue();
		driver.findElement(By.name("q")).sendKeys(Exceldata);
	}

}
