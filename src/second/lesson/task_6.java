package second.lesson;
import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int input;
        if (value>0 && value%2==0) {
            input = 3;
        }else if (value>0 && value%2!=0) {
           input=4;
        }else if (value<0 && value%2==0) {
            input = 0;
        }else if (value<0 && value%2!=0) {
            input = 1;
        }else {
            input = 2;
        }
        switch (input){
            case 0:
                System.out.println("Отрицательное четное число");
                break;
            case 1:
                System.out.println("Отрицательное нечетное число");
                break;
            case 2:
                System.out.println("нулевое число");
                break;
            case 3:
                System.out.println("Положительное четное число");
                break;
            case 4:
                System.out.println("Положительное нечетное число");
                break;
            default:
                System.out.println("Число не определено по типу");
        }
    }
}
