package domainentites.examples;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class SwitchTest {
    @Test
    public void switchExample(){
        assertEquals("UK", country("United Kingdom"));
        assertEquals("USA", country("United States"));
        assertEquals("FR", country("France"));
        assertEquals("SE", country("Sweden"));

    }

    public String country(String title) {
        String country;
        switch (title.toLowerCase()){
            case "United Kingdom": country = "UK";
            break;
            case "United States": country = "USA";
            break;
            case "France": country = "FR";
            break;
            default: country = "UK";
            break;
        }
        return country;
    }
}
