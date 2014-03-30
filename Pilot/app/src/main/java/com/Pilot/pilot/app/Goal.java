package com.Pilot.pilot.app;


public class Goal {
    private long id;
    private String category;
    private String title;
    private int year;
    private int month;
    private int day;
    private String description;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String goal) {
        this.title = goal;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return title;
    }
}
