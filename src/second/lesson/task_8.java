package second.lesson;

public class task_8 {
    public static void main(String[] args){
    int[] array={1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
    int maximum =array[0];                              // максимальное значение
    int summa=0;                                        //сумма положительных элементов
    int summa2=0;                                     // сумма отрицательных четных элементов
    int summa3=0;                                    //  сумма отрицательных элементов
    int quantity=0;                                  // кол-во положительных элементов
    int quantity2=0;                                  //кол-во отр. элементов
    float srednee;                                  // средне арифмитическое отр. элементов
    for (int i=0; i<array.length; i++){
        if (maximum<array[i]) maximum=array[i];
        if (array[i]>0){
            summa=summa+array[i];
            quantity++;
        }
        if (array[i]<0 && array[i]%2==0) summa2=summa2+array[i];
        if (array[i]<0) {
            summa3=summa3+array[i];
            quantity2++;
        }
    }
    srednee=summa3/quantity2;
    System.out.println("максимальное значение: "+ maximum);
    System.out.println("сумма положительных элементов: "+ summa);
    System.out.println("сумма четных отрицательных элементов: "+ summa2);
    System.out.println("количество положительных элементов: "+ quantity);
    System.out.println("среднее арифметическое отрицательных элементов: "+ srednee);
    }
}