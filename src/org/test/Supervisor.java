package org.test;

/**
 * Created by Elyes on 10/12/2015.
 */
public class Supervisor implements IEmploye {

    public String name ;
    public String post ;

    public Supervisor(String name, String post){

        this.name = name;
        this.post = post;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPost(String post) {
        this.post = post ;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPost() {
        return this.post;
    }
}
