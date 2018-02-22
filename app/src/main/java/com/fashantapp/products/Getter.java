package com.fashantapp.products;

public class Getter {

    public String getHeading() {
        return heading;
    }

    public String getBanner() {
        return banner;
    }

    public String getTime() {
        return time;
    }



    private String heading;
    private String banner;
    private String time;

    public Getter(String heading, String banner, String time) {
        this.heading = heading;
        this.banner = banner;
        this.time = time;
    }
}
