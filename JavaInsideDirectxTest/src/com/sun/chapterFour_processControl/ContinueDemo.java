package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * continue���
 * continue��������break���Ĳ���
 * continue������������ѭ��,������������ѭ��,�ص��������Բ���,����ִ����һ��ѭ��
 * @author ��
 * @date 2017��9��13��
 */
public class ContinueDemo {

	/**
	 * ���0~100֮��������
	 */
	@Test
	public void test1() {
		//�����������ͳ�ƺ�
		int sum = 0;
		for(int x = 0;x <=100;x++) {
			if(x % 2 == 0) {
				continue;
			}
			sum+=x;
		}
		System.out.println("0~100��������Ϊ:"+sum);
	}
}
