package org.test;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperationSample {
	public static void main(String[] args ) throws IOException {
		File f = new File ("d://Add//sub//mul//inheritace.txt");
		File f1 = new File ("d://Add//sub//mul//inheritace1.txt");
		boolean createNewFile = f1.createNewFile();
		System.out.println(createNewFile);
		
         List<String>readLines = FileUtils.readLines(f1);
		 for (String x: readLines) {
		 	System.out.println(x);}	
		 FileUtils.copyFile(f,f1);
		
	}}





       
		
		
		


