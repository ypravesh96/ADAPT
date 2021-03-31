class Rectangle5 extends Shape5 {
    @Override
    public String draw() {return "Rectangle";}
}

class Line5 extends Shape5{
    @Override
    public String draw() {return "Line";}
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {return "Cube";}
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
      Shape5 rectangleShape=new Rectangle5();
      Shape5 lineShape=new Line5();
    	Shape5 cubeShape=new Cube5();


    	System.out.println(rectangleShape.draw());
    	System.out.println(lineShape.draw());
    	System.out.println(cubeShape.draw());
    }
}
