package InheritanceChapter11;

public class CircleSimpleGeometricObject extends SimpleGeometricObject{
    private  double radius;

    public CircleSimpleGeometricObject(){}

    public CircleSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleSimpleGeometricObject( double radius,String colour, boolean filled) {
        this.radius = radius;
        setColour(colour);
        setFilled(filled);
    }
    public  double getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius = radius;

    }
    public double getArea(){
        return  radius*radius*Math.PI;
    }
    public  double getDiameter(){
        return 2*radius;
    }
    public  double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println("The circle is created" + getDateCreated() + "and the radius is " + radius);
    }

}
