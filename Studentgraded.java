import java.util.*;
public class Studentgraded {
//    public static void takeInput(float ph , float mat , float che , float eng , float heal){
//        System.out.println("Enter the subject mark");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the mark of Physics: ");
//        ph = sc.nextFloat();
//        System.out.print("Enter the mark of Maths: ");
//        mat = sc.nextFloat();
//        System.out.print("Enter the mark of Chemistry: ");
//        che = sc.nextFloat();
//        System.out.print("Enter the mark of English: ");
//        eng = sc.nextFloat();
//        System.out.print("Enter the mark of Health: ");
//        heal = sc.nextFloat();
//    }
    public static float calculateTotalMark(float ph , float mat , float che , float eng , float heal){
        return (ph+mat+che+eng+heal);
    }
    public static float calculateAvgPercentage(float totalMark , int no){
        return (totalMark/no);
    }
    public static String CalculateGrade(float AvgPerc){
        if(AvgPerc>=80 && AvgPerc<=100) {
            return "A+";
        }
        else if(AvgPerc>=60 && AvgPerc<80)
        {
            return "A";
        }
        else if(AvgPerc>=40 && AvgPerc<60)
        {
            return "Pass";
        }
        else return "Fail";

    }
    public static void main(String[] args){
        // lets make sure that there are four subject
        float Physic=0,Math=0,Chemistry=0,English=0,Health=0;
        int noOfSubject = 5;
        System.out.print("Enter the subject mark");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark of Physics: ");
        Physic = sc.nextFloat();
        System.out.print("Enter the mark of Maths: ");
        Math = sc.nextFloat();
        System.out.print("Enter the mark of Chemistry: ");
        Chemistry = sc.nextFloat();
        System.out.print("Enter the mark of English: ");
        English = sc.nextFloat();
        System.out.print("Enter the mark of Health: ");
        Health = sc.nextFloat();
      float totalMark =   calculateTotalMark(Physic,Math,Chemistry,English,Health);
      System.out.println("Here Total mark obtened is: " + totalMark);

      float AvgPerc = calculateAvgPercentage(totalMark,noOfSubject);
      System.out.println("Here Total Average Percentage is: " + AvgPerc + "%");

     System.out.println("The Grade obtained is: " + CalculateGrade(AvgPerc));
    }
}
