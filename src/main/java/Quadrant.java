public class Quadrant {
    static void getQuadrant(double x, double y, double z)
    {
        if (x >= 0 && y <= 0 && z >= 0)
            System.out.println("lies in First Top quadrant");

        else if (x >= 0 && y >= 0 && z >= 0)
            System.out.println("lies in First Bottom quadrant");

        else if (x >= 0 && y <= 0 && z >= 0)
            System.out.println("lies in Second Top quadrant");

        else if (x >= 0 && y >= 0 && z >= 0)
            System.out.println("lies in Second Bottom quadrant");

        else if (x <= 0 && y <= 0 && z <= 0)
            System.out.println("lies in Third Top quadrant");

        else if (x <= 0 && y >= 0 && z <= 0)
            System.out.println("lies in Third Bottom quadrant");

        else if (x <= 0 && y <= 0 && z <= 0)
            System.out.println("lies in Fourth Top quadrant");

        else if (x <= 0 && y >= 0 && z <= 0)
            System.out.println("lies in Fourth Bottom quadrant");

        else
            System.out.println("lies at origin");
    }
}
