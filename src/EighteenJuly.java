public class EighteenJuly {
   public static int strStr(String hayStack, String needle){
       if(hayStack.length() < needle.length()){
           return -1;
       }
       for(int i=0; i<hayStack.length(); i++){
           int j = 0;
           while(j<needle.length() && (i+j) < hayStack.length()){
               if(needle.charAt(j)!= hayStack.charAt(i+j)){
                   break;
               }

               j++;
           }
           if(j==needle.length()){
               return i;
           }
       }
       return -1;
   }
    public static int strStrOptimal(String hayStack, String needle){
       if(hayStack.contains(needle)){
           return hayStack.indexOf(needle);
       }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStrOptimal("sadbutsad", "sad"));
    }
}
