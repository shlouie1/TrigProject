import java.lang.Math;

public class LawOfCosines {

	//returns value of angle A from Law of Cosines
     public static double lawOfCosinesSSSAngleA (double sideALen, double sideBLen, double sideCLen) {
          //SSS scenario, finds missing angle value
          double numerator = Math.pow(sideBLen, 2) + Math.pow(sideALen, 2) - Math.pow(sideCLen, 2);
          double denominator = 2 * sideALen * sideBLen;
          double angleA = (numerator / denominator);

          return angleA;   
     }

     //returns value of angle B from Law of Cosines
     public static double lawOfCosinesSSSAngleB (double sideALen, double sideBLen, double sideCLen) {
          //SSS scenario, finds missing angle value

          double numerator = Math.pow(sideALen, 2) + Math.pow(sideCLen, 2) - Math.pow(sideBLen, 2);
          double denominator = 2 * sideALen * sideCLen;
          double angleB = (numerator / denominator);

          return angleB; 
     }

     //returns value of angle C from Law of Cosines SSS value
     public static double lawOfCosinesSSSAngleC (double sideALen, double sideBLen, double sideCLen) {
          //SSS scenario, finds missing angle value
          double numerator = Math.pow(sideALen, 2) + Math.pow(sideBLen, 2) - Math.pow(sideCLen, 2);
          double denominator = 2 * sideALen * sideBLen;
          double angleC = (numerator / denominator);

          return angleC;
     }

     //law of cosies for different sides of SAS
     //maybe condense into one method in the future, but this does make things simpler
     public static double lawOfCosinesSASSideA (double sideBLen, double degreeValue, double sideCLen) {
          double radians = BasicMethods.degreesToRad(degreeValue);
          double sideA = (Math.pow(sideBLen, 2) + Math.pow(sideCLen, 2)) - (2 * (sideBLen * sideCLen) * Math.cos(radians));
          sideA = Math.sqrt(sideA);

          return sideA;
     }

     public static double lawOfCosinesSASSideB (double sideALen, double degreeValue, double sideCLen) {
          double radians = BasicMethods.degreesToRad(degreeValue);
          double sideB = (Math.pow(sideALen, 2) + Math.pow(sideCLen, 2)) - (2 * (sideALen * sideCLen) * Math.cos(radians));
          sideB = Math.sqrt(sideB);

          return sideB;
     }

     public static double lawOfCosinesSASSideC (double sideALen, double degreeValue, double sideBLen) {
          double radians = BasicMethods.degreesToRad(degreeValue);
          double sideC = (Math.pow(sideALen, 2) + Math.pow(sideBLen, 2)) - (2 * (sideALen * sideBLen) * Math.cos(radians));
          sideC = Math.sqrt(sideC);

          return sideC;
     }

}