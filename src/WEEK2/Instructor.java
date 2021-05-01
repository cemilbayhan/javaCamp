package WEEK2;

public class Instructor extends User{
    private String job;

    //CONSTRUCTOR
    public Instructor(int id,String fname,String lname,String job){
        super(id,fname,lname);
        this.job = job;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
