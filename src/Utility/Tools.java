package Utility;

import Projee.Elements;

public class Tools {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Login(){
        Elements e = new Elements();
    }
}
