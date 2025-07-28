import java.util.ArrayList;

public class ArrayListJuly2 {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int h = 0, w = 0;
        for(int i =0; i<height.size(); i++){
            for (int j = i+1; j <height.size(); j++) {
                h = Math.min(height.get(i), height.get(j));
                w = j-i;
                int currWater = h * w;
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }
    public static int storeWaterOptimal(ArrayList<Integer> height){
        int maxWater = 0;
        int h = 0, w = 0;
        int left = 0, right = height.size()-1;
        while(left<right){
                h = Math.min(height.get(left), height.get(right));
                w = right-left;
                int currWater = h * w;
                maxWater = Math.max(currWater, maxWater);
                if(height.get(left) < height.get(right)){
                    left++;
                }else{
                    right--;
                }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
        System.out.println(storeWaterOptimal(height));


    }
}
