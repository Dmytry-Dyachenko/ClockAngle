import javaclasses.clockangle.impl.ClockAngleCalculatorCalculatorImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockAngleCalculatorShould {
    final private ClockAngleCalculatorCalculatorImpl angle = new ClockAngleCalculatorCalculatorImpl();

    @Test
    public void
    calculate_angle_in_time_quoter_past_three_and_get_result_as_seven_dot_five_degrees() {
        final double result = angle.getAngleBetweenArrowsInTime(3, 15);
        assertEquals(7.5, result, 0.1);
    }

    @Test
    public void
    calculate_angle_in_time_six_oclock_and_get_result_as_ninety_degrees() {
        final double result = angle.getAngleBetweenArrowsInTime(3, 0);
        assertEquals(90, result, 0.1);
    }

    @Test
    public void
    calculate_angle_in_time_quoter_past_twelve_and_get_result_as_eighty_dot_five_degrees() {
        final double result = angle.getAngleBetweenArrowsInTime(12, 15);
        assertEquals(82.5, result, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void
    throw_exception_cause_of_incorrect_hour_format() {
        angle.getAngleBetweenArrowsInTime(13, 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void
    throw_exception_cause_of_incorrect_minute_format() {
        angle.getAngleBetweenArrowsInTime(10, 70);
    }

    @Test(expected = IllegalArgumentException.class)
    public void
    throw_exception_cause_of_incorrect_hour_format_second_test() {
        angle.getAngleBetweenArrowsInTime(-2, 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void
    throw_exception_cause_of_incorrect_minute_format_second_test() {
        angle.getAngleBetweenArrowsInTime(10, -70);
    }
}
