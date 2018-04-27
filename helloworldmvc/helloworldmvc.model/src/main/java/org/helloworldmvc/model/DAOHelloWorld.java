package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DAOHelloWorld {
	
	private static String FileName = "/Users/corentin/Desktop/helloworldmvc/helloworldmvc/helloworldmvc.main/target/hello.rtf";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld() {
	
		setInstance(instance);
		readFile();
		
	}

	public static DAOHelloWorld getInstance() {
		return instance;
	}

	private static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}
	
	private void readFile(){
		ArrayList<String> list = new ArrayList<String>();
		
		
		try {
			
			InputStream is = new FileInputStream("FileName");
			InputStreamReader lire = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(lire);
			
			String line;
			
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			
			br.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
}
