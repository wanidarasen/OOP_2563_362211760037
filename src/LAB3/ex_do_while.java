package LAB3;
import java.util.Scanner;

public class ex_do_while {
    public static void main(String[] args) {
        // ให้รับค่าจำนวนเต็มจาก user ไปเรื่อยๆ หากผู้ใช้ป้อนค่าเลข 0 ให้หยุดการทำงานของ Loop Do-While
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter Integer : ");
            num = sc.nextInt();
        }while(num!=0);

        System.out.println("Good Bye.");

    }
}