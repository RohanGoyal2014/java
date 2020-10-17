import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Time {
	public static void main(String...strings) {
		Instant instant = Instant.now();
		Timestamp timestamp = Timestamp.from(instant);
		OffsetDateTime odt = instant.atOffset(ZoneOffset.of("+06:00"));
		ZonedDateTime zdt = instant.atZone(ZoneId.of("US/Eastern"));
		System.out.println("UTC:" + instant);
		System.out.println("IST:" + timestamp);
		System.out.println("EDT:" + zdt);
		System.out.println("Dhaka:" + odt);
	}
}
