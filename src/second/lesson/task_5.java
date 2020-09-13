package second.lesson;
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа.");
        System.out.println("Первое число:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(" Второе число:");
        Scanner scanner2 = new Scanner(System.in);
        int y = scanner2.nextInt();
        System.out.println("Третье число:");
        Scanner scanner3 = new Scanner(System.in);
        int z = scanner3.nextInt();
        int min;
        if (x<y)
             min=x;
        else min=y;
        if (min>z)
            min=z;
        System.out.println("min = "+ min);
    }
}
