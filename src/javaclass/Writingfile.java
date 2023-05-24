package javaclass;

import java.io.FileWriter;
import java.io.IOException;

public class Writingfile {

	public static void main(String[] args) {
		
		try {
			FileWriter f1 = new FileWriter("D:testData.txt");
		    f1.write("The content is empty");
		    f1.close();
		    System.out.println("Content is sucessfully write to the file");
		
		}
		catch (IOException e)
		{
			System.out.println("Unexpected Error Occured");
			e.printStackTrace();
		}
		

	}

}
