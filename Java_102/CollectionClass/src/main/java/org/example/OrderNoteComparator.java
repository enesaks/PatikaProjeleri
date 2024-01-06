package org.example;

import java.util.Comparator;

public class OrderNoteComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getNot() - o1.getNot();
    }
}
