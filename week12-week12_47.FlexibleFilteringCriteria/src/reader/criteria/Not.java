/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Neptrocity
 */
public class Not implements Criterion{
    
    private Criterion notMetCondition;
    
    public Not(Criterion comparison){
        this.notMetCondition = comparison;
    }
    
    public boolean complies(String line){
        return !notMetCondition.complies(line);
    }
    
    
}
