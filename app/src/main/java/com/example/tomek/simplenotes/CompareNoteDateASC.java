package com.example.tomek.simplenotes;

import java.util.Comparator;

/**
 * Created by Tomek on 08.03.2018.
 */

public class CompareNoteDateASC implements Comparator<Note> {
    @Override
    public int compare(Note n1, Note n2) {
        if (n1.getSaveDate().before(n2.getSaveDate())) {
            return 1;
        } else return -1;
    }


}

