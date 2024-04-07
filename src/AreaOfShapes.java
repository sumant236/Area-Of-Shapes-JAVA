import java.util.Scanner;

abstract class Shape{
    final public float pi = 3.14f;
    public float area;
    abstract public void input();
    abstract public void compute();
    public void disp(){
        System.out.println("Area is: " + area);
    }
}

class Rectangle extends Shape{
    private float length;
    private float breadth;

    public void input(){
        Scanner scanLength = new Scanner(System.in);
        System.out.println("Kindly enter the length of rectangle: ");
        length = scanLength.nextFloat();
        Scanner scanBreadth = new Scanner(System.in);
        System.out.println("Kindly enter the length of rectangle: ");
        breadth = scanBreadth.nextFloat();
    }

    public void compute(){
        area = length*breadth;
    }

}

class Square extends Shape{
    private float length;

    public void input(){
        Scanner scanLength = new Scanner(System.in);
        System.out.println("Kindly enter the length of square: ");
        length = scanLength.nextFloat();
    }

    public void compute(){
        area = length*length;
    }


}

class Circle extends Shape{
    private float radius;

    public void input(){
        Scanner scanRadius = new Scanner(System.in);
        System.out.println("Kindly enter the radius of circle: ");
        radius = scanRadius.nextFloat();
    }

    public void compute(){
        area = pi*radius*radius;
    }
}

class Geometry{
    public void areaOfShape(Shape shape){
        shape.input();
        shape.compute();
        shape.disp();
    }
}

class Options{
    private int option;
    public int optionScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.) Rectangle \n2.) Square \n3.) Circle \nKindly enter the one of the options:");
        option = scan.nextInt();
        return option;
    }
}

public class AreaOfShapes {
    public static void main(String[] args) {
        int selectedOption;
        Options opt = new Options();
        selectedOption = opt.optionScanner();
        Geometry gm = new Geometry();

        if(selectedOption==1){
            Rectangle rect = new Rectangle();
            gm.areaOfShape(rect);
        } else if(selectedOption==2){
            Square sqr = new Square();
            gm.areaOfShape(sqr);
        } else if(selectedOption==3){
            Circle cir = new Circle();
            gm.areaOfShape(cir);
        } else{
            System.out.println("Entered option does not exist. Please try again!");
        }
    }
}
