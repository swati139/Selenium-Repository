package oops;


public class callMmethods {

	public static void main(String[] args) {
		Mmethods m=new Mmethods();
		
		m.launchApp("http://facebook.com");
		
		m.elementAvailable("email",true);
		m.elementAvailable("pass",true);
		m.elementAvailable("day",true);
		m.elementAvailable("month",true);
		m.elementAvailable("year",true);
		m.titleLength(30);
		m.containsString("com",true);
		m.startsWith("f",true);
        m.elementsCount("a",53);
        m.elementsCount("img",5);
        m.closeApp();
        m.launchApp("http://yahoomail.com");
        m.elementsCount("a",20);
        m.elementsCount("select",5);
        m.closeApp();
	}


	}


