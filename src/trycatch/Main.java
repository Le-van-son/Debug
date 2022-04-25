package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TryCatch tinhtoan = new TryCatch();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập X: ");
            int x = sc.nextInt();
            System.out.println("Nhập y: ");
            int y = sc.nextInt();

            System.out.println("Tổng = " + tinhtoan.cong(x, y));
            System.out.println("Hiệu = " + tinhtoan.tru(x, y));
            System.out.println("Tích = " + tinhtoan.nhan(x, y));
            System.out.println("Nhân = " + tinhtoan.chia(x, y));
        } catch (Exception e) {
            System.out.println("Lỗi nhập vào ");
        }
    }
}
