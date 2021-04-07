package com.aso.qe.test.util.ios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CommonUtil {
	 @SuppressWarnings("unchecked")
	    public static void main(String[] args) throws FileNotFoundException 
	    {
	        //JSON parser object to parse read file
	        JSONParser jsonParser = new JSONParser();
	      //  FileReader reader = new FileReader("\\src\\test\\resources\\TestData\\TestDataIOS\\categoryData.json");
	     String s1 =   "categoryData"+".json";
	      String s=   System.getProperty("user.dir")+ "/src/test/resources/TestData/TestDataIOS/";
	      
	         s =s+s1;
	         FileReader reader = new FileReader(s);
	        try 
	        {
	            //Read JSON file
	            Object obj = jsonParser.parse(reader);
	 
	            JSONArray categoryList = (JSONArray) obj;
	            System.out.println(categoryList);	
	             
	            //Iterate over employee array
	            categoryList.forEach( catg -> categoryObject( (JSONObject) catg ) );
	 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();}
	        }
	        
	        
	        private static void categoryObject(JSONObject category) 
	        {
	            //Get employee object within list
	            JSONObject categoryObject = (JSONObject) category.get("category");
	             
	            //Get employee first name
	            String MenuL1 = (String) categoryObject.get("MenuL1");    
	            System.out.println(MenuL1);
	             
	            //Get employee last name
	            String SubMenuL2 = (String) categoryObject.get("SubMenuL2");  
	            System.out.println(SubMenuL2);
	             
	            //Get employee website name
	            String SubMenuL3 = (String) categoryObject.get("SubMenuL3");    
	            System.out.println(SubMenuL3);
	        }       
	

}
