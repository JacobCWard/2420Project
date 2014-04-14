package bstDatabase;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Utilities {
	public static String[] fileToStringArray(String fileName) throws IOException{
		String data = fileToString(fileName);
		String str = cleanText(data);
		String [] wordArray = str.split("\\n");
		
		return wordArray;
	}
	
	public static String fileToString (String fileName) throws IOException{
		String result = "";
		try {
			FileInputStream file = new FileInputStream(fileName);
			byte[] b = new byte[file.available()];
			file.read(b);
			file.close();
			result = new String (b);
		} catch (FileNotFoundException e) {
			System.out.println("oops");
		}
		return result;
		
	}
	
	public static String cleanText(String s){
		s = s.replaceAll("\\r","");
		
		return s;
		
	}
	
	public static long runtime(long startTime){
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
		
		// use next line at beginning of test in external method
		// long startTime = System.currentTimeMillis();
	}
	
	public static String [] getZipInfo(int zip){
		String [] a = new String[2];
        try{
        	URL zipURL = new   URL("http://zip.elevenbasetwo.com/v2/US/"+zip);
            URLConnection zu = zipURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(zu.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null){
            	String [] b = inputLine.split("\"");
            	a[0]=b[3];
            	a[1]=b[7];
            }
            in.close();
            return a;
        }
        catch(Exception e){

        }
        return a;
    }

}
