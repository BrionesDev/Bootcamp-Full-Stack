package ejerciciosComplementarios;

import java.util.Date;
import java.util.Objects;

public class Videogame {
  public int id;
  
  public int value;
  
  public String name;
  
  public Date localDate;
  
  public static int counter = 1;
  
  public Videogame(int value, String name, Date localDate) {
    this.id = counter++;
    this.value = value;
    this.name = name;
    this.localDate = localDate;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public int getValue() {
    return this.value;
  }
  
  public void setValue(int value) {
    this.value = value;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Date getLocalDate() {
    return this.localDate;
  }
  
  public void setLocalDate(Date localDate) {
    this.localDate = localDate;
  }
  
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + this.id;
    hash = 89 * hash + this.value;
    hash = 89 * hash + Objects.hashCode(this.name);
    hash = 89 * hash + Objects.hashCode(this.localDate);
    return hash;
  }
  
  public boolean equals(Object obj) {
    if (this == obj)
      return true; 
    if (obj == null)
      return false; 
    if (getClass() != obj.getClass())
      return false; 
    Videogame other = (Videogame)obj;
    if (this.id != other.id)
      return false; 
    if (this.value != other.value)
      return false; 
    if (!Objects.equals(this.name, other.name))
      return false; 
    return Objects.equals(this.localDate, other.localDate);
  }
  
  public String toString() {
    return "Videogame{id=" + this.id + ", value=" + this.value + ", name=" + this.name + ", localDate=" + this.localDate + '}';
  }
}
