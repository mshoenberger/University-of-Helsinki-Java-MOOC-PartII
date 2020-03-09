/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Comparator;

import reference.domain.Film;
import reference.domain.Rating;
/**
 *
 * @author Neptrocity
 */
public class FilmComparator implements Comparator<Film>{
    
    private Map<Film, List<Rating>> filmRatings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.filmRatings = ratings;
    }
    
    public double getAverage(Film film){
        double filmAverage =0;
        for(Rating rating: this.filmRatings.get(film)){
            filmAverage += rating.getValue();
        }

        return filmAverage / this.filmRatings.get(film).size();
    }
    
    
    public int compare(Film film1, Film film2){
        
        if(getAverage(film1) == getAverage(film2)){
            return 0;
        }else if(getAverage(film1) > getAverage(film2)){
            return -1;
        }else{
            return 1;
        }
        
    }
    
    
}
