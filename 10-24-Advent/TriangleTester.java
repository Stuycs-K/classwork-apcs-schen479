import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class TriangleTester {
    public static void main(String[] args) {
      System.out.println(countTrianglesA("inputTri.txt"));
      System.out.println(countTrianglesB("inputTri.txt"));
      //System.out.println(countTrianglesA("input.txt"));
      //System.out.println(countTrianglesB("input.txt"));
    }

    public static int countTrianglesA(String filename) {
      int sum = 0;

      try {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
      
        while(sc.hasNextLine() && sc.hasNextInt()) {
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
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

    public static int countTrianglesB(String filename){
      try {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
          
        int sum = 0;
        while(sc.hasNextLine() && sc.hasNextInt()) {
          int a0 = sc.nextInt();
          int b0 = sc.nextInt();
          int c0 = sc.nextInt();
          int a1 = sc.nextInt();
          int b1 = sc.nextInt();
          int c1 = sc.nextInt();
          int a2 = sc.nextInt();
          int b2 = sc.nextInt();
          int c2 = sc.nextInt();
          if(testTriangles(a0, a1, a2)){
            sum++;
          }
          if(testTriangles(b0, b1, b2)){
            sum++;
          }
          if(testTriangles(c0, c1, c2)){
            sum++;
          }
        }
        return sum; 
      }
      catch (FileNotFoundException ex) {
        System.out.println("File not found");
        return -1; 
      }    
    }

    public static boolean testTriangles(int a, int b, int c){
      return ((a+b>c)&&(c+b>a)&&(a+c>b));
    }
  }
