package Tugas;

public class implementasiLLQueue {
    String nim, nama;
    int absen;
    double ipk;
    implementasiLLQueue next;
    
    implementasiLLQueue(String nim, String nama, int absen, double ipk, implementasiLLQueue next){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = next;
    }
}
