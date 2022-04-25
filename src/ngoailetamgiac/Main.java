package ngoailetamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a<=0 || b<= 0 || c<=0 || a+b<=c || b+c<=a || a+c<=b){
            try{
                throw new IllegaltriangleException();
            }catch (IllegaltriangleException e){
                System.out.println(e);
            }
        } else System.out.println("ok");
    }
}
class IllegaltriangleException extends Exception {
    @Override
    public String toString() {
        return "Tam giác không hợp lệ";
    }
}
