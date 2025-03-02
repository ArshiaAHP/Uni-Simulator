package uni;

import java.util.ArrayList;

public class Professor {
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personID;
    public int majorID;

    public Professor(int personID, int majorID){
        this.id = professorList.size() + 1;
        this.personID = personID;
        this.majorID = majorID;
        professorList.add(this);
    }

    public static Professor findByID(int id){
        for(Professor i: professorList){
            if(i.id == id){
                return i;
            }
        }
        return null;
    }

}
