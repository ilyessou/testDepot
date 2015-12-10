package org.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elyes on 10/12/2015.
 */
public class Entreprise {

    public String entrepriseName ;
    public List<IEmploye> listEmplye = new ArrayList<IEmploye>();

    public Entreprise (String name)
    {
        this.entrepriseName = name ;
    }

    public void addEmploye (IEmploye emp){

        this.listEmplye.add(emp);
    }
}
