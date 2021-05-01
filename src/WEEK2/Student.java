package WEEK2;

public class Student extends User{
    private String school;

    //CONSTRUCTOR
    public Student(int id,String fname,String lname,String school){
        super(id,fname,lname);
        this.school = school;
    }


    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
}
