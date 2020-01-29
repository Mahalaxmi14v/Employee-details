package org.lang;

public class stateDetails  {
	public void southIndia()
	{
		System.out.println("Tamil speaks in southindia");
	}
	public void nothIndia()
	{
		System.out.println("hindi speaks in northindia");
	}
	public static void main (String[] args) {
		StateDetails sd=new StateDetails();
		sd.southindia();
		sd.northindia();
		LanguageInfo li=new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
	}

}
