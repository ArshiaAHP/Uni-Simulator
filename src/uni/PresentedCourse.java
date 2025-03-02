package uni;

import base.Person;

import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int maxCapacity;
    public ArrayList<Integer> studentIDs = new ArrayList<>();

    public PresentedCourse(int courseID, int professorID, int maxCapacity){
        this.id = presentedCourseList.size() + 1;
        this.courseID = courseID;
        this.professorID = professorID;
        this.maxCapacity = maxCapacity;
        presentedCourseList.add(this);

    }

    public static PresentedCourse findByID(int id){
        for(PresentedCourse i: presentedCourseList){
            if(i.id == id){
                return i;
            }
        }
        return null;
    }

    public void addStudent(int studentID){
        if(studentIDs.size()+1 < maxCapacity){
            studentIDs.add(studentID);
        }else{
            System.out.println("Course is Full!");
        }
    }
}
