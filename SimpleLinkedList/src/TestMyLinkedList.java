public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TEST");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.add(4,9);
        myLinkedList.add(5,8);
        myLinkedList.printList();
    }
}
