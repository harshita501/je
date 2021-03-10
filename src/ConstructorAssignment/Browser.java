package ConstructorAssignment;

import java.util.ArrayList;

public class Browser {
	private String browserName;
	private String venderName;
	private double currentVersion;
	private ArrayList<String> listOfPlugins = new ArrayList<String>();
	
	
	
	public Browser(String browserName, String venderName, double currentVersion, ArrayList<String> listOfPlugins) {
		this.browserName = browserName;
		this.venderName = venderName;
		this.currentVersion = currentVersion;
		this.listOfPlugins = listOfPlugins;
	}
	public Browser(String browserName, double currentVersion, ArrayList<String> listOfPlugins) {
		this.browserName = browserName;
		this.currentVersion = currentVersion;
		this.listOfPlugins = listOfPlugins;
	}
	public Browser(String browserName, ArrayList<String> listOfPlugins ) {
		this.browserName = browserName;
		this.listOfPlugins = listOfPlugins;
	}
	
	
	public String getbrowserName() {
		return this.browserName;
	}
	public String getvenderName() {
		return this.venderName;
	}
	public double getcurentVersion() {
		return this.currentVersion;
	}
	public ArrayList<String> getlistOfPlugins(){
		return this.listOfPlugins;
	}
	

}
