package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeaponTest {
    @Test
    public void testShoot_success() {
        String actual = "Пиу пиу";
        Weapon weapon = new Weapon();
        String expected = weapon.shot();
        Assertions.assertEquals(actual, expected);
    }
}
