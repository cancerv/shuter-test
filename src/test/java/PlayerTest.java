import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PlayerTest {
    @Test
    public void testGetSlotsCount_success() {
        Player player = new Player();

        int count = player.getSlotsCount();

        Assertions.assertEquals(count, 4);
    }

    @ParameterizedTest(name = "{0} = {1}")
    @CsvSource({
            "0, Выстрел точно в цель!",
            "1, Выстрел дробью",
            "2, Выстрел водой",
            "3, Стеляет стрелами",
    })
    public void testShoot_success(int slot, String expectedResult) {
        Player player = new Player();

        String shot = player.shotWithWeapon(slot);

        Assertions.assertEquals(expectedResult, shot);
    }

    @Test
    public void testShoot_fail()
    {
        Player player = new Player();
        Assertions.assertThrows(RuntimeException.class, () -> player.shotWithWeapon(6));
    }
}
