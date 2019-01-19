package _8_funkcje;



public class _8_7_KonwertowanieJednostek {

    final static double mila = 1.60934;

    public static double mileNaKm(double a) {
        return a * mila;
    }



    public static double kmNaMile(double a){
        return a / mila;
    }


    public static double c2f (double cel){
        return 32.0 + (9.0/5.0) * cel;
    }

    public static double f2c (double far) {
        return (5.0/9.0) * (far - 32);

    }


}



    /*
    public static double fahrNaCel(double a){
        return a *
    }


}

/*
mile na km
km na mile
farenheity na cel
cel na far
1mila = 1.60934km



 */