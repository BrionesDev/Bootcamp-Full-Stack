package uml_netflix;

import java.util.Objects;

/**
 *
 * @author Elian Briones
 */
public class Character {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        final Character other = (Character) obj;
        return Objects.equals(this.name, other.name);
    }
    
    
    
    
}
