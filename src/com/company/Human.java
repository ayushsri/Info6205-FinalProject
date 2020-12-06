package com.company;

public class Human implements HumanInterface {

    Location l;
    boolean isCovidPositive=false;
    boolean needQuarantine=false;
    boolean showSymptoms=false;
    boolean ifWearMask=false;
    Virus v1=new Virus(PopulatingConfig.virusName);
    boolean isVisitingPublicPlaces;
    String Country;

    public Human(boolean isVisitingPublicPlaces)
    {   if(isVisitingPublicPlaces)
    {

    }
        if(Math.random()<0.5)
        {
            this.Country="USA";
        }
        else
            this.Country="China";
    }

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
