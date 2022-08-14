import Weapon.*;

public class Player {

    Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new SniperRifle(),
                new Shotgun(),
                new WaterGun(),
                new Bow()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public String shotWithWeapon(int slot) throws RuntimeException {
        if (slot < weaponSlots.length && slot > -1) {
            Weapon weapon = weaponSlots[slot];
            return weapon.shot();
        } else {
            throw new RuntimeException("Некорректный номер. Выберите от 0 до 3.");
        }
    }

}
