package domainentites.examples;

import domainentities.User;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("toshi", "szalona");
        assertEquals("given username expected", "toshi", user.getUsername());
        assertEquals("given password expected", "szalona", user.getPassword());
    }
}
