public class Circle {
    /*
    1. Write a class with the name Circle. ok
    The class needs one field (instance variable) with name radius of type double.
    The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields. ok
    In case the radius parameter is less than 0 it needs to set the radius field value to 0. ok
    Write the following methods (instance methods):
    * Method named getRadius without any parameters, it needs to return the value of radius field. ok
    * Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). ok

     */

    private double radius;

    public Circle(double radius){
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        //Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI).
        return (this.radius * this.radius * Math.PI);
    }
}
