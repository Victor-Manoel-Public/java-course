public class Cuboid extends Rectangle{

    /*
    2. Write a class with the name Cuboid that extends Rectangle class. ok
    The class needs one field (instance variable) with name height of type double. ok
    The class needs to have one constructor with three parameters width, length, and height all of type double. ok
    It needs to call parent constructor and initialize a height field. ok

    In case the height parameter is less than 0 it needs to set the height field value to 0. ok

    Write the following methods (instance methods):
    * Method named getHeight without any parameters, it needs to return the value of height field. ok
    * Method named getVolume without any parameters, it needs to return the calculated volume. ok
      To calculate volume multiply the area with height.
     */
    private double height;

    public Cuboid(double width, double length, double height){
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }
  
    public double getHeight(){
        return (this.height);
    }

    public double getVolume(){
        return (super.getArea() * this.height);
    }

}
