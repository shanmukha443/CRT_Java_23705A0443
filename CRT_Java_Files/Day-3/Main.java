public class Main {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.insertE(10);
        list.insertE(20);
        list.insertB(5);
        list.insertA(15, 2);
        
        System.out.println("Linked List after insertions:");
        list.printList();
        
        System.out.println("Length of the list: " + list.length());
        
        System.out.println("Deleted from beginning: " + list.delB());
        System.out.println("Deleted from end: " + list.delE());
        
        System.out.println("Linked List after deletions:");
        list.printList();
        
        int[] arr = {30, 40, 50};
        Linked_List newList = Linked_List.ArrayToList(arr);
        
        System.out.println("New Linked List from array:");
        newList.printList();
        
        int[] convertedArray = newList.ListToArray();
        System.out.println("Converted back to array: ");
        for (int num : convertedArray) {
            System.out.println(num + " ");
        }
    }
}


