package Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
        Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        Course course3 = new Course("Programlamaya Giriş İçin Temel Kurs");
        Course[] courses =new Course[]{course1,course2,course3};

        ProfileManager profileManager = new ProfileManager();

        Student student=new Student("Cemil Bayhan","cemil123@kodlama.io","12345");

        int secim;
        Scanner scanner=new Scanner(System.in);
        System.out.println("\tGiriş yapmak için 1'e\n\tKayıt olmak için 2'ye basınız :");
        secim = scanner.nextInt();
        if(secim==1){
            student.SignIn(student);
            System.out.println("KAYIT BAŞARILI\nGiriş bilgilerinizi giriniz:");
            student.LogIn();
        }
        else if(secim==2){
            student.LogIn();
        }
        else{
            System.out.println("Hatalı giriş!!");
        }
    }
}
