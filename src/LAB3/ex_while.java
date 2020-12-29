package LAB3;

import java.util.Scanner;

public class ex_while {
    public static void main(String[] args) {
        // ให้รับค่าจำนวนเต็มจาก user ไปเรื่อยๆ หากผู้ใช้ป้อนค่าเลข 0 ให้หยุดการทำงานของ Loop While
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (num!=0){ // True=Run False=Stop
            System.out.print("Enter Integer : ");
            num = sc.nextInt();
        }
        System.out.println("Good Bye.");



    }
}
