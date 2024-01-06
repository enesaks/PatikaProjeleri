package org.example;

import java.util.Comparator;

public class orderNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAd().compareTo(o2.getAd());
    }
}
