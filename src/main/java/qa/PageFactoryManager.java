package qa;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.SearchPage;

public class PageFactoryManager {
	
	 private static HomePage homepage;
	    private static SearchPage searchpage;
	   
		public static HomePage getHomePage(WebDriver driver) {
			/**
			 * Using Ternary Operator: Checking for storePage as null.
			 * 
			 * If it is null, then, create new object and return
			 *
			 * If it is not null, then, return storePage
			 */
			
			if(homepage ==null)
			{
				return new HomePage(driver);
			}
			else
			{
				return homepage;
			}
			
		}

		public static SearchPage getSearchPage(WebDriver driver) {
			if(searchpage ==null)
			{
				return new SearchPage(driver);
			}
			else
			{
				return searchpage;
			}
		}


}
