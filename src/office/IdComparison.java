package office;

import java.util.Comparator;

public class IdComparison implements Comparator<Developer> {
    public int compare(Developer d1, Developer d2){
        if(d1.getId()<d2.getId()){
            return -1;
        }
        else if(d1.getId()>d2.getId()){
            return 1;
        }
        else
            return 0;
    }
}
