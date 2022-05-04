package Tugas;
import java.util.Scanner;
public class T4MhsMain {
    public static void menu(){
        System.out.println("\nPilihan menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian paling depan");
        System.out.println("4. Cek Antrian Paling Belakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Cek Antrian Mahasiswa");
        System.out.println("7. Cetak Data Mahasiswa");
        System.out.println("8. Exit");
        System.out.println("---------------------------------------------------------------------");
    }   
    public static void main(String[] args) {
        SLLMhsT4 sllM = new SLLMhsT4();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int pilih;
        do{
            menu();
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("\nNIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sllM.addData(nim, nama, absen, ipk);
                    System.out.println("");
                    break;
                case 2:
                    sllM.remove();
                    System.out.println("");
                    break;
                case 3:
                    sllM.antrianTerdepan();
                    System.out.println("");
                    break;
                case 4:
                    sllM.antrianTerbelakang();
                    System.out.println("");
                    break;
                case 5:
                    sllM.print();
                    System.out.println("");
                    break;
                case 6:
                    System.out.print("Masukkan NIM : ");
                    String cari = input.nextLine();
                    sllM.searchDataOfNim(cari);
                    System.out.println("");
                    break;
                case 7:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int index = sc.nextInt();
                    sllM.searchDataOfIndex(index);
                    break;
                case 8:
                    System.out.println("TERIMA KASIH....");
                    System.exit(0);
                    break;
            }
        } while (pilih > 0 && pilih < 9);
        System.out.println("TERIMA KASIH...");
    }
}
