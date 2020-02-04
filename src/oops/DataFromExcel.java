package oops;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DataFromExcel {

	public static void main(String[] args)throws Exception {
				
		FileInputStream fileObj=new FileInputStream("C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\Test.xls");
		
		Workbook workbook_Obj=Workbook.getWorkbook(fileObj);
		
		Sheet Sheet_Obj=workbook_Obj.getSheet("Sheet1");
		Sheet Sheet_Obj1=workbook_Obj.getSheet("Sheet2");
		
		System.out.println(Sheet_Obj.getCell(0,1).getContents());
		System.out.println(Sheet_Obj1.getCell(0,0).getContents());
		//String a=Sheet_Obj.getCell(0,1).getContents();
		//System.out.println(a);
		
		/*FileReader f=new FileReader("C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\dd.txt");
		
		BufferedReader b=new BufferedReader(f);
		
		System.out.println(b.readLine());
		
		String d=b.readLine();
        FileOutputStream fileObj1=new FileOutputStream("C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\Test.xls");
		
		WritableWorkbook wwb=Workbook.createWorkbook(fileObj1);
		
		WritableSheet ws=wwb.createSheet("Sheet3",3);
		
		String a=Sheet_Obj.getCell(0,1).getContents();
		String c=Sheet_Obj1.getCell(0,1).getContents();  
		Label l=new Label(0, 0, a + c + d);  
		ws.addCell(l);
		wwb.write();
		*/
		
		
		
				//System.out.println(Sheet_Obj.getCell(2,0).getContents());
		
		
	}

}
