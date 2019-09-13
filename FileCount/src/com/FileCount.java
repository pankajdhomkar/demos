package com;

import java.io.File;

public class FileCount {
	public static void main(String[] args) throws Exception  {

        FileCount n=new FileCount();
        File f=new File("F:\\Test");

        System.out.println("Number of txt files is"+n.listOfFile(f));

    }

    public int listOfFile(File f){
        int count=0;
        int filecn = 0;
        File[] s= f.listFiles();

        if (s != null) {
        	for (final File fileEntry : f.listFiles()){
               if (fileEntry.isDirectory()){
            	   System.out.println("come in dir");
            	   filecn++;
            	   count += listOfFile(fileEntry);
               }else if(fileEntry.getName().endsWith(".txt")){
                   count++;
               }
            }
        	System.out.println("Dir count "+filecn);
            return count;
        } else {
            System.out.println("Invalid directory");
            return 0;
        }
    }
}
