public class Driver{
  public static void main(String[]args){
    /* Write your tests here
    * Make sure to write more than 3 test cases
    * Three or less test cases will lower your grade
    * When your create tests cases try to test extreme cases (something that is not commmon, but it could happen)
    * When your create tests cases, you should test all the methods you coded in your class Poimt
    */ 

    /*****************     TEST CASE 00    ******************/
    Point p1 = new Point(8.0, 8.0);
    Point p2 = new Point(2.0, 10.0);
    Point p3 = new Point(0.0, 0.0);

    // Print coordinates using your toString method from Point class
    System.out.println("Coordinates: " + p1.toString());
    System.out.println("Coordinates: " + p2.toString());
    System.out.println("Coordinates: " + p3.toString());
    
    // Calculate distances and print results
    double distance1 = Point.distance(p1, p2);
    double sameDistance1 = p2.distanceTo(p1);
    double distance2 = Point.distance(p2, p3);
    double sameDistance2 = p2.distanceTo(p3);
    double distance3 = Point.distance(p1, p3);
    double sameDistance3 = p1.distanceTo(p3);
    System.out.println("Distance from p1 to p2 is " + distance1 + " which is the same as " + sameDistance1);
    System.out.println("Distance from p2 to p3 is " + distance2 + " which is the same as " + sameDistance2);
    System.out.println("Distance from p1 to p3 is " + distance3 + " which is the same as " + sameDistance3);
    
    // Create Triangle objects and test the methods
    /*************     ADD MORE TEST CASES HERE    *************/
    Triangle t1 = new Triangle(0.0,0.0,6.0,8.0,0.0,8.0);
    Triangle t2 = new Triangle(p1, p2, p3);
    Triangle t3 = new Triangle(-1.0,0.0,-3.4,5.1,-7.0,6.0);
    Triangle t4 = new Triangle(0.0,1.0,1.0,2.0,7.0,3.0);
    System.out.println("Triangle 1 coordinates: " + t1.toString());
    System.out.println("Triangle 2 coordinates: " + t2.toString());
    System.out.println("Triangle 3 coordinates: " + t3.toString());
    System.out.println("Triangle 4 coordinates: " + t4.toString());
    System.out.println("Perimeter " + t1.getPerimeter());
    System.out.println("Perimeter " + t2.getPerimeter());
    System.out.println("Perimeter " + t3.getPerimeter());
    System.out.println("Perimeter " + t4.getPerimeter());
    Point newPoint = new Point(3.0,4.0);
    t1.setVertex(2, newPoint);
    System.out.println("New triangle 1 coordinates: " + t1.toString());
    System.out.println("New perimeter " + t1.getPerimeter());
    System.out.println("0.0 and 0.0000001 are close: " + Point.isClose(0.0,0.0000001));
    System.out.println("0.0 and 0.1 are close: " + Point.isClose(0.0,0.1));
    System.out.println("The first coordinate of Triangle 1 is equal to the point 0.0,0.0: " + (t1.getVertex(1)).isEqual(p3));
    Triangle t5 = new Triangle(0.0,1.0,-Math.pow(3.0,0.5)*0.5,-0.5,Math.pow(3.0,0.5)*0.5,-0.5);
    System.out.println("The triangle is a " + t5.getTriangleType() + " triangle");
    System.out.println("The triangle is a " + t3.getTriangleType() + " triangle");
    Triangle t6 = new Triangle(0.0,0.0, 5.0, 3.0, 5.0, 3.0);
    System.out.println("The triangle is a " + t6.getTriangleType() + " triangle");
    Triangle t7 = new Triangle(0.0,0.0, 5.0, 3.0, 5.0, 3.0);
    System.out.println("This triangle is equal to the previous triangle: " + t7.equals(t6));
    System.out.println("This triangle is equal to the previous triangle: " + t5.equals(t6));
    System.out.println("The area of triangle 1 is " + t1.getArea());
    System.out.println("The area of triangle 2 is " + t2.getArea());
    System.out.println("The area of triangle 3 is " + t3.getArea());
    System.out.println("The area of triangle 4 is " + t4.getArea());
  
  }
}
/*
Test Cases

Create multiple triangles to test your code, more than 3 cases.
Test each method on different triangles
Change each vertex, and test your methods
Check the perimeter calculation
  */
