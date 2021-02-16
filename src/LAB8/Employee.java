package LAB8;

public class Employee extends Person {
    //class Attributes
    private  String empID;//รหัสพนักงาน
    private  String position;
    private  double salary;
   //constructors

    public Employee(String empID) {
        this.empID = empID;
    }

    public Employee() {
    }

    public Employee(String pid, String name, int age, String gender, String tel, String empID, String position, double salary) {
        super(pid, name, age, gender, tel);
        this.empID = empID;
        this.position = position;
        this.salary = salary;
    }

    //getter

    public String getEmpID() {
        return empID;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }


    //and setter


    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString


    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}


