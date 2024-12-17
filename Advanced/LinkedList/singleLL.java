package LinkedList;

public class singleLL {

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    private Node head;
    private Node tail;
    int size=0;

    public void insertfront(int value){

        Node newNode= new Node(value);

        if(head==null){
            head=newNode;
            tail=head;
        }

        else{
            newNode.next=head;
            head=newNode;
        }
        size+=1; 
    }

    public void insert(int value,int index){
        if(index==0)
        insertfront(value);

        else if (index==size)
        insertend(value);

        else{
            Node newNode=new Node(value);
            Node temp=head;
            Node temp1;
            for(int i=1;i<index;i++)
                temp=temp.next;
                    
            temp1=temp.next;
            temp.next=newNode;
            newNode.next=temp1;
                
            
        }
    }

    public void insertend(int value)
    {
        Node newNode= new Node(value);
        if(tail==null){
            insertfront(value);
        }

        else{
            tail.next=newNode;
            tail=newNode;
        }
        size+=1;
    }

    public void display(){
        
        Node temp= head;

        while(temp!= null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("null");

        System.out.println(tail.value);
        System.out.println(head.value);
        System.out.println(size);
    }

    public static void main(String[] args) {
        
        singleLL obj=new singleLL();

        for(int i=5;i>=1;i--) obj.insertfront(i);

        for(int i=6;i<=10;i++) obj.insertend(i);

        obj.display();

        obj.insert(100, 3);
        obj.display();
    }
}