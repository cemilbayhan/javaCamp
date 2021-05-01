package WEEK2;

public class UserManager {
    public void Add(User user){
        System.out.println("User eklendi"+user.getFname()+" "+user.getLname());
    }
    public void Delete(User user){
        System.out.println("User silindi"+user.getFname()+" "+user.getLname());
    }
    public void Update(User user){
        System.out.println("User güncellendi"+user.getFname()+" "+user.getLname());
    }
}
