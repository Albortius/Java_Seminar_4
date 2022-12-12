import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

public class task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arrSize = in.nextInt();
        System.out.print("Максимальное значение элементов: ");
        int maxValue = in.nextInt();
        Queue <Integer> oldList = new LinkedList(){};
        Random randNumber = new Random();
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arrSize; i++){
            int elem = randNumber.nextInt(1, maxValue);
            oldList.add(elem);
            System.out.print(elem+" ");
        }
        System.out.print("\nПомещаем в конец очереди: ");
        int lastChar = in.nextInt();
        oldList.add(lastChar); // Добавляем в конец
        System.out.println("Массив после дополнения: ");
        for (int elem : oldList){
            System.out.print(elem+" ");
        }
        int delFirst = oldList.remove(); //
        System.out.println("\nУдаленный первый элемент: "+delFirst);
        for (int elem : oldList){
            System.out.print(elem+" ");
        }
        int getFirst = oldList.element();
        System.out.println("\nПолучаем первый элемент: "+getFirst);
        for (int elem : oldList){
            System.out.print(elem+" ");
        }
    }
}
