package Week1;

import java.util.Scanner;

public class Student {
    private String nameSurname;
    private String password;
    private String email;
    Scanner sc = new Scanner(System.in);
    public Student(String nameSurname,String email,String password){
        this.nameSurname = nameSurname;
        this.email = email;
        this.password = password;
    }
    public String getNameSurname(){
        return nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    public String getEmail(){
        return email;
    }
    public void  setEmail(String email){
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void SignIn(Student student){
        System.out.print("Adınızı Soyadınızı giriniz: ");
        student.nameSurname = sc.nextLine();
        System.out.print("E-postanızı giriniz: ");
        student.email = sc.nextLine();
        System.out.print("Şifre giriniz: ");
        student.password = sc.nextLine();
    }
    public void LogIn(){
        System.out.print("E-postanızı giriniz: ");
        email = sc.nextLine();
        System.out.print("Şifre giriniz: ");
        password = sc.nextLine();
    }
}
