package javaclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readthefile {

	public static void main(String[] args) {
		 
		File f1 = new File("D:testData.txt");
		try {
			Scanner datareader = new Scanner(f1);
		    while(datareader.hasNextLine()) {
		    	String filedata = datareader.nextLine();
		    	System.out.println(filedata);
		    }
		  datareader.close();
		}
		catch (FileNotFoundException e) {
		    System.out.println("Unexpected Error Occured");
			e.printStackTrace();
		}
		
	}

}
