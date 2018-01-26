package oop_lab7;
//1.car brand ยี่ห้อ
//2.car color สี
//3.car engine size ขนาดของเครื่องยนต์
//4.max speed ความเร็วสูงสุดของเครื่อง
//5.country of origin
public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carsize;
    private String maxspeed;
    private String countryoforigin;

    public SuperCar(){}
    public SuperCar(String carbrand,String carcolor,String carsize,String a){
        this.carbrand = carbrand;
        this.carcolor = carcolor;
        this.carsize = carsize;
        this.maxspeed = maxspeed;
        this.countryoforigin = countryoforigin;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "carbrand='" + carbrand + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", carsize='" + carsize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countryoforigin='" + countryoforigin + '\'' +
                '}';
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarsize() {
        return carsize;
    }

    public void setCarsize(String carsize) {
        this.carsize = carsize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }
}//class
