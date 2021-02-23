package LAB8;

public class PersonApp {
    public static void main(String[] args) {

        //objects
        Person p1 = new Person();
        p1.setName("Wanida rasen");
        p1.setAge(23);

        Person p2 = new Teacher("RMUTS");
        p2.setName("non");
        p2.setAge(23);


        Person p3 =new Doctor("Thungsong");
        p3.setName("suchat");
        p3.setAge(28);

        //call introduce
        p1.intriduce();
        p2.intriduce();
        p3.intriduce();


    }
}