package QLSV;

import java.util.Scanner;

public class Cau2 {
    private static Scanner input;
    public static void nhap(int n, int mang[]){
        input = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng n = ");
        n = input.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("nhập vào phần tử thứ "+ i +" : ");
            mang[i] = input.nextInt();
        }
    }
    public static void show(int n, int mang[]){
        System.out.println("hiện thị mảng");
        for (int i = 0; i < n; i++){
            System.out.println(mang[i]);
        }
    }
    public static void main(String [] args){
        int a = input.nextInt();
        int b[] = new int[a];
        nhap(a,b);
        show(a,b);
    }
}
