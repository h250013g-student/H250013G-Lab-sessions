public class Exercise1Shapes {
    abstract static class Shape { abstract double area(); abstract double perimeter(); }
    static class Circle extends Shape { double r; Circle(double r){this.r=r;} double area(){return Math.PI*r*r;} double perimeter(){return 2*Math.PI*r;} }
    static class Rectangle extends Shape { double w,h; Rectangle(double w,double h){this.w=w;this.h=h;} double area(){return w*h;} double perimeter(){return 2*(w+h);} }
    static class Square extends Shape { double side; Square(double s){side=s;} double area(){return side*side;} double perimeter(){return 4*side;} }
    public static void main(String[] args) { Shape[] shapes={new Circle(2),new Rectangle(3,4),new Square(3)}; for(Shape s:shapes) System.out.printf("Area %.2f, perimeter %.2f%n",s.area(),s.perimeter()); }
}
