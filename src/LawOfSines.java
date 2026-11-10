import java.lang.Math;

public class LawOfSines { 

     //for the ASA methods Side<(A/B/C> refer to the side length that will be returned
     public static double lawOS_ASA_SideA (double angleA, double sideX, double angleX) {
          double radiansAngleA = BasicMethods.degreesToRad(angleA);
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double sideALen = Math.sin(radiansAngleA) * (sideX / Math.sin(radiansAngleX));
          
          return sideALen;
     }

     public static double lawOS_ASA_SideB (double angleB, double sideX, double angleX) {
          double radiansAngleB = BasicMethods.degreesToRad(angleB);
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double sideBLen = Math.sin(radiansAngleB) * (sideX / Math.sin(radiansAngleX));
          
          return sideBLen;
     }

     public static double lawOS_ASA_SideC (double angleC, double sideX, double angleX) {
          double radiansAngleC = BasicMethods.degreesToRad(angleC);
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double sideCLen = Math.sin(radiansAngleC) * (sideX / Math.sin(radiansAngleX));
          
          return sideCLen;
     }

     //for law of sines AAS angle A & side A are always the known angle & side
     //After AAS operation, use ASA method to finish triangle
     public static double lawOS_AAS_SideA (double angleA, double angleX, double sideA) {
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double radiansAngleA = BasicMethods.degreesToRad(angleA);

          double sideXLen = (Math.sin(radiansAngleX) * sideA) / (Math.sin(radiansAngleA));

          return sideXLen;
     }

     public static double lawOS_AAS_SideB (double angleB, double angleX, double sideB) {
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double radiansAngleB = BasicMethods.degreesToRad(angleB);

          double sideXLen = (Math.sin(radiansAngleX) * sideB) / (Math.sin(radiansAngleB));

          return sideXLen;
     }

      public static double lawOS_AAS_SideC (double angleC, double angleX, double sideC) {
          double radiansAngleX = BasicMethods.degreesToRad(angleX);
          double radiansAngleC = BasicMethods.degreesToRad(angleC);

          double sideXLen = (Math.sin(radiansAngleX) * sideC) / (Math.sin(radiansAngleC));

          return sideXLen;
     }


     //The SSA naming convention imply that 'A' refers the corresponding side & angle that is known
     //e.g. if you know side B and angle B, you will pass them in as sideA and angleA, respectively
     public static int lawOS_SSA_PossibleTriangleCount(double sideA, double sideB, double angleA) {
          boolean angleAObtuse = (angleA >= 90) ? true : false;
          int possibleTriangleCount = 0;

          switch (angleAObtuse) {
               case true:
                    possibleTriangleCount = (sideA <= sideB) ? 0 : 1;
                    break;
               case false: 
                    possibleTriangleCount = 0;
                    double height = sideB * (Math.sin(angleA));

                    if (sideA < height) {
                         possibleTriangleCount = 0;
                    }
                    else if (sideA == height || sideA >= sideB) {
                         possibleTriangleCount = 1;
                    }
                    else {
                         possibleTriangleCount = 2;
                    }

                    break;
          }

          return possibleTriangleCount;

     }

     public static double lawOS_SSA_SideCLen (double sideA, double sideB, double angleA) {
          System.out.println("");
          return 0;
     }
}