package ejerciciosComplementarios;

import java.util.ArrayList;

public class Inventory {
  ArrayList<Videogame> listVideogame = new ArrayList<>();
  
  public boolean addVideogame(Videogame vg) {
    for (Videogame videogame : this.listVideogame) {
      if (videogame.getId() == vg.getId()) {
        System.out.println("Your videogame '" + videogame.getName() + "' already exists!");
        return false;
      } 
    } 
    this.listVideogame.add(vg);
    return true;
  }
  
  public void displayVideogames() {
    for (Videogame videogame : this.listVideogame)
      System.out.println(videogame); 
  }
}
