package uni;

import base.Person;

import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript = new HashMap<>();

    public Transcript(int studentID){
        this.studentID = studentID;
    }

    public void setGrade(int presentedCourseID, double grade){
        PresentedCourse presentedCourse = PresentedCourse.findByID(presentedCourseID);
        if(presentedCourse != null){
            if(presentedCourse.studentIDs.contains(this.studentID)){
                transcript.put(presentedCourseID,grade);
            }else{
                System.out.println("Student not found!");
            }
        }else{
            System.out.println("Course not found!");
        }
    }

    public void printTranscript(){
        Student student = Student.findByID(this.studentID);
        Person person = Person.findByID(student.personID);
        System.out.println("-" + person.name + "   " + student.studentID);
        for(PresentedCourse p : PresentedCourse.presentedCourseList){
            if(p.studentIDs.contains(this.studentID)){
                System.out.println(Course.findByID(p.courseID).title + ": " + transcript.get(p.id));
            }else{
                continue;
            }
        }
    }

    public double getGPA(){
        int allUnits = 0;
        double allGrades = 0;
        Student student = Student.findByID(this.studentID);
        for(PresentedCourse p : PresentedCourse.presentedCourseList){
            if(p.studentIDs.contains(this.studentID)){
                allUnits += Course.findByID(p.courseID).units;
                allGrades += transcript.get(p.id)*Course.findByID(p.courseID).units;
            }
        }
        return allGrades/allUnits;
    }

}
