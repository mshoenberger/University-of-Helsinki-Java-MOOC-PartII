package dictionary;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
        try{
            MindfulDictionary s =  new MindfulDictionary("test/words.txt");
                    s.load();
        s.remove("below");
        s.add("tiekone", "computer");
        s.save();
        
        }catch(Exception e){
            System.out.println("no");
        }
        

    }

}
