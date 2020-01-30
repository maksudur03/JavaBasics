package office;

import java.util.Comparator;

public class RatingComparison implements Comparator<Developer> {

    @Override
    public int compare(Developer d1, Developer d2) {
        if(d1.getRating()<d2.getRating()){
            return -1;
        }
        else if(d1.getRating()>d2.getRating()){
            return 1;
        }
        else
            return 0;

    }
}
