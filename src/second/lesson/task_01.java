package second.lesson;
import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt()%10;
        System.out.println(value);
    }
}

