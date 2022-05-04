package Tugas;
import java.util.Scanner;

public class T4QueueMain {
    public static void menu(){
        System.out.println("\nPilihan menu: ");
        System.out.println("1. Antrian baru (Enqueue)");
        System.out.println("2. Antrian keluar (Dequeue)");
        System.out.println("3. Cek Antrian paling depan (Peek)");
        System.out.println("4. Cek Antrian Paling Belakang (Peek Rear)");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Cek Antrian Mahasiswa (Peek Position)");
        System.out.println("7. Cetak Data Mahasiswa (Peek At)");
        System.out.println("8. Kosongkan Antrian (Clear)");
        System.out.println("9. Exit");
        System.out.println("---------------------------------------------------------------------");
    }   

    public static void main(String[] args) {
        SLLQueueT4 sllM = new SLLQueueT4();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int pilih, jml;

        System.out.println("Masukkan Jumlah Mahasiswa: ");
        jml = sc.nextInt();
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
                    sllM.Enqueue(nim, nama, absen, ipk);
                    System.out.println("");
                    break;
                case 2:
                    sllM.Dequeue();
                    System.out.println("");
                    break;
                case 3:
                    sllM.peek();
                    System.out.println("");
                    break;
                case 4:
                    sllM.peekRear();
                    System.out.println("");
                    break;
                case 5:
                    sllM.print();
                    System.out.println("");
                    break;
                case 6:
                    System.out.print("Masukkan NIM : ");
                    String cari = input.nextLine();
                    sllM.peekPosition(cari);
                    System.out.println("");
                    break;
                case 7:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int index = sc.nextInt();
                    sllM.peekAt(index);
                    break;
                case 8:
                    sllM.clear(jml);
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("TERIMA KASIH....");
                    System.exit(0);
                    break;
            }
        } while (pilih > 0 && pilih < 10);
        System.out.println("TERIMA KASIH...");
    }
}
