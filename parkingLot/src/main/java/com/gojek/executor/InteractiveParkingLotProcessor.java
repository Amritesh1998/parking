package com.gojek.executor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InteractiveParkingLotProcessor extends AbstractProcessor {
	
	public void process() throws Exception {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        
        
        while(true) {
        	String inputString = bufferRead.readLine();
        	validateAndProcess(inputString);
        }
	}

	

}
