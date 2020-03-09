/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Neptrocity
 */
public class ProductContainerRecorder extends ProductContainer{
    
    private ContainerHistory hisotry;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.hisotry = new ContainerHistory();
        this.hisotry.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    
    public String history(){
        return this.hisotry.toString();
    }
    
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.hisotry.add(super.getVolume());

    }
    
    public double takeFromTheContainer(double amount){
        double taken = super.takeFromTheContainer(amount);
        this.hisotry.add(super.getVolume());
        return taken;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.hisotry.maxValue());
        System.out.println("Smallest product amount: " + this.hisotry.minValue());
        System.out.println("Average: " + this.hisotry.average());
        System.out.println("Greatest change: " + this.hisotry.greatestFluctuation());
        System.out.println("Variance: " + this.hisotry.variance());
    }
    
    

    
}
