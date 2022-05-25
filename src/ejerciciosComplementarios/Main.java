package ejerciciosComplementarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

public class Main {
  static Inventory inv = new Inventory();
  
  static ArrayList<Videogame> listVideogames = new ArrayList<>();
  
  public static void main(String[] args) {
    Videogame v1 = new Videogame(50, "GTA V", new Date());
    Videogame v2 = new Videogame(0, "Valorant", new Date());
    Videogame v3 = new Videogame(30, "Red Dead Redemption 2", new Date());
    isAvailable(v1);
    isAvailable(v2);
    isAvailable(v3);
    try {
      Videogame v4 = new Videogame(-100, "League of Legends", new Date());
      if (v4.getValue() <= 0)
        throw new IllegalArgumentException("Value must be greater than 0"); 
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    } 
    Videogame v3_2 = v3;
    v3.equals(v3_2);
    System.out.println(v3.equals(v3_2));
    Collections.sort(inv.listVideogame, (vg1, vg2) -> vg1.getName().compareTo(vg2.getName()));
    inv.displayVideogames();
    Iterator<Videogame> it = inv.listVideogame.iterator();
    while (it.hasNext())
      System.out.println("* * * " + it.next() + " * * *"); 
  }
  
  public static void isAvailable(Videogame v) {
    if (inv.addVideogame(v))
      System.out.println("Game '" + v.getName() + "' successfully ADDED"); 
  }
}
