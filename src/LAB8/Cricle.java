package LAB8;

public class Cricle extends Object2D {

    private  static  final double PI = 3.141;
    //attribute
    private  double radius;
     //constructor
    public Cricle(double radius){
        this.radius = radius;
    }


    @Override
    public void calArea() {

        //Cricle area = PI *(r * r);
        double area = PI *radius*radius;
        super.setArea(area);

    }
}
