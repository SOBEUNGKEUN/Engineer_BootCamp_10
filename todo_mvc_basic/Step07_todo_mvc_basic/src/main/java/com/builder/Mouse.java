package com.builder;

public class Mouse {
	private String name;
	private String address;
	private String color;
	private int age;
	private int height; // 키
	
	
	//점층적 생성자 패턴
	
	// 1. 기본 생성자
//	public Mouse() {		
//	}
//	
//	// 2. 이름만  알고있을때
//	public Mouse(String name) {
////		this.name = name; // this : 인스턴스 자기 자신
//		
////		this(); // this() : 생성자 호출	
//		this(name, null, null, 0, 0);
//	}
//	
//	
//	// 3. 이름과 주소를 알고 있을때
//	public Mouse(String name, String address) {
//		this(name, address, null, 0, 0);
//	}
//	
//	// 4. 전체를 알 고 있을때
//	public Mouse(String name, String address, String color, int age, int height) {
//		this.name = name;
//		this.address = address;
//		this.color = color;
//		this.age = age;
//		this.height = height;
//	}
//	
//	
//	
	
	// 빌더 패턴 => 점층적 구조 패턴 + 자바 빈 패턴(set) [장점들만 결합]
	
	
	
	
	// 빌더가 Mouse 인스턴스 만들어준다
	// builder안에 있는 값을 실제 Mouse에 있는 필드에 세팅
	public Mouse(Builder builder) {
		this.name = builder.name;
		this.address = builder.address;
		this.color = builder.color;
		this.age = builder.age;
		this.height = builder.height;
	}

	@Override
	public String toString() {
		return "Mouse [name=" + name + ", address=" + address + ", color=" + color + ", age=" + age + ", height="
				+ height + "]";
	}
	
	// 내부에 별도의 정적 클래스 생성(내부 클래스)
	public static class Builder{
		private String name;
		private String address;
		private String color;
		private int age;
		private int height; // 키
		
		// Builder라는 생성자 생성
		// name이 필수로 작성해야하는 필드인 경우
		// Builder라는 생성자를 통해서 Builder인스턴스 생성
		public Builder(String name) {
			this.name = name;			
		}
		public Builder address(String address) {
			this.address = address;
			return this; // Builder 클래스에 있는 인스턴스 자기 자신 반환 (type : Builder)
		}
		
		public Builder color(String color) {
			this.color = color;
			return this; 
		}
		public Builder age(int age) {
			this.age = age;
			return this; 
		}
		public Builder height(int height) {
			this.height = height;
			return this; 
		}
		
		public Mouse build() {
			return new Mouse(this);
			// build()를 마지막에 호출해서 마무리 Mouse()생성 인스턴스 반환 인자값 this
			// Mouse 생성자 호출 49번줄로 이동해서 값들 this로 세팅
		}
		
	}	
}
