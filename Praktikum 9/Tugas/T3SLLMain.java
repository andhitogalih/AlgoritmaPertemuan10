package Tugas;

public class T3SLLMain {
    public static void main(String[] args) {
        SLLT3 sllStack = new SLLT3();
        sllStack.pushAwal("Bahasa");
        sllStack.print();
        sllStack.pushAwal("Android");
        sllStack.print();
        sllStack.pushAwal("Komputer");
        sllStack.print();
        sllStack.pushAwal("Basis Data");
        sllStack.print();
        sllStack.pushAwal("Matematika");
        sllStack.print();
        sllStack.pushAwal("Algoritma");
        sllStack.print();
        sllStack.pushAwal("Statistika");
        sllStack.print();
        sllStack.pushAwal("Multimedia");
        sllStack.print();

        System.out.println("Isi Stack: ");
        sllStack.print();
        sllStack.peek();
    }
}
