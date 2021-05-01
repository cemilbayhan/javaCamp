package WEEK2;

public class Main {
    public static void main(String[] args){

        //Definition of new Instructor with polymorphism
        User user=new Instructor(1,"Engin","Demiroğ","Bilgisayar Mühendisi");

        //Definition of new Student with polymorphism
        User user1=new Student(2,"Cemil","Bayhan","Marmara University");

        UserManager userManager=new InstructorManager(user);
        UserManager userManager1=new InstructorManager(user1);

        System.out.println("Instructor Info:\n" +"ID: "+user.getId()+
                "\nAd Soyad: "+user.getFname()+" "+user.getLname()+
                "\nMesleği: "+ ((Instructor) user).getJob());

        System.out.println("\nStudent Info:\n" +"ID: "+user1.getId()+
                "\nAd Soyad: "+user1.getFname()+" "+user1.getLname()+
                "\nMesleği: "+ ((Student) user1).getSchool());
    }
}
