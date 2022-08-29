package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowTest {
    @Test
    public void testShoot_success() {
        String actual = "Стеляет стрелами";
        Bow bow = new Bow();
        String expected = bow.shot();
        Assertions.assertEquals(actual, expected);
    }
}
