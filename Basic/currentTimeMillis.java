package basic;

import java.text.SimpleDateFormat;

public class currentTimeMillis {

    public static void main(String [] args) {
    	
        long now = System.currentTimeMillis();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(now));
        System.out.println("currentTimeMillis : " + now); 
        System.out.println("seconds : " + now / 1000); 
        System.out.println("minutes : " + now / 60000);
        System.out.println("hours : " + now / 3600000);
    }
}
