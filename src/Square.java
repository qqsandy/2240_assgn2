public class Square extends Rectangle {
    double side;

    Square(){
        super(1,1);
        this.side=1;
    }

    Square(double side){
        super(side, side);
        this.side=side;
    }

    public double getArea(){
        double a = Math.pow(this.side, 2);
        return a;
    }

    public double getPerimeter(){
        double p = 4*(this.side);
        return p;
    }

}
