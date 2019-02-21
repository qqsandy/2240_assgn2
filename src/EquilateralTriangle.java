public class EquilateralTriangle extends Triangle {

    private double side;

    public EquilateralTriangle(){
        super(1,1,1);
        this.side = 1;
    }
    EquilateralTriangle(double side){
        super(side, side, side);
        this.side=side;
    }
}
