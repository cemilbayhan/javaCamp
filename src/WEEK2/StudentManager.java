package WEEK2;

public class StudentManager extends UserManager{
    public StudentManager(User user) {
        super();
    }

    public void Add(Student student){
        System.out.println("User eklendi"+student.getFname()+" "+student.getLname());
    }
    public void Delete(Student student){
        System.out.println("User silindi"+student.getFname()+" "+student.getLname());
    }
    public void Update(Student student){
        System.out.println("User güncellendi"+student.getFname()+" "+student.getLname());
    }
}
