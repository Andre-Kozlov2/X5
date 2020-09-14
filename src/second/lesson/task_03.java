package second.lesson;
import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value>0){
            ++value;
        }
        System.out.println("value = "+ value);
    }
}
