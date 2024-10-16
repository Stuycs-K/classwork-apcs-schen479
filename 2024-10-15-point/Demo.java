public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((b.getX() - a.getX()), 2)  + Math.pow((b.getY() - a.getY()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p3);
    Point p5 = new Point(20,21); //pyth triple 20-21-29
    Point p6 = new Point(5,12);  //pyth triple 5-12-13

    Point eq2 = new Point(1,0);
    Point eq3 = new Point(0.5, Math.sqrt(3)/2);

    Point origin = new Point(0,0);

    //test cases
    System.out.println("Expected 2.828... Got: " + distance(p1, p2));
    System.out.println("Expected 6.40 ... Got: " + distance(p2, p3));
    System.out.println("Expected 0 Got: " +distance(p3, p4));
    System.out.println("Expected 5 Got: " +distance(origin, p4));

    System.out.println(p3);
    System.out.println("Expected (3, 4) Got: " +p4);
    System.out.println("Expected 2.828... Got: " + distance(p1,p2));
    System.out.println("Expected 2.828... Got: " + Point.distance(p1,p2));
    System.out.println("Expected 2.828... Got: " + p1.distanceTo(p2));

    System.out.println("Expected 29 Got: " + distance(origin,p5));
    System.out.println("Expected 29 Got: " + Point.distance(origin, p5));
    System.out.println("Expected 29 Got: " + origin.distanceTo(p5));

    System.out.println("Expected 13 Got: " + distance(origin,p6));
    System.out.println("Expected 13 Got: " + Point.distance(origin, p6));
    System.out.println("Expected 13 Got: " + origin.distanceTo(p6));

    System.out.println("Expected 1 Got: " + distance(origin, eq2));
    System.out.println("Expected 1 Got: " + distance(origin, eq3));
    System.out.println("Expected 1 Got: " + distance(eq3, eq2));
  }
}
