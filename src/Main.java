import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number, min, max;
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        number = inp.nextInt();
        Arrays.sort(list);
        for(int element: list){
            if (element>number){
                max = element;
                int elementIndex = Arrays.binarySearch(list,element);
                min= list[elementIndex-1];
                System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);
                System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);
                break;
            }
        }
    }
}
