package jobsheet5;
import java.util.Scanner;
public class soaldua13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String user;
    int SKS = 0;
        System.out.print("Masukkan status pengguna: ");
        user = sc.nextLine();

        if (user.equalsIgnoreCase("dosen")){
            System.out.println("Akses WiFi Diberikan (dosen)");
        } else if (user.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jummlah SKS yanng diambil: ");
            SKS = sc.nextInt();
                if (SKS >= 12){
                    System.out.println("Akses WiFi diberikan (mahasiswa)");
                } else {
                    System.out.println("Akses ditolak");
                }
        }
        else{
            System.out.println("Akses ditolak");
        }
    }   
}
