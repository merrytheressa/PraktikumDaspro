package jobsheet5;
import java.util.Scanner;
public class soalsatu13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String kartu_Mahasiswa, registrasi_Online = sc.nextLine();
        System.out.println("Apakah membawa kartu mahasiswa? (membawa/tidak)");
        kartu_Mahasiswa = sc.nextLine();
        System.out.println("Apakah sudah melakukan registrasi online? (sudah/belum)");
        registrasi_Online = sc.nextLine();

        if (kartu_Mahasiswa.equalsIgnoreCase("membawa") || registrasi_Online.equalsIgnoreCase("sudah")){
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Ditolak masuk");
        }
    }
}

