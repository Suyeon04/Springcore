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
		//Static �����޼ҵ�� �ƹ��볪 ���� ����
	}

	public static void Kr(Hello hello) {
		hello.sayHello();
	}
}
//�������̽�s

