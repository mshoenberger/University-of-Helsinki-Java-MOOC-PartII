
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        
        HashMap<String, String> nickName = new HashMap<String, String>();
        
        nickName.put("matti", "mage");
        nickName.put("mikael", "mixu");
        nickName.put("arto", "arppa");
        
        System.out.println(nickName.get("mikael"));
        
        
    }

}
