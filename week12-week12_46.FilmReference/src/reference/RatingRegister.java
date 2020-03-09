/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import reference.domain.Film;
import reference.domain.Rating;
import reference.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Neptrocity
 */
public class RatingRegister {
    
    private Map<Film, List<Rating>> ratingList;
    private Map<Person, Map<Film, Rating>> personalRating;
    
    public RatingRegister(){
        this.ratingList = new HashMap<Film, List<Rating>>();
        this.personalRating = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(!this.ratingList.containsKey(film)){
            this.ratingList.put(film, new ArrayList<Rating>());
        }
        
        this.ratingList.get(film).add(rating);
    }
    
    public List<Rating> getRatings(Film film){
        return this.ratingList.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return this.ratingList;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(!this.personalRating.containsKey(person)){
            this.personalRating.put(person, new HashMap<Film, Rating>());
            this.personalRating.get(person).put(film, rating);
            addRating(film, rating);
        }else if(!this.personalRating.get(person).containsKey(film)){
            this.personalRating.get(person).put(film, rating);
            addRating(film, rating);
        }
    }
    
    public Rating getRating(Person person, Film film){
        if(!this.personalRating.containsKey(person)){
            return Rating.NOT_WATCHED;
        }
        if(!this.personalRating.get(person).containsKey(film)){
            return Rating.NOT_WATCHED;
        }
        
        return this.personalRating.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!this.personalRating.containsKey(person)){
            return new HashMap();
        }
        
        return this.personalRating.get(person);
    }
    
    public List<Person> reviewers(){
        List<Person> reviewerList = new ArrayList<Person>();
        
        for(Person index: this.personalRating.keySet()){
            reviewerList.add(index);
        }
        return reviewerList;
    }
}
