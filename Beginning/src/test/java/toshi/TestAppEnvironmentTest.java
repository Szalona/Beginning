package toshi;

import domainobject.TestAppEnv;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Return Hard Coded URL", "http://172.17.15.20:8082", TestAppEnv.getUrl());
    }
    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just get Domain", "172.17.15.20", TestAppEnv.DOMAIN);
        assertEquals("Just the port", "8082", TestAppEnv.PORT);
    }
}
