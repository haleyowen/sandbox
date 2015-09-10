import java.util.ArrayList;
import java.util.TreeMap;

public class TrainSimulation {
  public static void main(String[]args) {
    Train t =  new Train();
    t.pickup(1, 3);
    t.pickup(1, 4);
    t.pickup(3, 2);

    // This could also be in some sort of while loop
    // to keep the train going and then random pick ups could
    // come in as well
    t.advance();
    t.advance();
    t.advance();
    t.advance();
    t.advance();
  }
}
class Train {

  // a boolean array to tell the train which station it needs to stop at.
  private boolean[] stops;
  // these are the people waiting to be picked up
  private TreeMap<Integer, ArrayList<Person>> waiting;
  // these are the people who are on the train, waiting to be dropped off
  // this didn't really need to have the list of people, because we don't 
  // need to know anything about them anymore once they're on besides their 
  // dropoff location. But I left it as a map so I could simulate the people
  // getting off the train. This could be changed to a set though and less 
  // work and memory would be used.
  private TreeMap<Integer, ArrayList<Person>> transporting;
  private int currentStation;

  public Train() {
    // I have this hard coded because we know the number of stops
    // but realistically I could change the Train constructor to 
    // take in the number of stops
    stops = new boolean[5];
    waiting = new TreeMap<>();
    transporting = new TreeMap<>();
    currentStation = 0;
  }

  public void pickup(int pickup, int dropoff) {
    System.out.println("pickup " + pickup + ", " + dropoff);

    Person p = new Person(pickup, dropoff);

    if (waiting.get(p.getPickup()) == null) {
      waiting.put(p.getPickup(), new ArrayList<Person>());
    }

    // adding the new person to the waiting list to be picked up
    // when the train comes around to their stop
    waiting.get(p.getPickup()).add(p);
    stops[pickup] = true;

  }

  public void advance() {
    // this is finding the next station to stop at in a round robin fashion
    int round = 0;
    for(int i = currentStation; i < stops.length || round < stops.length; i++) {
      if(i >= stops.length)
        i = 0;
      if(stops[i]) {
        currentStation = i;
        break;
      }
      else
        round++;
    }

    // this is simulation the poeple getting off at their dropoff station
    if(transporting.get(currentStation) != null) {
      transporting.get(currentStation).clear();
    }

    // setting this station to false because everyone who needed to get 
    // on and off the train were able to do so
    stops[currentStation] = false;
    
    System.out.println("advance");
    System.out.println("assertStation " + currentStation);

    ArrayList<Person> newPassengers = waiting.get(currentStation);
    if(newPassengers != null) {
      // this loop is iterating through the passengers that were
      // waiting for the train and adding their dropoff stations
      // to the transporting list
      for(Person p : newPassengers) {

        if(transporting.get(p.getDropoff()) == null)
          transporting.put(p.getDropoff(), new ArrayList<Person>());

        transporting.get(p.getDropoff()).add(p);
        stops[p.getDropoff()] = true;
      }
    }
  }
}

// a Person class to hold the information for when someone
// is getting on and off of the train
// This could also be used to store more information if
// the problem were different, maybe for bus fairs/cards
// or something in that nature.
class Person {
  private int pickup;
  private int dropoff;

  public Person(int pickup, int dropoff) {
    this.pickup = pickup;
    this.dropoff = dropoff;
  }

  public int getPickup() {
    return pickup;
  }
  public int getDropoff() {
    return dropoff;
  }
}
