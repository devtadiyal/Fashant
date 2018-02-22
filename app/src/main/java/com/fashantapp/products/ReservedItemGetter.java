package com.fashantapp.products;

/**
 * Created by saffron on 2/21/2018.
 */

public class ReservedItemGetter
{
    public int getImg() {
        return img;
    }

        public String getHeading() {
            return heading;
        }

        public String getBanner() {
            return banner;
        }

        public String getSize() {
            return size;
        }

    public String getColor() {
        return color;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getTag() {
        return tag;
    }


    private int img;
        private String heading;
        private String banner;
        private String size;
    private String color;
    private String quantity;
    private String tag;

        public ReservedItemGetter(int img,String heading, String banner, String size,String color, String quantity, String tag) {
                this.heading = heading;
                this.banner = banner;
            this.size = size;
            this.color = color;
            this.quantity = quantity;
            this.tag = tag;
            this.img = img;
        }

}
