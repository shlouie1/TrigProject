import java.lang.Math;

public class LawOfSines { 

     public static double lawOfSinesASASideA (double angleA, double sideX, double angleX) {
          double radiansAngleA = BasicMethods.degreesToRad(angleA);
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double sideALen = Math.sin(radiansAngleA) * (sideX / Math.sin(radiansAngleX));
          
          return sideALen;
     }

     public static double lawOfSinesASASideB (double angleB, double sideX, double angleX) {
          double radiansAngleB = BasicMethods.degreesToRad(angleB);
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double sideBLen = Math.sin(radiansAngleB) * (sideX / Math.sin(radiansAngleX));
          
          return sideBLen;
     }

     public static double lawOfSinesASASideC (double angleC, double sideX, double angleX) {
          double radiansAngleC = BasicMethods.degreesToRad(angleC);
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double sideCLen = Math.sin(radiansAngleC) * (sideX / Math.sin(radiansAngleX));
          
          return sideCLen;
     }


     //for law of sines AAS angle A & side A are always the known angle & side
     //After AAS operation, use ASA method to finish triangle
     public static double lawOfSinesAASSideA (double angleA, double angleX, double sideA) {
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double radiansAngleA = BasicMethods.degreesToRad(angleA);

          double sideX = (Math.sin(radiansAngleX) * sideA) / (Math.sin(radiansAngleA));

          return sideX;
     }

     public static double lawOfSinesAASSideB (double angleB, double angleX, double sideB) {
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double radiansAngleB = BasicMethods.degreesToRad(angleB);

          double sideX = (Math.sin(radiansAngleX) * sideB) / (Math.sin(radiansAngleB));

          return sideX;
     }

      public static double lawOfSinesAASSideC (double angleC, double angleX, double sideC) {
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double radiansAngleC = BasicMethods.degreesToRad(angleC);

          double sideX = (Math.sin(radiansAngleX) * sideC) / (Math.sin(radiansAngleC));

          return sideX;
     }

     //This method's naming convention imply that A refers the corresponding side & angle that is known
     //e.g. if you know side B and angle B, you will pass them in as sideA and angleB, respectively
     public static double lawOfSinesSSASideA (double sideA, double sideB, double angleA) {
          double radiansAngleA = BasicMethods.degreesToRad(angleA);
          int possibleTriangleCount = 0;

          boolean angleObtuse = (angleA >= 90) ? true : false;

          double sinOfB = ((sideB * Math.sin(radiansAngleA)) / sideA);
          double angleB = BasicMethods.arcSin(sinOfB);

          if (sinOfB > 1) {
               return 0;
          }
          else if (sinOfB == 1) {
               possibleTriangleCount = 1;
          }
          else {
               possibleTriangleCount = 2;
          }

          if (possibleTriangleCount == 1) {
               double angleC = BasicMethods.triangleMissingAngle(angleA, angleB, 0);
          }
          return 190;
     }
}