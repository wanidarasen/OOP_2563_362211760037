package LAB8;

public  abstract class  Object2D {
    //attributes
    private  String b_color;
    private  double area;


    //abstract  method
    abstract public void  calArea();
    //gerter and seetter

    public double getArea() {
        return area;
    }
    public String getB_color() {
        return b_color;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
