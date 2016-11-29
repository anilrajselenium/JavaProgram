package com.csrk.excercises;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class Urlsplit {
    public static void main(String[] args)  {
    	
    	String URL = "http://24.106.206.2:10080/autotools/login.html";
    	 
    	try {
			URL aURL = new URL(URL);
	        System.out.println("protocol = " + aURL.getProtocol());
	        System.out.println("authority = " + aURL.getAuthority());
	        System.out.println("host = " + aURL.getHost());
	        System.out.println("port = " + aURL.getPort());
	        System.out.println("path = " + aURL.getPath());
	        System.out.println("query = " + aURL.getQuery());
	        System.out.println("filename = " + aURL.getFile());
	        System.out.println("ref = " + aURL.getRef());
	        System.out.println("ref = " + aURL.openConnection());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        String [] urlSplits = URL.split("/");
        for (int i = 0; i < urlSplits.length; i++) {
			System.out.println("The split at: "+i+" is: "+urlSplits[i]);
		}
        
        String [] ipSplit = urlSplits[2].split(":");
        
        if(ipSplit.length==2){
        	System.out.println("The ip address is: "+ipSplit[0]);
        	System.out.println("The port number is: "+ipSplit[1]);
        }else if(ipSplit.length==1){
        	System.out.println("The site address is: "+ipSplit[0]);
        }
        
        
    }
}