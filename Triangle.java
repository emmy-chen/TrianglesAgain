public class Triangle {
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
 }

  public double getArea() {
    double s = this.getPerimeter() / 2;
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v1.distanceTo(v3);
    return (Math.sqrt (s * (s - a) * (s - b) * (s - c)));
   }

   public String classify() {
     String triangle = "";
     double a = v1.distanceTo(v2);
     double b = v2.distanceTo(v3);
     double c = v1.distanceTo(v3);
     if ((a == b) && (b == c)) {
       triangle += "Equilateral";
     }
     else if (a!=b && b!=c && c!=a) {
       triangle += "Scalene";
     }
     else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a)) {
       triangle += "Isosceles";
     }
     return triangle;
   }

   public String toString() {
     return ("v1(" + v1.getX() + ", " + v1.getY() + ")" + " v2(" + v2.getX() + ", " + v2.getY() + ")" + " v3(" + v3.getX() + ", " + v3.getY() + ")");
   }

   public void setVertex(int index, Point newP) {
     if (index == 0) {
       v1 = newP;
     }
     if (index == 1) {
       v2 = newP;
     }
     if (index == 2) {
       v3 = newP;
     }
   }
}
