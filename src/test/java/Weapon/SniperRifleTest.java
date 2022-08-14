package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SniperRifleTest {
    @Test
    public void testShoot_success() {
        SniperRifle sniperRifle = new SniperRifle();
        String shot = sniperRifle.shot();
        Assertions.assertEquals("Выстрел точно в цель!", shot);
    }
}
