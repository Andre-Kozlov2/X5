package second.lesson;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        double n;
        switch (value) {
            case 905:
                n=10*4.15;
                System.out.println("Москва. Стоимость разговора: "+n);
                break;
            case 194:
                n=10*1.98;
                System.out.println("Ростов. Стоимость разговора: "+n);
                break;
            case 491:
                n=10*2.69;
                System.out.println("Краснодар. Стоимость разговора: "+n);
                break;
            case 800:
                n=10*5;
                System.out.println("Киров. Стоимость разговора: "+n);
                break;
            default:
                System.out.println("Код города не определен по условию задачи");
        }
    }
}
