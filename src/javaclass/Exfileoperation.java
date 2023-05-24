package javaclass;

import java.io.File;


public class Exfileoperation {

	public static void main(String[] args) {
		
		File f1 = new File("D:testData.txt");
		
		if(f1.exists())	
		{
			System.out.println("The Name of the file is:"  + f1.getName());
			System.out.println("The absoulte path of the file is:"  + f1.getAbsolutePath());
			System.out.println("Is the file is writable:"  + f1.canWrite());
			System.out.println("Is the file is Readable:"  + f1.canRead());
			System.out.println("The Size of the file is:"  + f1.length());
		}
		else {
			System.out.println("The File does not exits");
			
		}
	}

}
      