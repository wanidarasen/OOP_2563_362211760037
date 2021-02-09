package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {
     //use default constructor
        Employee emp1 =new Employee();
        //assign constructor
        Employee emp2 = new Employee("Wanida ",23,"student",5000);


        //call displaydata()
        emp1.displaydata();
        emp2.displaydata();


        //assign data to emp1
        emp1.setName("wanida ");
        emp1.setage(23 );
        emp1.setposition("student");
        emp1.setsalary(5000);


        emp1.displaydata();
        System.out.println("Emp name" +emp1.getName());

    }//main
}//class
