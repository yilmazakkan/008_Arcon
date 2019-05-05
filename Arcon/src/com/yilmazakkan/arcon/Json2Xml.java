package com.yilmazakkan.arcon;

import org.json.JSONObject;
import org.json.XML;

public class Json2Xml {

	public static void main(String[] args) {
		 StringBuilder jsonObj = new StringBuilder("");
		 jsonObj.append("	{											");
		 jsonObj.append("	    \"employees\": [						");
		 jsonObj.append("	        {									");
		 jsonObj.append("	            \"firstName\": \"John\",		");
		 jsonObj.append("	            \"lastName\": \"Doe\"			");
		 jsonObj.append("	        },									");
		 jsonObj.append("	        {									");	
		 jsonObj.append("	            \"firstName\": \"Anna\",		");
		 jsonObj.append("	            \"lastName\": \"Smith\"			");	
		 jsonObj.append("	        },									");
		 jsonObj.append("	        {									");			
		 jsonObj.append("	            \"firstName\": \"Peter\",		");		
		 jsonObj.append("	            \"lastName\": \"Jones\"			");
		 jsonObj.append("        }										");
		 jsonObj.append("	    ]										");
		 jsonObj.append("	}											");
				
		      	
		JSONObject json = new JSONObject(jsonObj.toString());
		String xml = XML.toString(json);
  		System.out.println("JSON to XML: ");
  		System.out.println(xml);
				
	}
				}

