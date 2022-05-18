package uml_netflix;

import java.util.ArrayList;

/**
 *
 * @author Elian Briones
 */
public class Serie {
    private String title;
    private ArrayList<Season> seasonsList = new ArrayList<>(); // 1st way
//    private ArrayList<Season> seasonsList2; 2n way
    
    public boolean addSeason(Season s) {
        return false;
    }

    public Serie(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public ArrayList<Season> getSeasonsList() {
        return seasonsList;
    }

    
    
    
    
    
}
