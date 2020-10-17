package _13_time;

public class _01_NewStyle {
	public static void main(String[] args) {
		/*
		 * <Class>
		 * (☆All class is immutable and thread-safe)
		 * [java.time]
		 * 
		 * Instant : Epoch(UTC) 사용 - 초, 나노초(10억분 1초), 밀리초(1000분의 1초)
		 * 
		 * LocalDate = 년 월 일
		 * LocalTime = 시 분 초
		 * LocalDate + LocalTime = LocalDateTime : 년 월 일 시 분 초
		 * LocalDateTime + ZoneOffset = OffsetDateTime : 년 월 시 분 초 (시차 +09:00) 
		 * LocalDateTime + ZoneId = ZonedDateTime : 년 월 일 시 분 초 (시차 +9:00)(타임존 Asia/Seoul)
		 * 
		 * ==================================
		 * 시간 생성 : now(), of(), from
		 * 시간 변경 : with(), plus(), minus()
		 * 시간 비교 : isAfter(), isBefore(), isEqual()
		 * ==================================
		 * 날짜 - 날짜 = Period
		 * 시간 - 시간 = Duration
		 * between() - static method
		 * until() - instance method
		 * 
		 * 시간 수정 - of(), with()
		 * plus(), minus()
		 * get(), to()
		 * ==================================
		 * 
		 * [java.time.chrono] - 다양한 연대 지원
		 * 표준이 아닌 달력 시스템 제공
		 * ex)전세계적으로 Gregorian력을 사용하지만 태국은 Buddish란 연대가 있음
		 * ex)이슬람 국가들 자체 연대도 있다고 들었음
		 * 
		 * [java.time.format] - 시간형식 관련 기능 지원
		 * DateTimeFormatter
		 * .format(날짜시간) return String
		 * .ofPattern("날짜 형식 커스텀하기")
		 * 
		 * [java.time.temporal] - java.time을 위한 인터페이스
		 * java.time의 날짜와 시간을 표현하기 위한 클래스들이 모여있음
		 * ==================================================================
		 * Temporal : read - write access to a temporal object
		 * TemporalAccessor : read - only access to a temporal object
		 * TemporalAdjuster : Adjusters are a key tool for modifying temporal
		 * 
		 * {Temporal extends TemporalAccessor
		 * TemporalAdjuster} ==> LocalDateTime의 인터페이스
		 * ==================================================================
		 * TemporalField -- impl --> ChronoField : 년 월 일 시 분 초 요일 ... 시간 파트를 나타냄
		 * 															ex)12:34:56 --> 12=Hour, 34=Minute, 56=Second
		 * TemporalUnit -- impl ==> ChronoUnit : 초단위, 분단위, 시단위, 월단위 ... 시간의 단위를 나타냄
		 * 															ex)12시 34분 56초를 시단위로 truncated => 12시 00분 00초
		 * ==================================================================
		 * 
		 * [java.time.zone] - 시간대 관련 기능 지원
		 */
	}
}
