package uni;

import java.util.ArrayList;

public class Student {
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;

    public Student(int personID, int entranceYear, int majorID){
        this.id = studentList.size() + 1;
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        setStudentCode();
        studentList.add(this);
    }


    public static Student findByID(int id){
        for(Student i: studentList){
            if(i.id == id){
                return i;
            }
        }
        return null;
    }

    public void setStudentCode(){
        var major = Major.findByID(this.majorID);
        if(major == null){
            System.out.println("Major Not Found!");
        }else{
            if(this.majorID > 9){
                this.studentID = this.entranceYear + "" + this.majorID;
            }else{
                this.studentID = this.entranceYear + "0" + this.majorID;
            }

            if(this.id > 9){
                this.studentID += this.id + "";
            }else{
                this.studentID += "0" + this.id;
            }
        }

    }
}
