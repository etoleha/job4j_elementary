package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart5AndFinish4Sum0() {
        int start = 5;
        int finish = 4;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart5AndFinish5Sum5() {
        int start = 5;
        int finish = 5;
        int expected = 5;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart0AndFinish10Sum55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus7AndFinish7Sum0() {
        int start = -7;
        int finish = 7;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1AndFinish100Sum5050() {
        int start = 1;
        int finish = 100;
        int expected = 5050;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}