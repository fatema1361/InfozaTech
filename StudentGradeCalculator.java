import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of subjects: ");
       int subjects=sc.nextInt();
       int totalMarks=0;
       for(int i=1;i<=subjects;i++){
            System.out.print("Enter marks for subjects "+i+":");
            int marks=sc.nextInt();

            if(marks>=0&&marks<=100){
                totalMarks+=marks;
            }
            else{
                System.out.println("Invalid marks!Enter again.");
                i--;
            }
       }
        double avg=(double)totalMarks/subjects;
        char grade;
        if(avg>=80){
            grade='A';
        }
        else if(avg>=70){
            grade='B';
        }
        else if(avg>=60){
            grade='C';
        }
        else if(avg>=50){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println("\n===== Student Result =====");
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average: " +avg+"%");
        System.out.println("Final Grade: "+grade);
        sc.close();

       
    }
}
