public class Rectangle extends GeometricObject{

     double side1;
     double side2;

    Rectangle(){
        super();
        this.side1=1;
        this.side2=1;
    }

    Rectangle(double s1, double s2){
        super();
        this.side1=s1;
        this.side2=s2;

    }


    public double getArea(){
        double a = this.side1*this.side2;
        return a;
    }


    public double getPerimeter(){
        double p = 2*(this.side1+this.side2);
        return p;
    }
}
