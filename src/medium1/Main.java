package medium1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            main();
        } catch (LoginIsNullException e) {
            System.out.println("Поле логина пустое");
        } catch (IlligallFormatException e) {
            System.out.println("Некорректный ввод");
        }

    }

    private static void main() throws LoginIsNullException, IlligallFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        boolean haveNumber = false;
        for (char c : login.toCharArray()) {
            if (Character.isDigit(c)) {
                haveNumber = true;
            }
        }
        if (login.isEmpty()) {
            throw new LoginIsNullException("Логин пуст");
        } else if (haveNumber) {
            throw new IlligallFormatException("Неверный ввод");
        } else System.out.println(login);
    }

}
