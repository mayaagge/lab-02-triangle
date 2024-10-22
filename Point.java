public class Point{
  private double x, y;

  // Constructors
  public Point(double xVal, double yVal){
      x = xVal;
      y = yVal;
  }
  
  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  // Getters
  public double getX(){
    return x;
  }
  
  public double getY(){
    return y;
  }

  // METHODS
  
  /* Return a string with a coordinate values: (x, y)
  *  "(0.0, 0.0)"  or  "(- 10.5, 12.0)"
  */
  public String toString(){
    // YOUR CODE HERE
    String s = "(" + this.getX() + ", " + this.getY() + ")";
    return s;
  }
  
  public double distanceTo(Point other){
    // YOUR CODE HERE
    double d = distance(this, other);
    return d;
  }

  // CLASS METHODS - STATIC METHODS
  
  public static double distance(Point a, Point b){
   // YOUR CODE HERE
    double distancePoint = Math.pow(Math.pow((a.getX() - b.getX()),2.0) + Math.pow((a.getY() - b.getY()),2.0),0.5);
    return distancePoint;
  }

  public static boolean isClose(double value1, double value2){
    if (((Math.abs(value1-value2))/value1) <= 0.00001 && value1 != 0){
      return true;
    }
    else if (value1 == 0)
    {
      if ((Math.abs(value1-value2)) <= 0.00001)
      {
        return true;
      }
    }

    return false;
  }
  public boolean isEqual(Point other){
    if (isClose(this.getX(), other.getX()) == true && isClose(this.getY(), other.getY()) == true)
    {
      return true;
    }
    return false;
  }
}
