 public class AddLinkedList{
    int val;
    AddLinkedList next;
    public AddLinkedList(int val){
        this.val=val;
    }

     public static void main(String[] args) {
         AddLinkedList l1 = new AddLinkedList(7);
         l1.next = new AddLinkedList(8);
         l1.next.next = new AddLinkedList(9);

         AddLinkedList l2 = new AddLinkedList(7);
         l2.next = new AddLinkedList(8);
         l2.next.next = new AddLinkedList(9);

         toPrintNode(l1);
         System.out.println("-------------");
         toPrintNode(l2);
         System.out.println("----------------");
       AddLinkedList finalSum=   sumTwoNodes(l1,l2);
         System.out.println("=-----------------");
         toPrintNode(finalSum);


     }

     private static AddLinkedList sumTwoNodes(AddLinkedList l1, AddLinkedList l2) {
        AddLinkedList dummy = new AddLinkedList(0);

        AddLinkedList current = dummy;
        int carry = 0;

        while(l1!= null || l2!= null || carry!=0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1= l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2= l2.next;
            }

            carry = sum / 10 ;
            int digit = sum %10 ;

            current.next = new AddLinkedList(digit);
            current = current.next;
        }
        return dummy.next;
     }

     private static void toPrintNode(AddLinkedList l1) {
        while(l1 != null){
            System.out.print(l1.val);

            if(l1.next != null){
                System.out.print(" -> ");
            }

            l1 = l1.next;
        }
         System.out.println();
     }
 }