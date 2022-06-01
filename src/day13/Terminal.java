package day13;

public class Terminal {
	public static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("windows");
	
	public static void main(String[] args) {
		String terminalToUse = IS_WINDOWS ? "Win: GitBash Terminal" : "MAC: Regular Terminal";
		System.out.println(terminalToUse);
	}
}
