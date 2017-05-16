package groovy.time

import org.junit.Test

import java.time.Duration
import java.time.Period

class TemporalAmountExtensionTests {

    @Test
    void testYears() {
        assert Period.ofYears(1) == 1.year
    }

    @Test
    void testMonths() {
        assert Period.ofMonths(1) == 1.month
    }

    @Test
    void testDays() {
        assert Period.ofDays(1) == 1.day
    }

    @Test
    void testHr() {
        assert Duration.ofHours(1) == 1.hr
    }

    @Test
    void testMin() {
        assert Duration.ofMinutes(1) == 1.min
    }

    @Test
    void testS() {
        assert Duration.ofSeconds(1) == 1.s
    }

    @Test
    void testNs() {
        assert Duration.ofNanos(1) == 1.ns
    }
}
