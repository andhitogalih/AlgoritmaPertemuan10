package Tugas;

public class SLLT3 {
    implementasiStack head;
    implementasiStack tail;
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void print(){
        if (!isEmpty()){
            implementasiStack tmp = head;
            System.out.println("");
            while (tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Stack Masih Kosong!");
        }
    }

    public void peek(){
        if(!isEmpty()){
            implementasiStack tmp = head;
            System.out.println("Isi Stack Teratas : " + tmp.data);
        }else{
            System.out.println("Stack Masing Kosong!");
        }
    }

    public void pushAwal(String input){
        implementasiStack ndInput = new implementasiStack(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
}
