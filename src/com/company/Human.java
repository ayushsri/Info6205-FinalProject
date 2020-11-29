package com.company;

public class Human implements HumanInterface {

    Location l;
    boolean isCovidPositive;
    boolean needQuarantine;
    boolean showSymptoms;
    boolean ifWearMask;

    public void humanStatusUpdate() {

    if (showSymptoms) {
        if (Math.random() < 0.1) {
            isCovidPositive = true;
            needQuarantine = true;
        } else {
            needQuarantine = true;
        }
    }
        if (ifWearMask) {
            if (Math.random() < 0.01) {
                isCovidPositive = true;
                needQuarantine = true;
            } else {
                needQuarantine = true;
            }

        }

    }
    //It is according to K factor.
    @Override
    public double canSpread() {
       double a=Math.random();
        if(a<0.2)
            return a;
        else
            return 0;
    }

}
