import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class TriangleTester {
    public static void main(String[] args) {
      System.out.println(countTrianglesA("inputTri.txt"));
      System.out.println(countTrianglesB("inputTri.txt"));
    }

    public static int countTrianglesA(String filename) {
      int sum = 0;

      try {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
      
        while(sc.hasNextLine() && sc.hasNextDouble()) {
          double a = sc.nextDouble();
          double b = sc.nextDouble();
          double c = sc.nextDouble();
          if(testTriangles(a, b, c)){
            sum++;
          }
        }
        sc.close();
        return sum;
      } catch (FileNotFoundException ex) {
        System.out.println("File not found");
        return -1; 
      }
    }


    public static boolean testTriangles(double a, double b, double c){
      return ((a+b>c)&&(c+b>a)&&(a+c>b));
    }
  }
