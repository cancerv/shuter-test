package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SniperRifleTest {
    @Test
    public void testShoot_success() {
        String actual = "Выстрел точно в цель!";
        SniperRifle sniperRifle = new SniperRifle();
        String expected = sniperRifle.shot();
        Assertions.assertEquals(actual, expected);
    }
}
