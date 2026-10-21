import java.lang.Math;

public class Main {

     public static double rightTriangle (double sideALen, double sideBLen, double sideCLen) {
          double sqrtVal = 0;

          if (sideALen == 0 || sideBLen == 0) {
               double val1 = Math.pow((sideCLen), 2);

               double orValue = (sideALen == 0) ? sideBLen : sideALen; 
               double val2 = Math.pow((orValue), 2);

               double sumValue = val1 - val2;
               sqrtVal = Math.sqrt(sumValue);
          }
          else {
               double val1 = Math.pow((sideALen), 2);
               double val2 = Math.pow((sideBLen), 2);

               double sumValue = val1 + val2;
               sqrtVal = Math.sqrt(sumValue);
          }
          return sqrtVal; 
     }

     
     public static void main (String[] args) {
          System.out.println(rightTriangle(100,100,100));    
     }    
}

    