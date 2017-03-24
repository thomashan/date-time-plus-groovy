# date-time-plus-groovy
Simplify java date time in groovy!

Suggestions and feedback is very much appreciated.


# Design objectives
* simplify java date time API and make developers' lives happier!
* minimal dependencies
* make it work with multiple versions of java, groovy and always aim to be backwards compatible

## Prerequisites
* JDK 1.8+
* Groovy 2.4.10

There will be multiple branches for groovy if there's compatibility issues.

## Install
I can't publish to public maven repos so the best way to install it at the moment is to checkout the code and build it yourself.
```
> ./gradlew clean install
```


## Usage and examples
```groovy
java.time.LocalDate oneMonthFromToday = java.time.LocalDate.now() + 1.month
java.time.LocalDateTime oneMonthFromNow = java.time.LocalDateTime.now() + 1.month
java.time.ZonedDateTime oneMonthFromNowAtUtcTimeZone = ZonedDateTime.now(ZoneId.of("UTC")) + 1.month
```

## Testing
Sorry, I didn't use spock. I wanted to keep the dependencies minial.
