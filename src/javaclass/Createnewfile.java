package javaclass;

import java.io.File;
import java.io.IOException;


public class Createnewfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("D:testData.txt");
		try {
			
			if (f1.createNewFile())
			{  
			    System.out.println("File " + f1.getName() + " is created successfully.");  
            }
			else
			{  
			    System.out.println("File is already exist in the directory.");  
            }
		} 
		catch (IOException e) {
	
			e.printStackTrace();
		}  
	}

}
