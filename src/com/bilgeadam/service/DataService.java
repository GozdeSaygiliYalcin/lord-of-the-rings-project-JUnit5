package com.bilgeadam.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bilgeadam.model.Movie;
import com.bilgeadam.model.Race;
import com.bilgeadam.model.Ring;
import com.bilgeadam.model.TolkienCharacter;

public class DataService {
	
	final TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, Race.HOBBIT);
	final TolkienCharacter sam = new TolkienCharacter("Sam", 38, Race.HOBBIT);
	final TolkienCharacter mery = new TolkienCharacter("Mery", 36, Race.HOBBIT);
	final TolkienCharacter pippin = new TolkienCharacter("Pippin", 28, Race.HOBBIT);
	final TolkienCharacter gandalf = new TolkienCharacter("Gandalf", 2020, Race.MAIA);
	final TolkienCharacter gimli = new TolkienCharacter("Gimli", 139, Race.DWARF);
	final TolkienCharacter legolas = new TolkienCharacter("Legolas", 1000, Race.ELF);
    final TolkienCharacter aragorn = new TolkienCharacter("Aragorn", 87, Race.MAN);
    final TolkienCharacter boromir = new TolkienCharacter("Boromir", 37, Race.MAN);
    final TolkienCharacter sauron = new TolkienCharacter("Sauron", 50000, Race.MAIA);
    final TolkienCharacter galadriel = new TolkienCharacter("Galadriel", 3000, Race.ELF);
    final TolkienCharacter elrond = new TolkienCharacter("Elrond", 3000, Race.ELF);
    final TolkienCharacter guruk = new TolkienCharacter("Guruk", 20, Race.ORC);
    
    final Movie theFellowshipOfTheRing = new Movie("the fellowship of the Ring", new Date(), "178 min");
    final Movie theTwoTowers = new Movie("the two Towers", new Date(), "179 min");
    final Movie theReturnOfTheKing = new Movie("the Return of the King", new Date(), "201 min");
    
    public List<TolkienCharacter> getFellowship() {
    	
    	final List<TolkienCharacter> fellowShipOfTheRing = new ArrayList<>();
    	
    	fellowShipOfTheRing.add(frodo);
    	fellowShipOfTheRing.add(sam);
    	fellowShipOfTheRing.add(mery);
    	fellowShipOfTheRing.add(pippin);
    	fellowShipOfTheRing.add(gandalf);
    	fellowShipOfTheRing.add(legolas);
    	fellowShipOfTheRing.add(gimli);
    	fellowShipOfTheRing.add(aragorn);
    	fellowShipOfTheRing.add(boromir);
    	
    	return fellowShipOfTheRing;
    }
    
    public List <TolkienCharacter> getOrcsWithHobbitPrisoners() {
    	
    	final List<TolkienCharacter> orcsWithHobbitPrisoners = new ArrayList<TolkienCharacter> ();
    	orcsWithHobbitPrisoners.add(guruk);
    	orcsWithHobbitPrisoners.add(mery);
    	orcsWithHobbitPrisoners.add(pippin);
    	
    	return orcsWithHobbitPrisoners;
    }
    
    public TolkienCharacter getFellowshipCharacter(String name) {
    	
    	List<TolkienCharacter> list = getFellowship();
    	
    	return list.stream().filter(s -> s.getName().equals(name)).findFirst().orElseGet(() -> null);  
    }
    
    public Map<Ring, TolkienCharacter> getRingBearers() {
    	
    	 Map<Ring, TolkienCharacter> ringBearers = new HashMap<>();
    	 
    	 ringBearers.put(Ring.nenya, galadriel);
    	 ringBearers.put(Ring.narya, gandalf);
    	 ringBearers.put(Ring.vilya, elrond);
    	 ringBearers.put(Ring.oneRing, frodo);
    	 
    	 return ringBearers;
    }
 	
}
