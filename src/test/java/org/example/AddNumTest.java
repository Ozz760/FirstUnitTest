package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AddNumTest {
    AddNum num;

    @BeforeAll
    public static void setUpAll() {
        System.out.println("Should Print Before All Tests. (This is awesome!)");
    }

    @BeforeEach
    public void setUp() {
        num = new AddNum();
    }

    @Test
    @DisplayName("Should Equal to Four")
    public void itShouldEqualToFour() {
        Assertions.assertEquals(4, num.addTwoNum(2, 2));
}
    @Test
    @DisplayName("Should Equal to Seven")
    public void itShouldEqualToSeven() {
        Assertions.assertEquals(7, num.addTwoNum(3,4));
    }

    @Test
    @DisplayName("Should equal to Twelve")
    public void itShouldEqualToTwelve() {
        Assertions.assertEquals(12, num.productFourNum(3,4));
    }

    @AfterAll
    public static void setDownAll() {
        System.out.println("Should Print Once All Test Are Done.");
    }
}