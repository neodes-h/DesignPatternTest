package main;

import java.io.FileNotFoundException;
import java.io.IOException;

import pagemaker.PageMaker;

public class testFacade {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		PageMaker.makeWelcomePage("hao@uwindsor.ca", "welcome.html");
		PageMaker.makeLinkPage("linkpage.html");
	}

}
