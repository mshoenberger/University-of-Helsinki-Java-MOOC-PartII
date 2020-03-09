/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Neptrocity
 */
public class AllLines implements Criterion{
    
    private List<String> linesFound;
    
    public AllLines(){
        this.linesFound = new ArrayList<String>();
    }
    
    @Override
    public boolean complies(String line){
        return true;
    }
    
}
