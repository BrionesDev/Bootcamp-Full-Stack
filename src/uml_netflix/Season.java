package uml_netflix;

import java.util.ArrayList;

/**
 *
 * @author Elian Briones
 */
public class Season {
    private int seasonNum;
    private Serie serie;
    ArrayList<Chapter> chapterList = new ArrayList<>();

    public Season(int seasonNum, Serie serie) {
        this.seasonNum = seasonNum;
        this.serie = serie;
    }
    
    public boolean addChapter(Chapter c) {
        for (Chapter chapter : chapterList) {
            if (chapter.getNum() == c.getNum()) { // SE HARÍA CON NOMBRE - String
                return false;
            }
        }
        return chapterList.add(c);
    }
    
    public String listChapters() {
        String nameChapters = "";
        
        for (Chapter chapter : chapterList) {
            nameChapters += serie.getTitle() + "T" + seasonNum + "C" + chapter.num + "\n";
        }
        return nameChapters;
    }

    public int getSeasonNum() {
        return seasonNum;
    }

    public Serie getSerie() {
        return serie;
    }

    public ArrayList<Chapter> getChapterList() {
        return chapterList;
    }
    
    
}
