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
public class Both implements Criterion{
    
    private Criterion condition1;
    private Criterion condition2;
    
    public Both(Criterion criteria1, Criterion criteria2){
        this.condition1 = criteria1;
        this.condition2 = criteria2;
    }
    
    public boolean complies(String line){
        return condition1.complies(line) && condition2.complies(line);
    }
    
    
}
