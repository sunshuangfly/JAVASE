package com.sun.chapterThree;
/**
 * �Ƚ������  >,<,==,>=,<=,!=
 * �Ƚ����ڱȽ�,���Ϊboolean��
 * ���ȽϽ������,���н��Ϊtrue,����Ϊfalse
 * @author Administrator
 *
 */
//�Լ�д���򵥵ĳ���ʹ�ñȽ������
public class ComparisonOperator {

	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		if(num1 > num2) {
			System.out.println("����num1�ȳ���num2��");
		}else if(num1 == num2) {
			System.out.println("����num1�볣��num2���");
		}else {
			System.out.println("����num1�ȳ���num2С");
		}
	}
}
