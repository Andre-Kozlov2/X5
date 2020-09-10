package second.lesson;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value>0){
            ++value;
        }else if (value<0){
            value=value-2;
        }else {
            value=10;
        }
        System.out.println("value = "+ value);
    }
}