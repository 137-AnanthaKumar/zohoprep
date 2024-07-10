package dsa;

public class DyMain {

    public static void main(String[] args) {
//        DynaminArray<Integer> dy=new DynaminArray<Integer>();
//        dy.add(0);
//        dy.add(1);
//        dy.add(3);
//        dy.add(5);
//        dy.add(6);
//        dy.add(8);
//        dy.add(3);
//        dy.add(6);
//        dy.add(04);
//        dy.add(4);
//        dy.add(2);
//        dy.add(34);
//        dy.display();
//        dy.deleteAtPos(0);
//        System.out.println();
//        dy.display();
//        for(int i:dy) {
//            System.out.println(i);
//        }
        
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insertAtPos(1, 4);
        linkedList.display();
       // linkedList.deleteAtPos(0);
        System.out.println();
        linkedList.display();
        for(int a:linkedList) {
            System.out.println(" FO "+a);
        }
        System.out.println(" Reveres---------------- ");
        linkedList.reverseLingedList();

        

    }

}
