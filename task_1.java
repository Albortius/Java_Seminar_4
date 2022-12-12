import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arrSize = in.nextInt();
        System.out.print("Максимальное значение элементов:");
        int maxValue = in.nextInt();
        LinkedList oldList = new LinkedList<Integer>();
        Random randNumber = new Random();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arrSize; i++){
            int elem = randNumber.nextInt(1, maxValue);
            oldList.add(elem);
            System.out.print(elem+" ");
        }
        int step    = oldList.size() / 2;
        if (oldList.size() % 2 == 0){
            step = (oldList.size() / 2) - 1;
        }
        int last    = oldList.size() - 1;
        LinkedList newList = new LinkedList<Integer>();
        System.out.println("\nПеревернутый массив: ");
        for (int i = 0; i < oldList.size(); i++){
            int elem = (Integer) oldList.get(last);
            newList.add(elem);
            System.out.print(elem+" ");
            last--;
        }
    }   
}
