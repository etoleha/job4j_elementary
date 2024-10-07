package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TemperatureFitTest {

    @Test
    void whenRoomTemperature24ThenFruits8() {
        int input = 24;
        double expected = 8.0;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenRoomTemperature24ThenMeat5() {
        int input = 24;
        double expected = 5.0;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
