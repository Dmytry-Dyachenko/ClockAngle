package javaclasses.clockangle;

/**
 * Gets the angle between hour’s and minute’s arrows positions.
 */
public interface ClockAngleCalculator {
    /**
     * Method takes the hour’s and minute’s positions and return degrees angle between them.
     * Example hourArrowPosition = 3, minuteArrowPosition = 15, then result will be 7.5 degrees.
     *
     * @param hours   The watch hour’s arrow position at clock face.
     * @param minutes The watch minute’s arrow position at clock face.
     * @return the angle between them in degrees.
     */
    double getAngleBetweenArrowsInTime(double hours, double minutes);
}
