package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * breakѭ������
 * ѭ�����ư�������������,
 * һ�����ǿ���ѭ�������ı仯��ʽ
 * һ�������ѭ������ת
 * ����ѭ������ת��Ҫ�õ�break��continue�����ؼ���
 * breakΪѭ���ж�,continueΪ��������ִ����һ��
 * @author ��
 * @date 2017��9��13��
 */
public class BreakDemo {

	@Test
	public void test1() {
		for(int x = 1;x <= 100;x++) {
			System.out.println(x);
			if(x == 10) { //������������ѭ����
				break;	//ʹ��break��ֹѭ��
			}
		}
	}
	
	/**
	 * �������ѭ��Ƕ��,break��佲ֻ���ó������������������ڴ��ѭ���ṹ,ֻ�����ڲ�ѭ��
	 */
	@Test
	public void test2() {
		for (int x = 0;x < 5;x++) {
			for(int y = 0;y < 10;y++) {
				if(y == 5) {
					break;
				}
				System.out.println("xΪ:"+x+"yΪ:"+y);
			}
		}
	}
	
	/**
	 * ʹ��java�ṩ��'��ǩ'����,�����������ѭ��
	 * �﷨:
	 * ��ǩ�� :ѭ����{
	 * 		break ��ǩ��;
	 * }
	 */
	@Test
	public void test3() {
		stop :for (int x = 0;x < 5;x++) {
			for(int y = 0;y < 10;y++) {
				if(y == 5) {
					break stop;
				}
				System.out.println("xΪ:"+x+"   "+"yΪ:"+y); //�����ڲ�ѭ����ֹ,���Ҳ����ֹ
			}
		}
	}
}
