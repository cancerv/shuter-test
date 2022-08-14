package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeaponTest {
    @Test
    public void testShoot_success() {
        Weapon weapon = new Weapon();
        String shot = weapon.shot();
        Assertions.assertEquals("Пиу пиу", shot);
    }
}
