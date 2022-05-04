package Tugas;

public class T1SLLMain {
public static void main(String[] args) {
    SLLT1 singLL = new SLLT1();
    singLL.print();
    singLL.addFirst(890);
    singLL.print();
    singLL.addLast(760);
    singLL.print();
    singLL.addFirst(700);
    singLL.print();
    singLL.insertAfter(700, 999);
    singLL.print();
    singLL.insertAt(3, 833);
    singLL.print();
    singLL.insertBefore(890, 100);
    singLL.print();

    System.out.println("Data pada indekx ke-1 = " + singLL.gedData(1));
    System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(890));

    singLL.remove(999);
    singLL.print();
    singLL.removeAt(0);
    singLL.print();
    singLL.removeFirst();
    singLL.print();
    singLL.removeLast();
    singLL.print();
    }
}