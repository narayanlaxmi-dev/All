package io_programming;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.LineNumberReader;

public class LinenumberInputMain {
	

	

	    public static void main(String[] args) {
	        String filePath = "./src/files/greetings.txt"; // Path to your text file
	        
	        try (LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader(filePath)))) {
	            String line;
	            
	            while ((line = reader.readLine()) != null) {
	                int lineNumber = reader.getLineNumber();
	                
	                // Print only odd-numbered lines
	                if (lineNumber % 2 != 0) {
	                    System.out.println("Line " + lineNumber + ": " + line);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();  // Handle the exception
	        }
	    }
	}


