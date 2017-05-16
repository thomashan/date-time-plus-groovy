package groovy.time

import java.time.Duration
import java.time.Period
import java.time.temporal.TemporalAmount

class TemporalAmountExtension {
    static TemporalAmount getYear(Number self) {
        return Period.ofYears(self)
    }

    static TemporalAmount getMonth(Number self) {
        return Period.ofMonths(self)
    }

    static TemporalAmount getDay(Number self) {
        return Period.ofDays(self)
    }

    static TemporalAmount getHr(Number self) {
        return Duration.ofHours(self)
    }

    static TemporalAmount getMin(Number self) {
        return Duration.ofMinutes(self)
    }

    static TemporalAmount getS(Number self) {
        return Duration.ofSeconds(self)
    }

    static TemporalAmount getNs(Number self) {
        return Duration.ofNanos(self)
    }
}
