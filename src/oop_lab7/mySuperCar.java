package oop_lab7;

public class mySuperCar {
    public static void main(String[] args) {

        SuperCar s1 = new SuperCar();
        s1.setCarbrand("Jazz");
        s1.setCarcolor("Black");
        s1.setCarsize("i-VTEC 1.5 ลิตร 117 แรงม้า");
        s1.setMaxspeed("7-speed");

        System.out.println(s1.toString());
        SuperCar s2 = new SuperCar("Accord",
                "green",
                "150 แรงม้า","7-speed")



    }//main
}//class
