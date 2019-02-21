public class Circle extends GeometricObject {

    private double x;
    private double y;
    private double radius;


    public Circle(){
        super();
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle (double x, double y, double r){
        super();
        this.x=x;
        this.y=y;
        this.radius=r;
    }

    public double getArea(){
        double a = Math.PI * Math.pow(this.radius, 2);
        return a;
    }

    public double getPerimeter(){
        double p = (2*Math.PI*this.radius);
        return p;
    }
}
