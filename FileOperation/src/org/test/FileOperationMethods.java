package org.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperationMethods {
	public static void main(String[] args ) throws IOException {
		File f = new File ("d://Add//sub//mul");
		String[] list= f.list();
		  for(String x:list) {
				System.out.println(x);}
		  
		//List out the exact file location  
		File[] listFiles = f.listFiles();
			for(File x:listFiles) {
		       System.out.println(x);}
			
		//concat,override,read the content	
			FileUtils.write(f,"java selenium");
	     	FileUtils.write(f,"\t python program",true);
	    	FileUtils.write(f, "Manual tessting",false);
				List<String>readLines = FileUtils.readLines(f);
			       for (String x: readLines) {
			        	System.out.println(x);}
				

}}
