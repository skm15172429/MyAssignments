package week1.day2;

public class Browser {
	public void launchBrowser(String browserName) {
		
		System.out.println("Browser launched successfully");
		
		
	}
	public void loadURL() {
		
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		
		Browser object= new Browser();
		object.launchBrowser(null);
		object.loadURL();
	}

}
