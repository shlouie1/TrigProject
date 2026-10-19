import java.lang.Math;

public class Main {

     public static double rightTriangle (double sideALen, double sideBLen, double sideCLen) {
          double val1 = 0;
          double val2 = 0;
          double orValue = 0;
          double sumValue = 0;
          double sqrtVal = 0;

          if (sideALen == 0 || sideBLen == 0) {
               val1 = Math.pow((sideCLen), 2);

               orValue = (sideALen == 0) ? sideBLen : sideALen; 
               val2 = Math.pow((orValue), 2);

               sumValue = val1 - val2;
               sqrtVal = Math.sqrt(sumValue);
          }
          else {
               val1 = Math.pow((sideALen), 2);
               val2 = Math.pow((sideBLen), 2);

               sumValue = val1 + val2;
               sqrtVal = Math.sqrt(sumValue);
          }
          return sqrtVal; 
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

     public static double arcSin (double angle) {
          double arcSin = Math.asin(angle);
          return arcSin;
     }

     public static double arcCos (double angle) {
          double arcCos = Math.acos(angle);
          return arcCos;
     }

     public static double arcTan (double angle) {
          double arcTan = Math.atan(angle);
          return arcTan;
     }

     //returns value of angle A from Law of Cosines
     public static double lawOfCosinesSSSAngleA (double sideALen, double sideBLen, double sideCLen) {
          //SSS scenario, finds missing angle value
          double numerator = 0;
          double denominator = 0;
          double result = 0;

          numerator = numerator + Math.pow(sideBLen, 2) + Math.pow(sideALen, 2) - Math.pow(sideCLen, 2);
          denominator = 2 * sideALen * sideBLen;
          result = (numerator / denominator);

          return result;   
     }

     //returns value of angle B from Law of Cosines
     public static double lawOfCosinesSSSAngleB (double sideALen, double sideBLen, double sideCLen) {
          //SSS scenario, finds missing angle value
          double numerator = 0;
          double denominator = 0;
          double result = 0;

          numerator = numerator + Math.pow(sideALen, 2) + Math.pow(sideCLen, 2) - Math.pow(sideBLen, 2);
          denominator = 2 * sideALen * sideCLen;
          result = (numerator / denominator);

          return result; 
     }

     //returns value of angle C from Law of Cosines
     public static double lawOfCosinesSSSAngleC (double sideALen, double sideBLen, double sideCLen) {
          //SSS scenario, finds missing angle value
          double numerator = 0;
          double denominator = 0;
          double result = 0;

          numerator = numerator + Math.pow(sideALen, 2) + Math.pow(sideBLen, 2) - Math.pow(sideCLen, 2);
          denominator = 2 * sideALen * sideBLen;
          result = (numerator / denominator);

          return result;
     }

     public static double lawOfCosinesSASSideA (double sideBLen, double sideCLen, double degreeValue) {
          double sideA = (Math.pow(sideBLen, 2) + Math.pow(sideCLen, 2)) - (2 * (sideBLen * sideCLen) * cosValue(degreeValue));
          sideA = Math.sqrt(sideA);
          return sideA;
     }

     public static double lawOfCosinesSASSideB (double sideALen, double sideCLen, double degreeValue) {
          double sideB = (Math.pow(sideALen, 2) + Math.pow(sideCLen, 2)) - (2 * (sideALen * sideCLen) * cosValue(degreeValue));
          sideB = Math.sqrt(sideB);
          return sideB;
     }

     public static double lawOfCosinesSASSideC (double sideALen, double sideBLen, double degreeValue) {
          double sideC = (Math.pow(sideALen, 2) + Math.pow(sideBLen, 2)) - (2 * (sideALen * sideBLen) * cosValue(degreeValue));
          sideC = Math.sqrt(sideC);
          return sideC;
     }

     public static double lawOfSinesASASideA (double angleA, double otherAngle) {

     }

     public static void main (String[] args) {
          System.out.println(rightTriangle(3, 4, 0));
     }    
}