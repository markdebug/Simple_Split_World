package com.split;

import java.util.ArrayList;
import java.util.List;

public class SimpleSplit {

    private String source;

    SimpleSplit(String socue) {
        this.source = socue;
    }

    public List<String> getResult() {
        List<String> result = new ArrayList<>();
        int sourceLeng;
        String word;
        int splieMax = 5;
        while ((sourceLeng = source.length()) > 0) {
            if (splieMax > sourceLeng)
                splieMax = sourceLeng;
            word = source.substring(sourceLeng - splieMax);
            int start = sourceLeng - splieMax;
            boolean find = false;
            while (word.length() > 1) {
                if (DicUtils.match(word)) {
                    result.add(word);
                    find = true;
                    break;
                }
                ++start;
                word = source.substring(start);
            }
            if (!find) {
                result.add(word);
            }
            source = source.substring(0, start);
        }
        return result;
    }

}
