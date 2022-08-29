package Weapon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WaterGunTest {
    @Test
    public void testShoot_success() {
        String actual = "Выстрел водой";
        WaterGun waterGun = new WaterGun();
        String expected = waterGun.shot();
        Assertions.assertEquals(actual, expected);
    }
}
