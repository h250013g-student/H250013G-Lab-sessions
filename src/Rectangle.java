public class Rectangle {
    double width;
    double height;
// creating a constructor for the rectangle
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
//    a method that returns area  just multiplying height and width
    double area(){
        return (width * height);
    }
//    a method that returns the perimeter just multiplying the sum of height and with by 2
    double perimeter(){
        return (2*(width + height));
    }

    public static void main(String[] args){
//        creating the rectangle
        Rectangle r1 = new Rectangle(4,3);

        Rectangle r2 = r1;

//        now lets print width of r1 and r2
        System.out.println("r1 width: "+r1.width+" r2 width: "+ r2.width);
        r1.width = 5;
//       now lets print again the width of r1 and r2 after assigning r1 width to 5

        System.out.println("r1 width: "+r1.width+" r2 width: "+ r2.width);

    }
}
