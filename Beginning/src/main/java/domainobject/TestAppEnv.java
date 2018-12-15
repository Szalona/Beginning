package domainobject;

public class TestAppEnv {

    public static final String DOMAIN = "172.17.15.20";
    public static final String PORT = "8082";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
