package ml.rubypowered.bplang;

import java.io.FileNotFoundException;

class Main {

  public static void main(String[] args) {
	  
	  try {
		  if(args[0].contains(".bpe") || args[0].contains(".rde") || args[0].contains(".zip")) {
			  SystemFunct.decompAndParse(args[0]);
		  }else {
				Commands.beginParsing(args[0]);
		  }  
	  }catch(ArrayIndexOutOfBoundsException | FileNotFoundException e) {
		  System.out.println("Please specify and input file or app");
		  e.printStackTrace();
		  while(true) {}
	  }
	  
  }	  
}