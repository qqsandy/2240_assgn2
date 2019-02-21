import sun.security.util.Cache;

class Test {


    public static void main(String[] args) {
        GeometricObject[] gObjectArray = new GeometricObject[5];

        gObjectArray[0] = new Circle(5, 5, 5);
        gObjectArray[1] = new EquilateralTriangle(5);
        gObjectArray[2] = new Triangle(5,5,5);
        gObjectArray[3] = new Rectangle(5, 5);
        gObjectArray[4] = new Square(5);

        printAreaAndPerimeter(gObjectArray);
    }

    private static void printAreaAndPerimeter(GeometricObject[] gObject) {


        System.out.println("\n[Circle] "+" | (Area):"+gObject[0].getArea()+" | (Perimeter): "+gObject[0].getPerimeter());
        System.out.println("\n[Equilateral Triangle]"+" | (Area): "+gObject[1].getArea()+" | (Perimeter): "+gObject[1].getPerimeter());
        System.out.println("\n[Triangle]"+" | (Area): "+gObject[2].getArea()+" | (Perimeter): "+gObject[2].getPerimeter());
        System.out.println("\n[Rectangle]"+" | (Area): "+gObject[3].getArea()+" | (Perimeter): "+gObject[3].getPerimeter());
        System.out.println("\n[Square]"+" | (Area): "+gObject[4].getArea()+" | (Perimeter): "+gObject[4].getPerimeter());
    }
}