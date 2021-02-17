public class RunApp {
	public static void main(String[] args) throws Exception {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe https://www.amazon.in/");
	}
}