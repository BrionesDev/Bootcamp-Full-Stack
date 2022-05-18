package uml_netflix;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Elian Briones
 */
public class Chapter {
    public static final int DURATION = 45;
    private int duration;
    private Season sea;
    int num;
    ArrayList<Character> charsList = new ArrayList<>();
    
    public Chapter (int num, Season sea) {
        this.num = num;
        this.sea = sea;
        this.duration = DURATION;
    }
    
    public String listCharacters() {
        String nameCharacters = "";
        
        for (Character character : charsList) {
            nameCharacters += character.getName() + "\n";
        }
        return nameCharacters;
    }
    
    public boolean addCharacters() {
        return false;
    }
    
    public int getDuration() {
        return DURATION;
    }

    public static int getDURATION() {
        return DURATION;
    }

    public Season getSea() {
        return sea;
    }

    public int getNum() {
        return num;
    }

    public ArrayList<Character> getCharsList() {
        return charsList;
    }

    @Override
    public String toString() {
        return sea.getSerie().getTitle() + "T" + sea.getSeasonNum() + "C" + this.num + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.duration;
        hash = 79 * hash + Objects.hashCode(this.sea);
        hash = 79 * hash + this.num;
        hash = 79 * hash + Objects.hashCode(this.charsList);
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
        final Chapter other = (Chapter) obj;
        if (this.duration != other.duration) {
            return false;
        }
        if (this.num != other.num) {
            return false;
        }
        if (!Objects.equals(this.sea, other.sea)) {
            return false;
        }
        return Objects.equals(this.charsList, other.charsList);
    }
    
    
    
}
