package Tugas;

public class SLLT2 {
    ilustrasiLinkedList head;
        ilustrasiLinkedList tail;
    
        public boolean isEmpty(){
            return head == null;
        }
    
        public void print(){
            if(!isEmpty()){
                ilustrasiLinkedList tmp = head;
                System.out.print("Isi Linked List:\t");
                while (tmp != null){
                    System.out.print(tmp.data + "\t");
                    tmp = tmp.next;
                }
                System.out.println("");
            }else{
                System.out.println("Linked list kosong");
            }
        }
    
        public void addFirst(char input){
            ilustrasiLinkedList ndInput = new ilustrasiLinkedList(input, null);
            if(isEmpty()){
                head = ndInput;
                tail = ndInput;
            }else{
                ndInput.next = head;
                head = ndInput;
            }
        }
    
        public void addLast(char input){
            ilustrasiLinkedList ndInput = new ilustrasiLinkedList(input, null);
            if(isEmpty()){
                head = ndInput;
                tail = ndInput;
            }else{
                tail.next = ndInput;
                tail = ndInput;
            }
        }
    
        public void insertAfter(char key, char input){
            ilustrasiLinkedList ndInput = new ilustrasiLinkedList(input, null);
            ilustrasiLinkedList temp = head;
            do{
                if(temp.data == key){
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if(ndInput.next == null) tail = ndInput;
                    break;
                }
                temp = temp.next;
            }while (temp != null);
        }
        
        public void insertBefore(char key, char input){
            ilustrasiLinkedList ndInput = new ilustrasiLinkedList(input, null);
            ilustrasiLinkedList temp = head;
            do{
                if((temp.data == key) && (temp == head)){
                    this.addFirst(input);
                    break;
                }else if (temp.next.data == key){
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    break;
                }
                temp = temp.next;
            }while (temp != null);
        }
        public void insertAt(int index, char input){
            if(index < 0){
                System.out.println("indeks salah");
            }else if(index == 0){
                addFirst(input);
            }else{
                ilustrasiLinkedList temp = head;
                for(int i=0; i<index-1; i++){
                    temp = temp.next;
                }
                temp.next = new ilustrasiLinkedList(input, temp.next);
                if(temp.next.next == null) tail = temp.next;
            }
        }
    }

