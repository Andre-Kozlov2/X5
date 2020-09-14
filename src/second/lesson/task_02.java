package second.lesson;
import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int value = (x/100)+(x/10%10)+(x%10); //подсчет
        System.out.println("Сумма цифр = "+ value);
    }
}
