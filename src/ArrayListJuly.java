import java.util.ArrayList;

public class ArrayListJuly {
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

        list.add(2,3);
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
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
        for(int i=0; i<list1.size(); i++){
            if(max < list1.get(i)){
                max = list1.get(i);
            }
        }
        System.out.println("max Element: " + max);

    }
}
