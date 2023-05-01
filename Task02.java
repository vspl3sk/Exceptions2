import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит
// пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task02 {

    public static void main(String[] args) {
        getString();
    }

    public static void getString() {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Введите строку: ");
        str = input.nextLine();
        if (!str.isEmpty()) {
            System.out.println(str);
        } else {
            System.out.print("Строка не должна быть пустой");
            getString();
        }
        input.close();
    }
}