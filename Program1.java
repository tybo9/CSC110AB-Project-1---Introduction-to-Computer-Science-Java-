/** <------- JAVA DOC
 *Ayoub Rammo

 *Program 1 

 *Java110AB

 *This program will ask you to enter 3 assignments name,score and total score. However, to make the program work you need to answer each one of them compeletely. 
The format table and the presentage is on the bottom of the page.  
 *//// <-------- JAVA DOC

import java.text.DecimalFormat; //<------ to get decimal of the score & totalnumber
import java.util.Scanner; // <------ Uses to type on keyboard

public class Program1 //name of the assignment
{ //open
    public static void main(String[]args) //<----- To Run the program recuired 
    { //open
        String name1, name2, name3; //String Names

        double score1, score2, score3 ; //<---- Scores for each

        double total1, total2,total3; // <------ Totals
        double grade; //final grade 
        //Scanners
        Scanner keyboard = new Scanner(System.in); //<-- to type the answer

        System.out.println ("Enter the name of the assignment: "); //This will show up on applet screen
        name1 = keyboard.nextLine(); //<----- Type the first assignment name

        System.out.println ("Enter your score : "); //This will show up on applet screen
        score1 = keyboard.nextDouble(); //<------ Type in score 1 

        System.out.println ("Enter total points possible: "); //This will show up on applet screen
        total1 = keyboard.nextDouble(); //<------ Type in Total1 

        keyboard.nextLine(); //Skip line

        System.out.println ("Enter the name of the assignment: "); //This will show up on applet screen
        name2 = keyboard.nextLine(); // <------- Tye in name of the assignment 2 

        System.out.println ("Enter your score : "); //This will show up on applet screen
        score2 = keyboard.nextDouble(); //<-------- Type in Score 2

        System.out.println ("Enter total points possible: "); //This will show up on applet screen
        total2 = keyboard.nextDouble(); //<------- Type in Total 

        keyboard.nextLine(); //Skip line

        System.out.println ("Enter the name of the assignment: "); //This will show up on applet screen
        name3 = keyboard.nextLine();

        System.out.println ("Enter your score : "); //This will show up on applet screen
        score3 = keyboard.nextDouble(); //<-------- Type in Score 3 

        System.out.println ("Enter total points possible: "); //This will show up on applet screen
        total3 = keyboard.nextDouble(); // <---------- Type in Score
        //Scores divided by total
        grade = (score1+score2+score3)/(total1+total2+total3); //<-------- Grading Process

        //Table Output Format
        System.out.printf("%-30s %6s %6s \n", "Exercise" , "Score", //<--------- Table 
            "Total Possible"); 

        System.out.printf("%-30s %6s %6s \n", name1 , score1, // <--------- Table
            total1);
        keyboard.nextLine(); //Space

        System.out.printf("%-30s %6s %6s \n", name2 , score2, //<------- Table
            total2);

        System.out.printf("%-30s %6s %6s \n", name3 , score3, //<---------- Table
            total3);

        //Your Percentage  
        DecimalFormat percent = new DecimalFormat ("0.00%"); //<--------- For Persentage 
        System.out.println ("Your percent is " + percent.format (grade) ); //<------- Show up on screen 
        //System.out.println("Your percent is "+ grade+"%.");
        //System.out.println(); //space
        double scoretotal = score1 + score2 + score3 ; //<------- Add Scores 
        double totalpoints = total1 + total2 + total3 ; //<------- Add Totals
        System.out.println ("Your total score is  " + scoretotal + " Out of " + totalpoints ); //<-------- Total points 
        double finalGrade = scoretotal/totalpoints;

        //Letter Grade 
        if (finalGrade >= 0.00 && finalGrade <= 59.99) //<--- Grading range
            //System.out.println("You got an F. Failure"); 
        if (finalGrade >=60.00 && finalGrade <= 69.99) //<-- Grading range
            //System.out.println("You got a D. Below Average"); 
        if (finalGrade >=70.00 && finalGrade <= 79.99) //<---- Grading range
            //System.out.println ("You got a C. Average"); 
        if (finalGrade >=80.00 && finalGrade <= 89.99) //<--- Grading range
            //System.out.println("You got a B. Above Average"); 
        if (finalGrade >=90.00 && finalGrade <= 100.00) //<----- Grading range
            //System.out.println ("You got an A. Excelent"); 
        if (finalGrade >100.1) //<----- Grading range
        {
            System.out.println("You got A+");
        }
                    
        //         if  
        //         System.out.println ("Your Grade is a B "); 

    } 
}    