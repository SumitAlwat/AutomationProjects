//w.a. TestNG program to create dataprovider.

package testng_Assignment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestNGP004 {

    
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            { "user1", "password1" }, 
            { "user2", "password2" }, 
            { "user3", "password3" }, 
        };
    }

  
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
      
        System.out.println("Trying to login with Username: " + username + " and Password: " + password);
        
        Assert.assertNotNull(username, "Username should not be null or empty");
        Assert.assertNotNull(password, "Password should not be null or empty");

        
    }
}


