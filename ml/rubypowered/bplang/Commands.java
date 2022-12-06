package ml.rubypowered.bplang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Commands{

  protected static String[] commands = {"say","close"};
  
  public static String[] getCommands(){
    return commands;
  }
  public void close(){
    System.out.println("Closing...");
    System.exit(0);
  }
  public void say(String words){
    System.out.println(words);
  }
  
  public static void beginParsing(String programFile) throws FileNotFoundException {

	    FileInputStream fileInput = new FileInputStream(new File(programFile));
	    Scanner fileReader = new Scanner(fileInput);
	    Scanner consoleScan = new Scanner(System.in);
	    String[] commands = Commands.getCommands();
	    
	    int waitTime = 0;
	    
	    while (fileReader.hasNext()) {
	      String[] words = fileReader.nextLine().split(" ");
	      // String command = fileReader.next();
	      // System.out.println(command);

	      if (words[0].equalsIgnoreCase("say")) {
	        System.out.println("\n");
	        for (int i = 0; i < words.length; i++) {
	          if (i == 0) {
	            // Nothing because the command is whats stored in words[0] although this index
	            // will be quite usefull later with parameters
	          } else {
	            System.out.print(words[i] + " ");
	          }
	        }
	      } else if (words[0].equalsIgnoreCase("call")) {
	    	String[] stuff = {words[0]};
	        Main.main(stuff);
	      } else if (words[0].equalsIgnoreCase("compare-equal")) {
	        System.out.println("");
	        System.out.println(Integer.parseInt(words[1]) == Integer.parseInt(words[2]));
	      } else if (words[0].equalsIgnoreCase("compare-1-less-than-2")) {
	        System.out.println("");
	        System.out.println(Integer.parseInt(words[1]) < Integer.parseInt(words[2]));
	      } else if (words[0].equalsIgnoreCase("compare-2-less-than-1")) {
	        System.out.println("");
	        System.out.println(Integer.parseInt(words[1]) > Integer.parseInt(words[2]));
	      } else if (words[0].equalsIgnoreCase("say-err")){
	        System.out.println("\n");
	        for (int i = 0; i < words.length; i++) {
	          if (i == 0) {
	            // Nothing because the command is whats stored in words[0] although this index
	            // will be quite usefull later with parameters
	          } else {
	            System.err.print((words[i] + " "));
	          }
	        }
	      }else if (words[0].equalsIgnoreCase("wait")){
	        try{
	          Thread.sleep(Integer.parseInt(words[1]));
	        }catch(InterruptedException e1){
	          e1.printStackTrace();
	        }
	      }else if (words[0].equalsIgnoreCase("close")) {
	    	  if(fileReader.hasNextLine()) {
	    		  
	    	  }else {
	    		  
	    	  }
	      }else if (words[0] .equalsIgnoreCase("waitCommand")) {
	    	  waitTime = Integer.parseInt(words[1]);
	      }else {
	    	  System.out.println("Command not found: err 1. See B+ docs");
	      }
	      
	      try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	    }	  
	    
	    while(true) {
	    	//This is started to keep the program alive, can be avoided if the program is closed properly
	    }
	    
}
  
}