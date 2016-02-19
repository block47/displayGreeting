
public class TestMain {

	public static void main(String[] args) {
		
		GitWelcomeMessage gitWelcomeMsg = new GitWelcomeMessage();
		
		displayGitGreeting();
		gitWelcomeMsg.displayGreeting();
		
	}
	
	public static void displayGitGreeting(){
		System.out.println("Git Test Main class displaying greeting");
	}
	
}
