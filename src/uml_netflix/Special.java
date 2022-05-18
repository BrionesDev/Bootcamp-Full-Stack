package uml_netflix;

/**
 *
 * @author Elian Briones
 */
public class Special extends Chapter {

    public static final int DURATION = 90;
    
    public Special(int num, Season sea) {
        super(num, sea);
    }
    
    
   
    
    @Override
    public int getDuration() {
        return 0;
    }
}
