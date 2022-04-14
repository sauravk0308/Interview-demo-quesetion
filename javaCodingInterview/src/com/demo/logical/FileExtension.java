package com.demo.logical;

import java.io.File;
import java.util.Optional;

class FileExtension {

  public static void main(String[] args) {
    File file = new File("Test.java");
    String fName = "Test.java";
    // convert the file name into string
    String fileName = file.toString();

    int index = fileName.lastIndexOf('.');
    if(index > 0) {
      String extension = fileName.substring(index + 1);
      System.out.println("File extension is " + extension);
    }
    
    Optional<String> optString =  getExtensionByStringHandling(fName);
    System.out.println("ext ## "+optString.get());
  }
  
  public static Optional<String> getExtensionByStringHandling(String filename) {
	    return Optional.ofNullable(filename)
	      .filter(f -> f.contains("."))
	      .map(f -> f.substring(filename.lastIndexOf(".") + 1));
	}
}