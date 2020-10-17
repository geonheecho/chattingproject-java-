package _13_time;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _02_Example {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime : " + localTime);
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate : " + localDate);

		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println("LocalDateTime : "+ localDateTime);

		LocalDateTime dateTime = LocalDateTime.of(2020, 2, 2, 12, 22, 22);
		System.out.println("LocalDateTime : "+ dateTime);

		LocalDateTime copyDateTime = LocalDateTime.from(dateTime);
		System.out.println("Copy LocalDateTime : "+copyDateTime);

		//DB로 시간을 보냄(ZonedDateTime - 자바의 시간 >>> timestamp >>> DBMS의 Date 타입)
		ZonedDateTime zdt = ZonedDateTime.now();
		Instant inst = zdt.toInstant();
		Long epoch = inst.toEpochMilli();
		System.out.println("DB로부터 얻기 전 :::"+ zdt);
		//System.out.println(ZonedDateTime.now().toInstant().toEpochMilli());

		//DB로부터 시간을 얻어옴(DBMS의 Date 타입 >>> timestamp >>> ZonedDateTime - 자바의 시간)
		java.sql.Date getTimeFromDB = new java.sql.Date(epoch);
		ZonedDateTime result = ZonedDateTime.ofInstant(
				Instant.ofEpochMilli(getTimeFromDB.getTime()),
				ZoneId.of("Asia/Seoul"));
		System.out.println("DB로부터 얻은 후 :::"+ result);

	}
}
