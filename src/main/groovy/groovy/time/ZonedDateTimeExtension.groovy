package groovy.time

import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class ZonedDateTimeExtension {
    static String getRfc3339(ZonedDateTime self) {
        return self.withZoneSameInstant(ZoneId.of("Z")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.nnnnnnnnnX"))
    }
}
