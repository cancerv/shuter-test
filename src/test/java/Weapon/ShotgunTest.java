package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShotgunTest {
    @Test
    public void testShoot_success() {
        String actual = "Выстрел дробью";
        Shotgun shotgun = new Shotgun();
        String expected = shotgun.shot();
        Assertions.assertEquals(actual, expected);
    }
}
