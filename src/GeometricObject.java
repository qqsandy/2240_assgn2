import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    GeometricObject(){
        this.color = "black";
        this.filled=false;
        this.dateCreated= new Date();
    }


    // Construct a geometric object with colour & filled value
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    // Returns colour
    public String getColor(){
        return color;
    }

    // Set colour
    public void setColor(String color){
        this.color=color;
    }

    // Return filled. Since filled is a boolean
    // the get method is named isFilled
    public boolean isFilled(){
        return filled;
    }

    // Set a new filled
    public void setFilled(Boolean filled){
        this.filled=filled;
    }

    // Get dateCreated
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on "+dateCreated+"\ncolour:"+color+" and filled: "+filled;
    }

    // abstract method getArea
    public abstract double getArea();

    // Abstract double getArea
    public abstract double getPerimeter();


}
