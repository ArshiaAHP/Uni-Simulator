import base.Person;
import uni.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person ali = new Person("Ali", "2041");
        Person mo = new Person("Mo", "2042");
        Person akbar = new Person("Akbar", "2043");
        Person abbas = new Person("abbas", "2044");
        Person hamid = new Person("Hamid", "2045");

        Major majorCE = new Major("CE", 20);
        Major majorCS = new Major("CS", 20);

        Student aliStudent = new Student(1, 403, 1);
        Student moStudent = new Student(2, 403, 1);
        Student hamidStudent = new Student(5, 402, 2);

        for(Student s: Student.studentList){
            System.out.println(Person.findByID(s.personID).name + "  " + s.studentID);
        }

        Professor akbarProf = new Professor(3, 1);
        Professor abbasProf = new Professor(4, 2);

        System.out.println(); //new line for better reading

        for(Professor p: Professor.professorList){
            System.out.println(Person.findByID(p.personID).name + "  " + p.id);
        }

        Course math1 = new Course("Math I", 3);
        Course ap = new Course("AP", 4);
        Course accounting = new Course("accounting", 3);

        PresentedCourse math1Present = new PresentedCourse(1, 1, 10);
        PresentedCourse apPresent = new PresentedCourse(2, 1, 10);
        PresentedCourse accountingPresent = new PresentedCourse(3, 2, 10);

        math1Present.addStudent(1);
        math1Present.addStudent(2);

        apPresent.addStudent(1);
        apPresent.addStudent(2);
        apPresent.addStudent(3);

        accountingPresent.addStudent(3);

        Transcript aliTranscript = new Transcript(1);
        Transcript moTranscript = new Transcript(2);
        Transcript hamidTranscript = new Transcript(3);

        aliTranscript.setGrade(1, 20.0);
        aliTranscript.setGrade(2, 18.0);
        moTranscript.setGrade(1, 12.25);
        moTranscript.setGrade(2, 14.50);
        hamidTranscript.setGrade(2, 20.0);
        hamidTranscript.setGrade(3, 17.50);

        System.out.println();

        aliTranscript.printTranscript();
        moTranscript.printTranscript();
        hamidTranscript.printTranscript();

        System.out.println();

        var studentGPAs = new ArrayList<Double>();
        double aliGPA = aliTranscript.getGPA();
        double moGPA = moTranscript.getGPA();
        double hamidGPA = hamidTranscript.getGPA();

        System.out.printf("Ali's GPA: %.2f\n", aliGPA);
        System.out.printf("Mo's GPA: %.2f\n", moGPA);
        System.out.printf("Hamid's GPA: %.2f\n", hamidGPA);





    }
}