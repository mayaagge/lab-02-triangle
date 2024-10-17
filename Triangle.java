public class Triangle{
  // Instance Variables
  private Point v1, v2, v2;
  
  // Constructors
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  public Triangle (Point v1, Point v2, Point v3){
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }
  
  // Methods
  public Point getVertex(int v){
    if (v == 1){
      return v1;
    }
    if (v==2){
      return v2;
    }
    if (v == 3){
      return v3;
    }
  }
  public void setVertex(int v, Point p){
    if (v == 1){
      p.v1 = v1;
    }
    if (v==2){
      p.v2= v2;
    }
    if (v == 3){
      p.v3 = v3;
    }
  }
  public String toString(){
    s = "{" + (this.getVertex(1)).toString() + ", " + (this.getVertex(2)).toString() + ", " + (this.getVertex(3)).toString() +"}";
    return s;
  }
  public static double getPerimeter(){
    perimeter = v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
    return perimeter;
  }
}
