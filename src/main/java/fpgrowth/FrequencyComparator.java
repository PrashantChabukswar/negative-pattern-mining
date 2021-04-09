package fpgrowth;

import java.util.Collections;
import java.util.Comparator;

class FrequencyComparatorInHeaderTable implements Comparator<FPtree>{

    public FrequencyComparatorInHeaderTable() {
    }

    public int compare(FPtree o1, FPtree o2) {
        if(o1.count>o2.count){
            return 1;
        }
        else if(o1.count < o2.count)
            return -1;
        else
            return 0;
    }

}
