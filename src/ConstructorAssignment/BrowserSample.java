package ConstructorAssignment;

import java.util.ArrayList;

public class BrowserSample {

	public static void main(String[] args) {
		
		ArrayList<String> chromePluginList = new ArrayList<String>();
		chromePluginList.add("Netscape");
		chromePluginList.add("Yoast");
		chromePluginList.add("Akismet");
		Browser chromeBrowser = new Browser("chrome","Google",87.0,chromePluginList);
		System.out.println(chromeBrowser.getbrowserName()+" "+chromeBrowser.getvenderName()+" "+chromeBrowser.getcurentVersion()+" "+chromeBrowser.getlistOfPlugins());
	
	
	   ArrayList<String> firefoxPluginList = new ArrayList<String>();
	   firefoxPluginList.add("woocom");
	   firefoxPluginList.add("ContactForm7");
	   Browser firefoxBrowser = new Browser("firefox",84,firefoxPluginList);
	   System.out.println(firefoxBrowser.getbrowserName()+" "+firefoxBrowser.getcurentVersion()+" "+firefoxBrowser.getlistOfPlugins());
	

	

}
}