package LAB8;

public class Doctor extends Person {
    private String hospital;

    //constructor

    public Doctor() {
    }

    public Doctor(String hospital) {
        this.hospital = hospital;
    }
    //getter and setter

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    public void introduce(){
        super.intriduce();
        System.out.println("I am doctor at " +hospital+"hospital");
    }
}