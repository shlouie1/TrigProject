public class BasicMethods {

	//converts radians to degrees, useful later maybe?
     public static double radToDegree (double radians) {
          double degrees = radians * (180 / Math.PI);
          return degrees;
     }

     //converts degrees to radians
     // useful because Math.<TRIG_FUNCTION_NAME> passes arguments as radians (instead of degrees)
     public static double degreesToRad (double degrees) {
          double radians = degrees * (Math.PI / 180);
          return radians;
     }

     //returns result of missing angle  
     //angleA and angleB parameters refer to the two known angles, regardless of 'true' name
     public static double triangleMissingAngle (double angleA, double angleB) {
          double totalTriangleDegrees = 180;
          double angleC = totalTriangleDegrees - angleA - angleB;

          return angleC;
     }

     //returns result of missing side length of a right triangle
     //sides A and B refer to the legs, side C refers to they hypotenuse
     public static double rightTriangleMissingSideLength (double sideALen, double sideBLen, double sideCLen) {
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



     //Basic sin, cos, and tan values, unused now
     public static double sinValue (double oppositeSideLen, double hypotSideLen) {
          double sinValue = (oppositeSideLen / hypotSideLen);
          return sinValue;
     }

     public static double cosValue (double adjacentSideLen, double hypotSideLen) {
          double cosValue = (adjacentSideLen / hypotSideLen);
          return cosValue;
     }

     public static double tanValue (double oppositeSideLen, double adjacentSideLen) {
          double tanValue = (oppositeSideLen / adjacentSideLen);
          return tanValue;
     }

     //these output the arc<function> as degrees (as opposed to radians)
     public static double arcSin (double angle) {
          double arcSin = Math.asin(angle);
          double degrees = radToDegree(arcSin);
          return degrees;
     }

     public static double arcCos (double angle) {
          double arcCos = Math.acos(angle);
          double degrees = radToDegree(arcCos);
          return degrees;
     }

     public static double arcTan (double angle) {
          double arcTan = Math.atan(angle);
          double degrees = radToDegree(arcTan);
          return degrees;
     }
}