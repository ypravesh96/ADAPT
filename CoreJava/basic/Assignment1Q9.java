package basic;
import java.util.*;

class Student {
    private int subjectA,subjectB,subjectC;


    public void setMarks(int a,int b,int c)
    {
        subjectA = a;
        subjectB = b;
        subjectC = c;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int total=0;
        for(int i=0;i<students.length;i++)
        {
            total += students[i].subjectA + students[i].subjectB + students[i].subjectC;
        }
        return total;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        double total=0.0;
        for(int i=0;i<students.length;i++)
        {
            total += students[i].subjectA + students[i].subjectB + students[i].subjectC;
        }
        return total/students.length;
    }

    public int[] subjectWiseMarks(Student[] students,String subjectName) {
        int k=0;
        int marks[] = new int[students.length];
        for(int i=0;i<students.length;i++)
        {
            if(subjectName=="subjectA"){
            marks[k]= students[i].subjectA;
            k++;
            }
            if(subjectName=="subjectB"){
                marks[k]= students[i].subjectB;
                k++;
            }
            if(subjectName=="subjectC"){
                marks[k]= students[i].subjectC;
                k++;
            }
        }
        return marks;
    }

    public int subjectATotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }
    public int subjectBTotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }
    public int subjectCTotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }

    public int subjectTotalByStudents(int[] marks) {
        int total=0;
        for(int i=0;i<marks.length;i++)
        {
            total += marks[i] ;
        }
        return total;
    }

    public double subjectAAverageByStudents(int[] marks) {
        double total;
        total = subjectTotalByStudents(marks);
        return total/marks.length;
    }
    public double subjectBAverageByStudents(int[] marks) {
        double total;
        total = subjectTotalByStudents(marks);
        return total/marks.length;
    }
    public double subjectCAverageByStudents(int[] marks) {
        double total;
        total = subjectTotalByStudents(marks);
        return total/marks.length;
    }

}

public class Assignment1Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Student students[] = new Student[3];
        int a,b,c;
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter student"+(i+1)+" marks for 3 subjects");
            a= s.nextInt();
            b= s.nextInt();
            c= s.nextInt();
            students[i] = new Student();
            students[i].setMarks(a,b,c);
        }
        Student student = new Student();
        System.out.print("Student Total marks in all Subject : ");
        System.out.println(student.studentsTotalMarksInAllSubjects(students));
        System.out.print("Student Average marks in all Subject : ");
        System.out.println(student.studentsAverageMarksInAllSubjects(students));
        int marksA[] = student.subjectWiseMarks(students,"subjectA");
        int marksB[] = student.subjectWiseMarks(students,"subjectB");
        int marksC[] = student.subjectWiseMarks(students,"subjectC");
        System.out.print("Student Subject A Total marks in all Subject : ");
        System.out.println(student.subjectATotalByStudents(marksA));
        System.out.print("Student Subject A average marks in all Subject : ");
        System.out.println(student.subjectAAverageByStudents(marksA));
        System.out.print("Student Subject B Total marks in all Subject : ");
        System.out.println(student.subjectBTotalByStudents(marksB));
        System.out.print("Student Subject B Average marks in all Subject : ");
        System.out.println(student.subjectBAverageByStudents(marksB));
        System.out.print("Student Subject C Total marks in all Subject : ");
        System.out.println(student.subjectCTotalByStudents(marksC));
        System.out.print("Student Subject C average marks in all Subject : ");
        System.out.println(student.subjectCAverageByStudents(marksC));
    }
}
