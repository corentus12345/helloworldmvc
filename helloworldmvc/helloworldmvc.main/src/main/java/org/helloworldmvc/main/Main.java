package org.helloworldmvc.main;


import org.helloworldmvc.controller.Controller;
import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		
		View ok = new View();
		Model ok2 = new Model();
		Controller ok1 = new Controller(ok, ok2);
	
		ok1.run();
		

	}

}
