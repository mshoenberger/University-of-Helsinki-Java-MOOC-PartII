/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.domain.Film;
import reference.domain.Person;

import reference.comparator.FilmComparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author Neptrocity
 */
public class Reference {
    
    private RatingRegister registerRatings;
    private FilmComparator compareFilms;
    
    public Reference(RatingRegister register){
        this.registerRatings = register;
        this.compareFilms = new FilmComparator(register.filmRatings());
    }
    
    public Film recommendFilm(Person person){
       // if(registerRatings.getPersonalRatings(person).isEmpty()){
            List<Film> filmsToCompare = new ArrayList<Film>(registerRatings.filmRatings().keySet());
            Collections.sort(filmsToCompare, new FilmComparator(registerRatings.filmRatings()));
            return filmsToCompare.get(0);            
       // }
        
        
        
        
    }
    

    
}
