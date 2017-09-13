package com.sun.chapterFive_String;

import org.junit.Test;

/**
 * String
 * @author ��
 * @date 2017��9��13��
 */
public class StringDemo {

	@Test
	public void test1() {
		char a[]={'a','b','c','d','e'};
		String s = new String(a);
		System.out.println(s);
	}
	
	/**
	 * �ַ�������
	 * ʹ��'+'���������ʵ�����Ӷ���ַ����Ĺ���.'+'������������Ӷ�������������һ��String����
	 */
	@Test
	public void test2() {
		//����String����
		String str1 = new String("hello");
		String str2 = new String("java");
		String str3 = str1+str2;
		System.out.println(str3);
	}
	
	/**
	 * String����������������
	 * ���������������ַ�������,�Ὣ��Щ��������ֱ��ת�����ַ���
	 */
	@Test
	public void test3() {
		//����String����
		String str = new String("�ҽ�Tom");
		//����int���ͱ���age
		int age = 17;
		//����float���ͱ���f
		float f = 2.5f;
		//���������������
		System.out.println(str+"�ҽ���"+age+"��,��ϲ������,ÿ�쿴"+f+"Сʱ");
	}
	
	/**
	 * ��ȡ�ַ�������
	 * ʹ��String���length()�������Ի�ȡ�ַ�������ĳ���
	 */
	@Test
	public void test4(){
		//�����ַ�������
		String str = new String("���Ǻ�,�ҽ�Tom.");
		int length = str.length();
		System.out.println(str+"����ַ����ĳ�����:"+length);
	}
	
	/**
	 * �ַ�������
	 * String���ṩ�����ֲ����ַ����ķ���,indexOf()��lastIndexOf()
	 * indexOf()�����������ַ����ַ�����һ�γ��ֵ�λ��,����ֵΪ����,��0��ʼ����,���û�з���-1
	 * lastIndexOf()�������ص����������ַ����ַ������һ�γ���λ�õ�����,û�з���-1
	 */
	@Test
	public void test5() {
		//����String����
		String str = new String("abcdefghijkf");
		//����Ҫ�������ַ�subStr
		String sbuStr = new String("f");
		//�����ַ�'a'��str���Ǹ�λ�ó���
		int firstIndex = str.indexOf(sbuStr);
		System.out.println(firstIndex);
		//�����ַ�'f'�����ֵ�����λ��
		int lastIndex = str.lastIndexOf(sbuStr);
		System.out.println(lastIndex);
		
	}
}
