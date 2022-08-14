package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WaterGunTest {
    @Test
    public void testShoot_success() {
        WaterGun waterGun = new WaterGun();
        String shot = waterGun.shot();
        Assertions.assertEquals("Выстрел водой", shot);
    }
}
