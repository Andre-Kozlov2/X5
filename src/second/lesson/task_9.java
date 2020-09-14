package second.lesson;

public class task_9 {
    public static void main(String[] args) {
        int[] array={15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int temp;
        int middle = array.length/2;
        int last = array.length-1;

        for (int i = 0; i< middle; i++) {
           //переливание из конца в начало дл середины массива
            temp = array[last-i];
            array[last-i] = array[i];
            array[i]=temp;
        }
        for (int a:array){
            System.out.print(a+", ");
        }
    }
}

