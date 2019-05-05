package com.yilmazakkan.arcon;

import org.json.JSONObject;
import org.json.XML;

public class Xml2Json {

	private static final int Deneme = 4;
	public static void main(String[] args) {
		
		
		String xmlString ="<dependency><groupId>org.json</groupId><artifactId>json</artifactId><version>453453</version></dependency>";
		JSONObject jsonObj = XML.toJSONObject("");
		String deneme =jsonObj.toString(Deneme);
		System.out.println(deneme);
	}

}
