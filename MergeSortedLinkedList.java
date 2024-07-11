import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MergeSortedLinkedList {

    public static List<Integer> mergeTwoLists(List<Integer> l1, List<Integer> l2) {
        List<Integer> mergedList = new LinkedList<>();
        ListIterator<Integer> it1 = l1.listIterator();
        ListIterator<Integer> it2 = l2.listIterator();

        Integer v1 = it1.hasNext() ? it1.next() : null;
        Integer v2 = it2.hasNext() ? it2.next() : null;

        while (v1 != null || v2 != null) {
            if (v1 != null && v2 != null) {
                if (v1 <= v2) {
                    mergedList.add(v1);
                    v1 = it1.hasNext() ? it1.next() : null;
                } else {
                    mergedList.add(v2);
                    v2 = it2.hasNext() ? it2.next() : null;
                }
            } else if (v1 != null) {
                mergedList.add(v1);
                v1 = it1.hasNext() ? it1.next() : null;
            } else {
                mergedList.add(v2);
                v2 = it2.hasNext() ? it2.next() : null;
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> l1 = new LinkedList<>();
        System.out.println("Enter size of linked List 1");
        int n = sc.nextInt();

        System.out.println("Enter the elements of linkedlist 1");
        for (int i = 0; i < n; i++)
            l1.add(sc.nextInt());
        List<Integer> l2 = new LinkedList<>();
        System.out.println("Enter size of linked List 2");
        int m = sc.nextInt();

        System.out.println("Enter the elements of linkedlist 2");
        for (int i = 0; i < m; i++)
            l2.add(sc.nextInt());

        List<Integer> mergedList = mergeTwoLists(l1, l2);
        for (Integer val : mergedList) {
            System.out.print(val + " ");
        }
    }
}
