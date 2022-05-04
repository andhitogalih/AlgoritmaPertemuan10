package Tugas;

public class MhsT4 {
    String nim, nama;
    int absen;
    double ipk;
    MhsT4 next;

    MhsT4(String nim, String nama, int absen, double ipk, MhsT4 next){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = next;
    }
}
