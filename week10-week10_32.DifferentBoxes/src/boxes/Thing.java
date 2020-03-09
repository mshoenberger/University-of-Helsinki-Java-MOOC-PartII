package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight >=0){
            this.weight = weight;
        }else{
            throw new IllegalArgumentException("Weight must be 0 or positive.");
        }
        this.name = name;
 
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean equals(Object obj){
        Thing compareThing = (Thing) obj;
        if(this.name.equals(compareThing.name)){
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    

}
