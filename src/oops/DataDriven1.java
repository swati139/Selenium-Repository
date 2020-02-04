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

public class DataDriven1 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fO=new FileInputStream("C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\Datad.xls");
        Workbook wO=Workbook.getWorkbook(fO);
        Sheet sO=wO.getSheet("Sheet1");
        Sheet sO1=wO.getSheet("Sheet2");
        System.out.println(sO.getCell(0,0).getContents());
        System.out.println(sO1.getCell(0,0).getContents());
        String a=sO.getCell(0,0).getContents();
        //System.out.println(a);
        String b=sO1.getCell(0,0).getContents();
        
        fO.close();
        
        FileReader f=new FileReader("C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\dd.txt");
		
		BufferedReader bR=new BufferedReader(f);
		
		System.out.println(bR.readLine());
		//String c=bR.readLine();
		String x;
		while ((x=bR.readLine()) != null)
		{
		System.out.println(x);
		}
		
	    Thread.sleep(1000);
	    		
	    FileOutputStream fileObj1=new FileOutputStream("C:\\Users\\MaX-DcORE\\Desktop\\SeleniumWD\\Datad.xls");
		
		WritableWorkbook wwb=Workbook.createWorkbook(fileObj1);
		
		WritableSheet ws=wwb.createSheet("Sheet3", 3); 
		Label l=new Label(0, 0, a +" "+ b + x ) ;
		ws.addCell(l);
		wwb.write();
		wwb.close();
        
        
      
        
	}

}
