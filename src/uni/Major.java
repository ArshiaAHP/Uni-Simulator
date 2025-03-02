package uni;

import java.util.ArrayList;

public class Major {
    public int id = 0;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents = 0;

    public Major(String name, int capacity) {
        this.id = majorList.size() + 1;
        this.name = name;
        this.capacity = capacity;
        this.numberOfStudents = 0;
        majorList.add(this);
    }

    public static Major findByID(int id){
        for (Major i : majorList){
            if(i.id == id){
                return i;
            }
        }
        return null;
    }

    public void addStudent(){
        if(numberOfStudents+1 < capacity){
            numberOfStudents++;
        }else{
            System.out.println("Maximum number of students has acquired this Major.");
        }
    }


}
