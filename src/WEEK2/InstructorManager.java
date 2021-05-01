package WEEK2;

public class InstructorManager extends UserManager {
    public InstructorManager(User user) {
        super();
    }

    public void Add(Instructor instructor){
        System.out.println("User eklendi"+instructor.getFname()+" "+instructor.getLname());
    }
    public void Delete(Instructor instructor){
        System.out.println("User silindi"+instructor.getFname()+" "+instructor.getLname());
    }
    public void Update(Instructor instructor){
        System.out.println("User güncellendi"+instructor.getFname()+" "+instructor.getLname());
    }
}
