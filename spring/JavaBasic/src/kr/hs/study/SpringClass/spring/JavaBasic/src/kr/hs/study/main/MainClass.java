package kr.hs.study.main;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class MainClass {

	public static void main(String[] args) {
		Hello a = new HelloWorldEn();
		callMethod(a);
		Hello b = new HelloWorldKr();
		Kr(b);
	}
	public static void callMethod(Hello a) {
		a.sayHello();
		//Static 전역메소드라 아무대나 실행 가능
	}

	public static void Kr(Hello hello) {
		hello.sayHello();
	}
}
//인터페이스s

