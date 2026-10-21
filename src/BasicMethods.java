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

     public static double triangleMissingAngle (double angleA, double angleB, double angleC) {
          double totalTriangleDegrees = 180;

          if (angleA == 0) {
               angleA = totalTriangleDegrees - (angleB + angleC);
               return angleA;
          }

          else if (angleB == 0) {
               angleB = totalTriangleDegrees - (angleA + angleC);
               return angleB;
          }

          else if (angleC == 0) {
               angleC = totalTriangleDegrees - angleA - angleB;
               return angleC;
          }
          return (Double)null;
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