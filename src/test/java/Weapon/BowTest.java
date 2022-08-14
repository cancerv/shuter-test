package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowTest {
    @Test
    public void testShoot_success() {
        Bow bow = new Bow();
        String shot = bow.shot();
        Assertions.assertEquals("Стеляет стрелами", shot);
    }
}
