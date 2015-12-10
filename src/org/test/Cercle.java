package org.test;

/**
 * Created by Elyes on 10/12/2015.
 */
public class Cercle implements  IForm {

    public static final float pi = 3.14f ;
    public float rayon ;
    public float area ;

    public Cercle(float rayon){

        this.rayon = rayon ;
        this.area = area*area*pi ;
    }

    @Override
    public float getArea() {
        return area;
    }

    @Override
    public void setArea(float area) {

        this.area=area;
    }
}
