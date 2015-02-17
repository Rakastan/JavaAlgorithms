package com.anakiou.ja.files;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

public class FilesClass extends JFrame {
	
	static String filePath, parentdirectory;
	static File randomDir, randomFile, randomFile2;
	
	public static void main(String[] args){
		
		randomDir = new File("test");
		
		randomDir.mkdir();
		
		randomFile = new File("file.txt");
		
		randomFile2 = new File("file2.txt");
		
		try{
			randomFile.createNewFile();
			randomFile2.createNewFile();
			
			filePath = randomFile.getCanonicalPath();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		if(randomFile.exists()){
			System.out.println("File exists");
			System.out.println("File readable " + randomFile.canRead());
			System.out.println("File writable " + randomFile.canWrite());
			System.out.println("File location " + filePath);
			System.out.println("File name " + randomFile.getName());
		}
		
	}

}
