package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class C07_Assertions {


    @Test
    void assertEqualsTest() {
        String actualData = "John";
        String expectedData = "John";
        Assertions.assertEquals(expectedData, actualData, "Names did not match!");
    }

    @Test
    void assertTrueTest() {

        String table = """ 
             First Name: Raymon 
             Last Name: Wolf 
             Date of Birth: 2000-05-15 
             """;
        Assertions.assertTrue(table.contains("Wolf"), "Table does not contain Wolf!");

    }

    @Test
    void assertFalseTest() {
        String table = """ 
             First Name: Raymon 
             Last Name: Wolf 
             Date of Birth: 2000-05-15 
             """;

Assertions.assertFalse(table.contains("Raymon"), "Table containsJohn !");  }


    @Test
    void assertNullTest() {
        String name = "kk";
   assertNull(name,"name is null");
    }

}
