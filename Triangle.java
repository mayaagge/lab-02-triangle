public class Triangle{
  // Instance Variables
  private Point v1, v2, v3;
  
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
    else{
      return v3;
    }
  }
  public void setVertex(int v, Point p){
    if (v == 1){
      this.v1 = p;
    }
    if (v==2){
      this.v2 = p;
    }
    if (v == 3){
      this.v3 = p;
    }
  }
  public String toString(){
    String s = "{" + (this.getVertex(1)).toString() + ", " + (this.getVertex(2)).toString() + ", " + (this.getVertex(3)).toString() +"}";
    return s;
  }
  public double getPerimeter(){
    double perimeter = Point.distance(v1, v2) + Point.distance(v1, v3) + Point.distance(v2, v3);
    return perimeter;
  }
  
  public boolean equals(Triangle other){
    if ((this.getVertex(1)).isEqual(other.getVertex(1)) && (this.getVertex(2)).isEqual(other.getVertex(2)) && (this.getVertex(3)).isEqual(other.getVertex(3))){
      return true;
    }
    
    return false;
   }
  public String getTriangleType(){
    double distance1 = Point.distance(v1, v2);
    double distance2 = Point.distance(v1, v3);
    double distance3 = Point.distance(v2, v3);
    if ((distance1 == distance2) && (distance2 == distance3) && (distance3 == distance1)){
      return "equilateral";
    }
    else if ((distance1 == distance2) || (distance2 == distance3) || (distance3 == distance1)){
      return "isoceles";
    }
    else{
      return "scalene";
    }
  }
  public double getArea(){
    double d1 = Point.distance(v1, v2);
    double d2 = Point.distance(v1, v3);
    double d3 = Point.distance(v2, v3);
    double sp = this.getPerimeter();
    double area = Math.pow((sp*(sp-d1)*(sp-d2)*(sp-d3)),0.5);
    return area;
  }
}
