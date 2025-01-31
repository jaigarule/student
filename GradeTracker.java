import java.util.*;


public class GradeTracker{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        // Enter total number of subjects to calculate their marks
         System.out.println("Enter total number of subjects:");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;
        int highestMarks = Integer.MIN_VALUE;
        int lowestMarks = Integer.MAX_VALUE;

        for(int i=1; i<=numSubjects; i++){
           System.out.println("Enter marks for subject"+ i +"(out of 100):");
           int marks = sc.nextInt();
           //input validation
           while(marks< 0 || marks > 100){
              System.out.println("Invalid marks. please 0 & 100.");
              System.out.println("Enter marks for subject"+i +"out of 100");
              marks = sc.nextInt();
            }
            
             totalMarks += marks;

             //update highest and lowest marks
             if(marks> highestMarks){
                highestMarks = marks;
             }
             if(marks < lowestMarks){
                lowestMarks = marks;
             }
        }

        System.out.println("Student Result:");
        System.out.println("Total marks obtained in all subject:"+ totalMarks);

        //calculate average perentage: divide the total marks by the total number of subjects to get the average percentage

        int AveragePercentage = totalMarks / numSubjects;
        System.out.println("AveragePercentage:"+ AveragePercentage);
         
        if(AveragePercentage>=90){
            System.out.println("Your grade: A+");
        }
        else if(AveragePercentage>=80){
            System.out.println("Your grade: B+");
        }
        else if(AveragePercentage>=70){
            System.out.println("Your grade: C+");
       
        }
        else if(AveragePercentage>=60){
        System.out.println("Your grade: C");
       }
        else if(AveragePercentage>=50){
            System.out.println("Your grade: D+");
        }
        else if(AveragePercentage>=40){
            System.out.println("Your grade: D+");
        }
       
        else {

            System.out.println("Your grade: E");
        }

        //display highest and lowest marks
        System.out.println("Highest marks:" + highestMarks);
        System.out.println("Lowest marks:" + lowestMarks);
      

        sc.close();

        }
       
    
}

