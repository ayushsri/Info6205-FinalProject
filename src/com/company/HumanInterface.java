package com.company;

public interface HumanInterface {
    Location l = null;
     boolean isCovidPositive=false;
    boolean needQuarantine=false;
     boolean showSymptoms=false;
    boolean ifWearMask=false;

    void humanStatusUpdate()  ;
    double canSpread();






}
