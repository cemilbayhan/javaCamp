package Week1;

import java.util.Scanner;

public class ProfileManager {
    String password;
    String newPassword;
    Scanner sc = new Scanner(System.in);

    public void changePassword(Student student) {
        System.out.print("Adınız Soyadınız : " + student.getNameSurname());
        System.out.print("E-postanız: " + student.getEmail());
        System.out.print("Şuanki şifrenizi giriniz: ");
        password = sc.nextLine();
        if (password == student.getPassword()) {
            System.out.print("Yeni şifrenizi giriniz: ");
            password = sc.nextLine();
            System.out.print("Yeni şifrenizi doğrulayınız: ");
            newPassword = sc.nextLine();
            if (newPassword == password) {
                student.setPassword(newPassword);
                System.out.println("Şifreniz başarıyla değiştirildi.");
            }
        }
    }
}
