package IntegrationTests.helpers.base;

/**
 * contains all methods which are present in AndroidLoginHelper and IOSLoginHelper.
 * Methods are abstract here and defined in specific class (AndroidLoginHelper and IOSLoginHelper) 
 */
public abstract class LoginHelper {



	public abstract void verifyLoginScenario(String userName, String password)
			throws InterruptedException;


}