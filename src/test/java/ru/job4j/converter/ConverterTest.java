package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert144RblThen2dot4Dollar() {
        float input = 144;
        float expected = 2.4f;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 180;
        float expected = 3;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert0RblThen0Dollar() {
        float input = 0;
        float expected = 0;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}