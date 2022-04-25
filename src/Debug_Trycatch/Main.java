package Debug_Trycatch;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ArrayIndexOutOfBoundsException test = new ArrayIndexOutOfBoundsException();
        Integer[] arr = test.createRandom();
        System.out.println(test.createRandom());
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chỉ số của phần tử cần in: ");
        int x = 0;
        try {
             x = sc.nextInt();
            System.out.println("Giá trị phần tử cần in là: " + arr[x]);
        }catch (IndexOutOfBoundsException e) {
            System.err.println("Vị trí vượt quá mảng !!");
        }catch (InputMismatchException e){
            System.err.println("Chỉ nhập số !!");
        }

    }
}
