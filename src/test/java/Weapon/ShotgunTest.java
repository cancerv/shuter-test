package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShotgunTest {
    @Test
    public void testShoot_success() {
        Shotgun shotgun = new Shotgun();
        String shot = shotgun.shot();
        Assertions.assertEquals("Выстрел дробью", shot);
    }
}
