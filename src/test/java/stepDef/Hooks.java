package stepDef;

import io.cucumber.java.*;

public class Hooks {

    @BeforeAll
    public static void setUp(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("After All");
    }

    @Before
    public void beforeTest() {
    }

    @After
    public void afterTest() {;
    }
}
