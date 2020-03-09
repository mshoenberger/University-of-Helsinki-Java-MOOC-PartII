/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.Arrays;

/**
 *
 * @author Neptrocity
 */
public class AtLeastOne implements Criterion{
    
    private Criterion[] criteriaList;
    
    public AtLeastOne(Criterion... criteria){
        this.criteriaList = criteria;
    }
    
    @Override
    public boolean complies(String line){
                
        for(Criterion index: criteriaList){
            if(index.complies(line)){
                return true;
            }
        }
        
        return false;
    }
    
    
}
