
import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        
        StringBuilder build = new StringBuilder();
        build.append("{ \n ");
        
        int lineValue =0;
        
        for(int i =0; i < t.length; i++){
            build.append(t[i]);
            if(i < t.length -1){
                build.append(", ");
            }
            
            if(lineValue == 3 && i != t.length -1){
                build.append("\n ");
                lineValue =0;
            }else{
                lineValue++;
            }
            
            if(i == t.length -1){
                build.append("\n");
            }
        
        }
           
        build.append("}");
               
        return build.toString();
    }
}
