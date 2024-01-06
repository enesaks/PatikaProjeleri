package org.example;

public class Student {
    private String ad;
    private int not;

    public Student(String ad, int not){
        this.ad = ad;
        this.not = not;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }
}
