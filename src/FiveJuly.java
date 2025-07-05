public class FiveJuly {
//    Goal Parser Interpretation
    public static String goalInterpretation(String s){
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<=s.length()){
            if(s.charAt(i) == 'G'){
                str.append('G');
                i++;
            }else{
                if (s.charAt(i+1) == ')' ){
                    str.append('o');
                    i+=2;
                }else{
                    str.append("al");
                    i+=4;
                }
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "G()()al";
        System.out.println(goalInterpretation(s));
    }
}
