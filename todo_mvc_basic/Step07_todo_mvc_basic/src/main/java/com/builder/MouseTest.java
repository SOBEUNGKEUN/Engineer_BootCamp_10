package com.builder;

public class MouseTest {
	public static void main(String[] args) {
		
		// 제리 키 몰라서 0으로 기본값 설정
		// 제리 주소고 기억안나서 null로 기본값 설정
//		Mouse jerry = new Mouse("jerry", null, "갈색", 2, 0);
//		
//		// 점층적 생성자 패턴
//		Mouse jay = new Mouse();
//		System.out.println(jay);
//		
//		// 이름만 알고있을 때
//		Mouse jamie = new Mouse("제이미");
//		System.out.println(jamie);
//		
//		// 이름과 주소를 알고 있을 때
//		Mouse jayz =  new Mouse("제이지", "5");
//		System.out.println(jayz);
//		
		// 장점 : 인스턴스를 생성할때 가독성이 좋아딘다.
		// 단점 : Mouse.java를 보면 계속 코드가 늘어나서 가독성이 안좋아진다.
		
		
		// setter를 활용한 패턴( 자바 빈 패턴)
//		Mouse beyonce = new Mouse();
//		beyonce.setName("비욘세");
//		beyonce.setAge(40);
		
		
		// 빌더 패턴
//		new Mouse.Builder("제리") Builder 클래스의 인스턴스
		
//		new Mouse.Builder("제리").address("화와이") Builder 클래스의 인스턴스(반환 타입이 this니까)
		
//		build()를 마지막에 호출해서 마무리 Mouse()인스턴스 반환
		// 메소드 호출 순서 상관없음
		Mouse jerry = new Mouse.Builder("제리")
								.address("화와이")
								.age(5)
								.build();
		System.out.println(jerry);
		
		
	}
}
