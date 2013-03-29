package shape;

/**
 *
 * @author DAHLIA 13-03-28
 */
public class ShapeTest {

    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(2, 4);
        Shape s3 = new Square(5, 5);

        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());

        Rectangle r = new Square(5, 5);
        System.out.println(r.area());

    }
}

interface Shape {

    double area();
}

class Circle implements Shape {

    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }
}

class Rectangle implements Shape {

    int w, h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}

class Square extends Rectangle {

    public Square(int w, int h) {
        super(w, h);
    }

    @Override
    public double area() {
        return super.area();
    }
}