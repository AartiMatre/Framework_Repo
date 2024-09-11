package Pac1;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test
	public void createContactTest()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser", "chrome");
		String USERNAME = System.getProperty("un");
		String PASSWORD = System.getProperty("pw");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createContactTest");
	}
	@Test
	public void modifyContactTest()
	{
		System.out.println("execute modifyContactTest");
	}
}
