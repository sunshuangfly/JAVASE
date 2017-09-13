package com.sun.chapterFive_String;

import java.util.Date;

import org.junit.Test;

/**
 * String
 * 
 * @author ��
 * @date 2017��9��13��
 */
public class StringDemo {

	@Test
	public void test1() {
		char a[] = { 'a', 'b', 'c', 'd', 'e' };
		String s = new String(a);
		System.out.println(s);
	}

	/**
	 * �ַ������� ʹ��'+'���������ʵ�����Ӷ���ַ����Ĺ���.'+'������������Ӷ�������������һ��String����
	 */
	@Test
	public void test2() {
		// ����String����
		String str1 = new String("hello");
		String str2 = new String("java");
		String str3 = str1 + str2;
		System.out.println(str3);
	}

	/**
	 * String���������������� ���������������ַ�������,�Ὣ��Щ��������ֱ��ת�����ַ���
	 */
	@Test
	public void test3() {
		// ����String����
		String str = new String("�ҽ�Tom");
		// ����int���ͱ���age
		int age = 17;
		// ����float���ͱ���f
		float f = 2.5f;
		// ���������������
		System.out.println(str + "�ҽ���" + age + "��,��ϲ������,ÿ�쿴" + f + "Сʱ");
	}

	/**
	 * ��ȡ�ַ������� ʹ��String���length()�������Ի�ȡ�ַ�������ĳ���
	 */
	@Test
	public void test4() {
		// �����ַ�������
		String str = new String("���Ǻ�,�ҽ�Tom.");
		int length = str.length();
		System.out.println(str + "����ַ����ĳ�����:" + length);
	}

	/**
	 * �ַ������� String���ṩ�����ֲ����ַ����ķ���,indexOf()��lastIndexOf()
	 * indexOf()�����������ַ����ַ�����һ�γ��ֵ�λ��,����ֵΪ����,��0��ʼ����,���û�з���-1
	 * lastIndexOf()�������ص����������ַ����ַ������һ�γ���λ�õ�����,û�з���-1
	 */
	@Test
	public void test5() {
		// ����String����
		String str = new String("abcdefghijkf");
		// ����Ҫ�������ַ�subStr
		String sbuStr = new String("f");
		// �����ַ�'a'��str���Ǹ�λ�ó���
		int firstIndex = str.indexOf(sbuStr);
		System.out.println(firstIndex);
		// �����ַ�'f'�����ֵ�����λ��
		int lastIndex = str.lastIndexOf(sbuStr);
		System.out.println(lastIndex);
	}
	
	/**
	 * ��ȡָ������λ�õ��ַ�
	 * charAt()�������Խ�ָ�����������ַ�����
	 */
	@Test
	public void test6() {
		//�����ַ�������
		String str = "hello word";
		//����ָ������Ϊ3���ַ�
		char charAt = str.charAt(3);
		System.out.println(charAt);
	}
	
	/**
	 * ��ȡ���ַ���
	 * sbustring(int beginIndex)
	 * �÷������ص��Ǵ�ָ��������λ�ÿ�ʼ��ȡֱ�����ַ�����β���Ӵ�
	 * sbustring(int beginIndex,int endIndex)
	 * �÷����ڶ�������ָ����ȡ��������λ��
	 */
	@Test
	public void test7() {
		//����String����
		String str = new String("hello world");
		//ָ������,��ȡ���ַ���
		String substring = str.substring(3);
		System.out.println(substring);
	}
	
	@Test
	public void test8() {
		//����String ����
		String  str = new String("�ú�ѧϰ,��������.");
		String substring = str.substring(1, 6);
		System.out.println(substring);
	}
	
	/**
	 * ȥ���ո�
	 * str.trim()
	 * �÷��������ַ����ĸ���,����ͷ����β���Ŀո�
	 */

	@Test
	public void test9() {
		//����String ����
		String  str = new String("  �ú�ѧϰ,��������.   ");
		int length1 = str.length();
		String trim = str.trim();
		int length2 = trim.length();
		System.out.println(trim+"�ַ���ԭ������Ϊ"+length1+"�ַ������ڳ���Ϊ:"+length2);
	}
	
	/**
	 * �ַ����滻
	 * str.replace(char oldChar,char newChar)
	 * �÷�����ʵ�ֽ�ָ�����ַ����ַ����滻���µ��ַ����ַ���
	 * oldChar:�ò���ָ��Ҫ�滻���ַ����ַ���
	 * newChar:�ò���ָ�������滻ԭ���ַ���������
	 * ����滻�����жദ�ظ�����,�Ὣ���еĶ��滻��,�����������ĸ�����ִ�Сд��.
	 */
	@Test
	public void test10() {
		//����String ����
		String  str = new String("�ú�ѧϰ,��������.�ú�ѧϰ,��������.�ú�ѧϰ,��������.�ú�ѧϰ,��������.");
		String replace = str.replace("����", "Ŭ��");
		System.out.println(replace);
	}
	
	/**
	 * �ж��ַ�����ʼ���β
	 * startWith(String prefix)
	 * endWith(String prefix)
	 * ���ַ����ֱ������ж��ַ����Ƿ���ָ�����ݿ�ʼ�����
	 */

	@Test
	public void test11() {
		//����String ����
		String  str1 = new String("hello world hello java");
		String  str2 = new String("hello java hello world");
		boolean startsWith1 = str1.startsWith("he");
		boolean startsWith2 = str1.startsWith("ld");
		boolean endsWith1 = str2.endsWith("ld");
		boolean endsWith2 = str2.endsWith("he");
		System.out.println(startsWith1);
		System.out.println(startsWith2);
		System.out.println(endsWith1);
		System.out.println(endsWith2);
	}
	
	/**
	 * �ж��ַ����Ƿ����
	 * �ַ�������ıȽϲ��ܼ򵥵�ʹ�ñȽ������"==",��Ϊ�Ƚ�������Ƚϵ��������ַ����ĵ�ֵַ�Ƿ���ͬ
	 * ��ʱ�����ַ�����������ͬ,����������ڴ��ַҲ�ǲ�ͬ��,ʹ�ñȽ��������Ȼ����ʾfalse
	 * str.equals(String otherser)
	 * �÷����Ƚ������ַ����ַ��ͳ����Ƿ���ͬ,���ִ�Сд
	 * str.equalslgnoreCase(String otherser)
	 * �÷����Ƚ��ַ����ǲ����ִ�Сд��
	 */
	/**
	 * ʹ�ñȽ���������бȽ�,���Ϊfalse,��Ϊ�Ƚϵ����ڴ��еĵ�ֵַ,���ǲ���ͬ��
	 */
	@Test
	public void test12() {
		//����String ����
		String  str1 = new String("�ú�ѧϰ,��������");
		String  str2 = new String("�ú�ѧϰ,��������");
		boolean b = (str1 == str2);
		System.out.println(b);
	}
	
	/**
	 * ʹ��str.equals(String otherser)�Ƚ������ַ���
	 */
	@Test
	public void test13() {
		//����String ����
		String  str1 = new String("abcde");
		String  str2 = new String("ABCDE");
		String  str3 = new String("abcde");
		//�Ƚ�str1��str2,һ����дһ��Сд
		boolean equals1 = str1.equals(str2);
		//ʹ��str.equalslgnoreCase(String otherser)�Ƚ�str1��str2
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		//�Ƚ�str1��str3,�����ַ��볤����ͬ
		boolean equals2 = str1.equals(str3);
		System.out.println(equals1);
		System.out.println(equalsIgnoreCase);
		System.out.println(equals2);
	}
	
	/**
	 * �����ֵ�˳��Ƚ������ַ���
	 * str.compareTo(String otherstr)
	 * �÷���Ϊ�����ֵ�˳��Ƚ������ַ���,�ñȽϻ����ַ����и����ַ���Unicodeֵ
	 * ��������ֵ�˳���String����λ�ڲ����ַ���֮ǰ,��ȽϽ��Ϊһ��������
	 * ��������ֵ�˳���String����λ�ڲ����ַ���֮��,��ȽϽ��Ϊһ��������
	 * ��������ַ������,����0
	 */
	@Test
	public void test14() {
		//����String����
		String str1 = new String("a");
		String str2 = new String("b");
		String str3 = new String("a");
		//�����ֵ�˳����бȽ�str1��str2
		int compareTo1 = str1.compareTo(str2);
		//�����ֵ�˳����бȽ�str3��str2
		int compareTo2 = str2.compareTo(str1);
		//�����ֵ�˳����бȽ�str3��str1
		int compareTo3 = str3.compareTo(str1);
		System.out.println(compareTo1);
		System.out.println(compareTo2);
		System.out.println(compareTo3);
	}
	
	/**
	 * ��ĸ��Сת��
	 * str.toLowerCase()
	 * �÷�����Stringת��ΪСд,����ַ�����û��Ӧ�ñ�ת�����ַ�,��ԭ�ַ�������;
	 * ���򷵻�һ���µ��ַ���,��ԭ���ַ����еĴ�дת�ɵȼ۵�Сд�ַ�,�ַ���������ͬ
	 * str.toUpperCase()
	 * �÷�����Stringת��Ϊ��д,����ַ�����û��Ӧ�ñ�ת�����ַ�,��ԭ�ַ�������;
	 * ���򷵻�һ���µ��ַ���,��ԭ���ַ����е�Сдת�ɵȼ۵Ĵ�д�ַ�,�ַ���������ͬ
	 */
	
	@Test
	public void test15() {
		//����String����
		String str = new String("ABcdEfgH");
		//��str�еĴ�д��ĸת��Сд��ĸ
		String lowerCase = str.toLowerCase();
		//��str��Сд��ĸת�ɴ�д��ĸ
		String upperCase = str.toUpperCase();
		System.out.println(lowerCase);
		System.out.println(upperCase);
	}
	
	/**
	 * �ַ����ָ�
	 * �÷�������ʹ�ַ�������ָ���ķָ��ַ����ַ��������ݽ��зָ�,
	 * �����ָ��Ľ��������ַ���������,�÷����ṩ�����ַָʽ
	 * str.split(String sign)
	 * signΪ�ָ��ַ����ķָ��,Ҳ����ʹ��������ʽ.
	 * û��ͬ��Ķ��ֽ��зָ�ķ���,����붨�����ָ��,����ʹ�÷���"|",����,",|="��ʾ�ָ���ֱ�Ϊ","��"="
	 * str.split(String sign,int limit)
	 * �÷����ɸ��ݸ����ķָ�����ַ������в��,���޶���ִ���
	 * ����signΪ�ָ��,limitΪ���Ƶķָ����
	 * 
	 */
	@Test
	public void test16() {
		//�����ַ���
		String str = "123.432.543.432.5342.234";
		//����'.'���зָ�,ʹ��ת���ַ�\\
		String[] split = str.split("\\.");
		//��������ȡֵ
		for (String s : split) {
			System.out.println(s);
		}
		System.out.println("-----------------------");
		//����"."���зָ�,���Ʒָ�2��,ʹ��ת���ַ�\\
		String[] split2 = str.split("\\.", 2);
		//��������ȡֵ
		for (String s : split2) {
			System.out.println(s);
		}
	}
	
	/**
	 * ��ʽ���ַ���
	 * str.format(String format,Object...args)
	 * 
	 */
	
	/**
	 * ���ں�ʱ���ַ�����ʽ��
	 * format()����ͨ������������ת������Ϊ������ʵ�ֶ����ں�ʱ��ĸ�ʽ��
	 */
	//ʵ�ֽ���ǰ������Ϣ��4λ���,�·�ȫ��,2λ������ʽ���
	@Test
	public void test17() {
		//����Date����
		Date date = new Date();
		//��ʽ��4λ���
		String year = String.format("%tY", date);
		//��ʽ���·�ȫ��
		String month = String.format("%tB", date);
		//��ʽ��2λ������ʽ���
		String newdate = String.format("%td", date);
		System.out.println("������"+year+"��,"+"������"+month+newdate+"��");
	}
	
	/**
	 * ʱ���ʽ��
	 */
}
