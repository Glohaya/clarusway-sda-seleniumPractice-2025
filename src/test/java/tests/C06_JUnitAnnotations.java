package tests;

import org.junit.jupiter.api.*;

public class C06_JUnitAnnotations {

    //راح تنبطع بالبداية مهما كان محلها ، وبس مره وحده عكس befor each
    // ولا عندهم زر الرن لانهم مش تست
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }


@AfterAll
static void afterAll(){
    System.out.println("After All");

}


@BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }



    @Test
    void test01(){
        System.out.println("Test01");
    }

    @Test
    void test02(){
        System.out.println("Test02");
    }

    @Test @Disabled
    void test03(){
        System.out.println("Test03");
    }

    @Test
    void test04(){
        System.out.println("Test04");
    }

 @Test @DisplayName("My Fifth Test")
    void test05(){
        System.out.println("Test05");
    }



}
