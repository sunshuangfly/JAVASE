package com.sun.chapterThree;
/**
 * �������Լ� : ++ , --
 * �����Լ�������ǵ�Ŀ�����,���Է��ڲ���Ԫ֮ǰ,Ҳ���Է��ڲ���Ԫ֮��
 * ����Ԫ������һ�����ͻ򸡵��ͱ���.
 * ����,�Լ��������������ʹ������ֵ��1���߼�һ
 * ���ڲ���Ԫǰ��ĻὫ�����ȼ�һ���һ,��ʹ�øñ���������ʽ����
 * ���ڲ���Ԫ����Ļ���ʹ�ñ���������ʽ����,�ټ�һ���һ
 * @author Administrator
 *
 */
public class IncrementDecrement {

	public static void main(String[] args) {
		//�������
		int a,b;
		a = 5;
		b = --a + (a++);  //����ִ��--a,a=4,Ȼ������4+4,b=8,���ִ��a++,a=5
		System.out.println(b);
		System.out.println(a);
	}
}
