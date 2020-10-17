package _95_usingMoreClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _07_BigDecimal {
	public static void main(String[] arg) {

//		잘못된 실수 연산
		double da = 0.1;
		double db = 0.01;
		double dc = da-db;
		System.out.println("da-db: " + dc);
		
//		올바른 실수 연산 예
		BigDecimal ba = BigDecimal.valueOf(0.1);
		BigDecimal bb = BigDecimal.valueOf(0.01);
		BigDecimal bc = ba.subtract(bb);
		System.out.println("ba-bb: "+ bc);
		
//		잘못된 BigDecimal 생성. double실수값을 생성자로 생성해도 연산결과가 정확하지 않을 수 있음. 위에 처럼 valueOf로 생성
		BigDecimal ca = new BigDecimal(0.1);
		BigDecimal cb = new BigDecimal(0.01);
		BigDecimal cc = ca.subtract(cb);
		System.out.println("ca-cb: "+cc);
		
//		나누기 연산 시에는 반드시 MathContext를 이용하여 연산 정확도와 라운드 방식을 지정해야 함.
		BigDecimal xa = BigDecimal.valueOf(1.0);
		BigDecimal xb = BigDecimal.valueOf(0.03);
		BigDecimal xc = xa.divide(xb, MathContext.DECIMAL64);
		BigDecimal xd = xa.divide(xb, MathContext.DECIMAL128);
		System.out.println("Decimal64 xa/xb = "+xc.doubleValue());
		System.out.println("Decimal128 xa/xb = "+xd.doubleValue());
		
//		소수점 올림, 내림
		System.out.println(xc.setScale(0, RoundingMode.DOWN));
		
/*
 * 		RoundingMode.UP   : 올림, 0에서 멀어지는 방향. 12.3 -> 13, -12.3 -> -13
*		RoundingMode.DOWN : 내림, 0에 가까워지는 방향. 12.3 -> 12, -12.3 -> -12
*		RoundingMode.CEILING : 큰 값 쪽으로 이동. 양수일 때 올림, 음수일 때 내림. 12.3 -> 13, -12.3 -> -12
*		RoundingMode.FLOOR : 작은 값 쪽으로 이동. 양수일 때 내림, 음수일 때 올림. 12.3 -> 12, -12.3 -> -13
*		RoundingMode.HALF_UP : 반올림 0.5 이상(>=) 시 올림.
*		RoundingMode.HALF_DOWN : 반올림 0.5 초과(>) 시 올림
*		RoundingMode.HALF_EVEN : 가까운 쪽으로 올림.
 */
	}
}
