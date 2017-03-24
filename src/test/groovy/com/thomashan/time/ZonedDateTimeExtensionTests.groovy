package com.thomashan.time

import org.junit.Test

import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class ZonedDateTimeExtensionTests {

    @Test
    void testGetRfc3339() {
        ZonedDateTime dateTimeAtUtc = ZonedDateTime.now(ZoneId.of("UTC"))
        String expected = dateTimeAtUtc.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.nnnnnnnnnX"))

        assert expected == dateTimeAtUtc.rfc3339
    }
}
