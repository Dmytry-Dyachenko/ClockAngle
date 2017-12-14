package javaclasses.clockangle.impl;


import javaclasses.clockangle.ClockAngleCalculator;

public class ClockAngleCalculatorCalculatorImpl implements ClockAngleCalculator {

    @Override
    public double getAngleBetweenArrowsInTime(double hourArrowPosition, double minuteArrowPosition) {

        /*
         * Constant for calculating angles.
         */
        final int hourSectionCount = 5;
        final int degreesValueOfEveryMinute = 6;
        final int fullCircleDegrees = 360;
        final int fullMinutesCount = 60;

        /*
         * Validation of hour’s and minute’s positions.
         */
        validateHoursValue(hourArrowPosition);
        validateMinutesValue(minuteArrowPosition);

        /*
         * Calculating the real hour’s arrow position considering minute’s arrow position.
         */
        hourArrowPosition = hourArrowPosition + (minuteArrowPosition / fullMinutesCount);

        final double angle = Math.abs(((hourArrowPosition * hourSectionCount) - (minuteArrowPosition)) * degreesValueOfEveryMinute);

        return angle > fullCircleDegrees - angle ? fullCircleDegrees - angle : angle;
    }


    private void validateHoursValue(double hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hour’s count can’t be less then 1 o’clock");
        } else if (hours > 12) {
            throw new IllegalArgumentException("Hour’s count can’t be more then 12 o’clock");
        }
    }

    private void validateMinutesValue(double minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Hour’s count can’t be less then 1.");
        } else if (minutes > 60) {
            throw new IllegalArgumentException("Minutes’s count can’t be more then 60.");
        }
    }
}
