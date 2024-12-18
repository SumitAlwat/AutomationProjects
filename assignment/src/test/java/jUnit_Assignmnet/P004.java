//W.a. junit program to use parameterized demo with multiple parameter of Facebook login in junit.

package jUnit_Assignmnet;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class P004 {
	
	public boolean login(String username, String password) {
    return "user1".equals(username) && "password123".equals(password);

    }
    
    private final P004 loginService = new P004();

    @ParameterizedTest
    @CsvSource({
        "user1, password123, true",        
        "user1, wrongpassword, false",    
        "wronguser, password123, false",  
        "user2, password123, false"       
    })
    void testLogin(String username, String password, boolean expectedResult) {
        // Perform the login operation
        boolean result = loginService.login(username, password);
        
        // Assert the result matches the expected result
        assertEquals(expectedResult, result);
}
}