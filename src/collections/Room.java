package collections;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Elian Briones
 */
public class Room implements Comparable<Room> {
    private String name;
    private int id;
    private int num;

    public Room() {}

    public Room(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public Room(int num, int id) {
        this.num = num;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", id=" + id + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Room o) {
//        return this.getName().compareTo(o.getName()); sort by lexicography
        return this.getId() - o.getId(); // sort by num
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
}
