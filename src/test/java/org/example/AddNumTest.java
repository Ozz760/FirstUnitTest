package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddNumTest {
    AddNum num = new AddNum();
@Test
    public void itShouldEqualsToFour() {
    assertEquals(4, num.addTwoNum(2, 2));
}
}