/**
 * This program StudentGPA accepts year, term, name_course, credit, grad.
 * output format is " Enter grads of student (year term name_course credit grad)
 *                    Finish when enter year with 0
 *                    <year, term, name_course, credit, grad>
 *                    Type in 'o' to see all courses, 'a' for accumulated GPA
 *                    't' for GPA for specific term or 'q' to exit"
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:January 19, 2021
 *
 **/

package treeechan.treepaech.lab4;

import java.util.Scanner;

public class StudentGPA {
    static int MAX_NUMBER_OF_COURSES = 150;
    static int[] year = new int[MAX_NUMBER_OF_COURSES];
    static int[] term = new int[MAX_NUMBER_OF_COURSES];
    static String[] coursesName = new String[MAX_NUMBER_OF_COURSES];
    static int[] coursesCredit = new int[MAX_NUMBER_OF_COURSES];
    static String[] grades = new String[MAX_NUMBER_OF_COURSES];
    static int numberOfCourses = 0;
    public static void main(String[] args){
        inputGrades();
        showGPA();
    }
    public static void inputGrades(){
        Scanner data = new Scanner(System.in);
        int checkNumber = 1;
        String allData;
        System.out.println("Enter grads of student (year term name_course credit grad)");
        System.out.println("Finish when enter year with 0");
        while (checkNumber != 0){
            allData = data.nextLine();
            splitData(allData);  // Send to a function that can separate messages
            checkNumber = year[numberOfCourses]; // Let checkNumber equal year[numberOfCourses]
            numberOfCourses++;
        }
    }
    public static void splitData(String allData){
        String[] dataSplit;
        dataSplit = allData.split(" ");
        if (dataSplit.length <= 3){
            // In case of wearing only one year
            year[numberOfCourses] = Integer.parseInt(dataSplit[0]);
            term[numberOfCourses] = 0;
            coursesName[numberOfCourses] = "0";
            coursesCredit[numberOfCourses] = 0;
            grades[numberOfCourses] = "0";
        }else {
            // dataSplit = { year, term, coursesName, coursesCredit, grades}
            //                0      1       2             3            4
            year[numberOfCourses] = Integer.parseInt(dataSplit[0]);
            term[numberOfCourses] = Integer.parseInt(dataSplit[1]);
            coursesName[numberOfCourses] = dataSplit[2];
            coursesCredit[numberOfCourses] = Integer.parseInt(dataSplit[3]);
            grades[numberOfCourses] = dataSplit[4];
        }
    }
    public static void showGPA(){
        Scanner choose = new Scanner(System.in);
        String dataChoose;
        System.out.println("Type in 'o' to see all courses, 'a' for accumulated GPA, 't' for GPA for specific term or 'q' to exit");
        dataChoose = choose.nextLine();
        switch (dataChoose){
            case "o" : seeAll(); // Show all courses
                 break;
            case "a" : accumulatedGPA(); // Shows the GPA of all subjects enrolled
                 break;
            case "t" : specificTerm();  // Show the grade point average of the specified year and term subjects
                 break;
            case "q" : System.exit(0); // Exit the program
        }
    }
    public static void seeAll(){
        // Show all subjects learned
        for (int i = 0; i < numberOfCourses - 1; i++){
            System.out.print(year[i] + " ");
            System.out.print(term[i] + " ");
            System.out.print(coursesName[i] + " ");
            System.out.print(coursesCredit[i] + " ");
            System.out.println(grades[i]);
        }
        showGPA();
    }
    public static void accumulatedGPA(){
        // Calculate the total GPA
        double gradeDouble;
        double sumGrade = 0;
        double sumCredit = 0;
        double gpa;
        for (int i = 0; i < numberOfCourses; i++){
            gradeDouble = convertGrades(grades[i]); // Convert grades from letters to numbers
            sumGrade += (coursesCredit[i] * gradeDouble); // Multiply the credits by the grades obtained
            sumCredit += coursesCredit[i]; // Total credits
        }
        gpa = sumGrade/sumCredit; // Calculate your GPA
        System.out.println("Accumulated GPA is " + gpa);
        showGPA();
    }
    public static void specificTerm(){
        // Calculate the GPA of the year and the specified subjects
        Scanner numData = new Scanner(System.in);
        int numYear, numTerm;
        double sumCreditSpecificTerm = 0;
        double sumGradeSpecificTerm = 0;
        double specificTermGPA;
        double gradeDouble;
        System.out.println("Enter which year and term do you want to see GPA");
        numYear = numData.nextInt();
        numTerm = numData.nextInt();
        for (int i = 0; i < numberOfCourses; i++){
            if (numYear == year[i]){
                if (numTerm == term[i]){
                    gradeDouble = convertGrades(grades[i]);  // Convert grades from letters to numbers
                    sumGradeSpecificTerm += (coursesCredit[i] * gradeDouble); // Multiply the credits by the grades obtained
                    sumCreditSpecificTerm += coursesCredit[i]; // Total credits
                }
            }
        }
        specificTermGPA = sumGradeSpecificTerm/sumCreditSpecificTerm; // Calculate your GPA
        System.out.println("Accumulated GPA is " + specificTermGPA);
        showGPA();
    }
    public static double convertGrades(String gradeString){
        // Convert grades from letters to numbers
        double numGrade = 0;
        switch (gradeString){
            case "A" : numGrade = 4.0;
                 break;
            case "B+" : numGrade = 3.5;
                break;
            case "B" : numGrade = 3.0;
                break;
            case "C+" : numGrade = 2.5;
                break;
            case "C" : numGrade = 2.0;
                break;
            case "D+" : numGrade = 1.5;
                break;
            case "D" : numGrade = 1.0;
                break;
            case "F" : numGrade = 0;
                break;
        }
        return numGrade;  // Returns the grade obtained
    }
}
