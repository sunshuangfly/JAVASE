package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * forѭ�����
 * forѭ�����������ظ�ִ��ĳ�����,ֱ��ĳ�������õ�����
 * �����﷨:
 * for(���ʽ1;���ʽ2;���ʽ3) {
 * 	�������
 * }
 * ���ʽ1:��ʼ�����ʽ,������ɱ����ĳ�ʼ��
 * ���ʽ2:ѭ���������ʽ,ֵΪboolean�͵ı��ʽ,ָ��ѭ������
 * ���ʽ3:ѭ����������ʽ,�����޸ı���,�ı�ѭ������
 * 
 * @author ��
 * @date 2017��9��13��
 */
public class ForDemo {

	/**
	 * ��0~100��
	 */
	@Test
	public void test1() {
		//�������sum���������
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	/**
	 * foreach
	 * foreach��for�ļ򻯰�,��Ҫ���ڶ����ݵı���
	 * �﷨:
	 * for(Ԫ�ر���x:�������� object) {
	 * 	������x��java���;
	 * }
	 */
	//�������鲢����
	@Test
	public void test2() {
		//����һά����
		int arr[] = {1,2,3,4,5,6,7};
		//��������
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
