package LAB3;

import java.util.Scanner;

public class ex_for2 {
    public static void main(String[] args) {
        //รับค่าจำนวนเต็มจาก user 5 ครั้ง
        //หาผลรวามจากข้อมูลทั้งหมด
        //หาค่าเฉลี่ยจากข้อมูลทั้งหมด คือ ผลรวมของข้อมูล/จำนวนของข้อมูล
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Integers : ");
            int num = sc.nextInt();
            total += num; // total = total + num
            // System.out.println("Entered : "+num);

        }
        System.out.println("Total : "+total);
        System.out.println("Average : "+(total/5));

        System.out.println("Good Bye.");

    }
}