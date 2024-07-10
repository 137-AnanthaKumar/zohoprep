package dsa;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    Node head;
    class Node{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
            
        }
    }

    
    LinkedList(){
        head=null;
    }
    
    public void insert(T data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
    }
    
    public void display() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
    }
    
    public void insertAtPos(int pos,T data) {
        Node newNode=new Node(data);
        
        
        if(pos==0) {
            insert(data);
            return;
        }
        Node oldNode=head;
       
        
        for(int i=1;i<pos;i++) {
            oldNode=oldNode.next;
            if(oldNode==null) {
                System.out.println("Invalid Pos");
                return;
            }
            
        }
        
        newNode.next=oldNode.next;
        oldNode.next=newNode;
               
        
    }
    
    public void deleteAtPos(int pos) {
        Node temp=head;
        Node prev=null;
        if(pos==0) {
            head=head.next;
            return;
        }
        
        for(int i=1;i<=pos;i++) {
            prev=temp;
            temp=temp.next;
            
        }
        prev.next=temp.next;
        
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new Iterator<T>() {
            Node temp=head;
            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return temp!=null;
            }

            @Override
            public T next() {
                // TODO Auto-generated method stub
               
                T val=temp.data;
                temp=temp.next;
                
                return val;
            }
            
            
        };
    }

    
    public void reverseLingedList() {
        
        Node prev=null;
        Node current=head;
        Node next=current.next;
        
        while(current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
           
            
        }
        head=prev;
        display();
        
    }
   
 
    
}
