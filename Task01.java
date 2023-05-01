import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа
// (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task01 {
    public static void main(String[] args) {
        getNumber();
    }

    public static void getNumber() {
        Scanner input = new Scanner(System.in);
        float num;
        try {
            System.out.print("Введите число: ");
            num = input.nextFloat();
            System.out.print(num);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода! Введите число!");
            getNumber();
        }

        input.close();

    }
}
