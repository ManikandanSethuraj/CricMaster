package com.manikandansethuraj.cricmaster;

/**
 * Created by ManikandanSethuraj on 2015-11-27.
 */
public class Application {
    private  String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }





    @Override
    public String toString() {
        return "" + getTitle() + "\n";
    }
}
