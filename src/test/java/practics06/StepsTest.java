package practics06;

import org.testng.annotations.Test;

import io.qameta.allure.Step;

public class StepsTest {
	
	@Test
	public void testWithSteps() {
		openUrl("http://google.com");
		login("admin", "12345");
		verifyUserIsLoggedIn();
	}
	
	@Step("Open {url} url.")
	private void openUrl(String url) {
		System.out.println("Opening url " + url);
	}
	
	@Step("Loging in with username: {username} and password: {password}.")
	private void login(String username, String password) {
		System.out.printf("Loging in with username: %s and password: %s", username, password);
	}
	
	@Step
	private void verifyUserIsLoggedIn() {
		System.out.println("User is logged in");
	}
}
