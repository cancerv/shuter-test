import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                + " введите номер, чтобы выстрелить,"
                + " -1 чтобы выйти%n", player.getSlotsCount());

        while (true) {
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            try {
                String shot = player.shotWithWeapon(input);
                System.out.println(shot);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Игра окончена");
    }
}
