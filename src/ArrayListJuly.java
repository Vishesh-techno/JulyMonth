import java.util.ArrayList;

public class ArrayListJuly {
    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list);

        int elem = list.get(2);
        System.out.println(elem);

        list.set(3, 6);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        boolean cont = list.contains(5);
        System.out.println(cont);

        list.add(2, 3);
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(5);
        list1.add(9);
        list1.add(11);
        list1.add(6);
        list1.add(7);

        System.out.println(list1);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            if (max < list1.get(i)) {
                max = list1.get(i);
            }
        }
        System.out.println("max Element: " + max);

        System.out.println(list1);
        swap(list1, 2, 4);
        System.out.println(list1);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            l1.add(i);
            l2.add(i * 2);
            l3.add(i * 3);
        }

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        mainList.add(l1);
        mainList.add(l2);
        mainList.add(l3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
