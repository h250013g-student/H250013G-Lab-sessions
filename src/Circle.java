public class Circle {

    static int count = 0;
    private final int id;
    private Double radius;
// this is an instance initialiser block runs before every constructor body
    {
       count++;
       id =count;
    }

//    this is a constructor for the circle
   public Circle(Double radius){
        this.radius = radius;

    }
    // this is a constructor of circle without arguments with default radius 1.0
    public Circle(){
       this(1.0);
    }
//    creating a static counter that tracks how many circles exist with a static getter
    public static int getCount(){
       return count;
    }
    public static void main(String[] args){
        // the is object c1 with no arguments
        Circle c1 = new Circle();
        // this prints out the default radius 1.0
        System.out.println(c1.radius);

        // this object has a radius of 2.3
        Circle c2 = new Circle(2.3);
        // prints out 2.3
        System.out.println(c2.radius);


        // this prints out the number of circles using the counter
        System.out.println("Books :"+Circle.getCount());
    }
}
