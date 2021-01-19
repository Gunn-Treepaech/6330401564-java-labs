/**
 * This program StudentGPA accepts year, term, name_course, credit, grad.
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
            splitData(allData);
            checkNumber = year[numberOfCourses];
            numberOfCourses++;
        }
    }
    public static void splitData(String allData){
        String[] dataSplit;
        dataSplit = allData.split(" ");
        if (dataSplit.length == 1){
            year[numberOfCourses] = Integer.parseInt(dataSplit[0]);
            term[numberOfCourses] = 0;
            coursesName[numberOfCourses] = "0";
            coursesCredit[numberOfCourses] = 0;
            grades[numberOfCourses] = "0";
        }else {
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
            case "o" : seeAll();
                 break;
            case "a" : accumulatedGPA();
                 break;
            case "t" : specificTerm();
                 break;
            case "q" : System.exit(0);
        }
    }
    public static void seeAll(){
        for (int i = 0; i < numberOfCourses-1; i++){
            System.out.print(year[i] + " ");
            System.out.print(term[i] + " ");
            System.out.print(coursesName[i] + " ");
            System.out.print(coursesCredit[i] + " ");
            System.out.println(grades[i]);
        }
        showGPA();
    }
    public static void accumulatedGPA(){
        double gradeDouble = 0;
        double sumGrade = 0;
        double sumCredit = 0;
        double gpa;
        for (int i = 0; i < numberOfCourses; i++){
            gradeDouble = convertGrades(grades[i]);
            sumGrade += (coursesCredit[i] * gradeDouble);
            sumCredit += coursesCredit[i];
        }
        gpa = sumGrade/sumCredit;
        System.out.println("Accumulated GPA is " + gpa);
        showGPA();
    }
    public static void specificTerm(){
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
                    gradeDouble = convertGrades(grades[i]);
                    sumGradeSpecificTerm += (coursesCredit[i] * gradeDouble);
                    sumCreditSpecificTerm += coursesCredit[i];
                }
            }
        }
        specificTermGPA = sumGradeSpecificTerm/sumCreditSpecificTerm;
        System.out.println("Accumulated GPA is " + specificTermGPA);
        showGPA();
    }
    public static double convertGrades(String gradeString){
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
        return numGrade;
    }
}
