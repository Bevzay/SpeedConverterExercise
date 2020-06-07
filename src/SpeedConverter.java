public class SpeedConverter {

    /*
    * Part 1
    *
    * Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
    * This method needs to return the rounded value of the calculation of type long.
    *
    * If the parameter kilometersPerHour is less than 0,
    * the method toMilesPerHour needs to return -1 to indicate invalid value
    *
    * If it is positive, calculate the value of miles per hour, round it and return it.
     */

    public static long toMilesPerHour(double kilometresPerHour) {
        double miles = kilometresPerHour*1.6093;

        if (kilometresPerHour < 0) {
            return -1;
        } else {
            return (long) miles;
        }
    }

}
