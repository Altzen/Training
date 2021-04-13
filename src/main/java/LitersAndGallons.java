public class LitersAndGallons {
    public double getLitersIntoGallons(double liter) {

        double gallon;
        gallon = 0.264 * liter;

        System.out.println(gallon);
        return gallon;
    }

    public double getGallonsIntoLiters(double gallon) {

        double liter;
        liter = gallon * 3.7854;

        System.out.println(liter);
        return liter;
    }
}
