package com.sun.chapterSix_Array;

import org.junit.Test;

/**
 * ����������:���� array ����:������ͬ�������͵�һ�����ݵļ���
 * 
 * @author ��
 * @date 2017��9��14��
 */
public class ArrayDemo {

	/**
	 * ����һά���� һά����ʵ���Ͼ���һ����ͬ�������͵����Լ���.
	 * ������Ϊ��������ʹ��new�ؼ��ֽ����ڴ����.��ʹ������֮ǰ,�������ȶ��������������������. һά���鴴���ķ�ʽ������: ����Ԫ������
	 * ��������[]; ����Ԫ������[] ��������;
	 */
	// ����int������,��ʵ�ָ����µ��������
	@Test
	public void test1() {
		// ��������ʼ��һά����
		int day[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// ʹ��forѭ������Ϣ���
		for (int i = 0; i < day.length; i++) {
			System.out.println((i + 1) + "����" + day[i] + "��");
		}
	}

	/**
	 * ��ά���� ���һά�����и���Ԫ�ض���һά����,��ô�����һ����ά����. ��ά���鳣���ڱ�ʾ��,���е���Ϣ���к������,��һ���±��ʾԪ�����ڵ���,
	 * �ڶ����±��ʾԪ�����ڵ��� ������ά������﷨: ����Ԫ������ ��������[][]; ����Ԫ�ص�����[][] ��������; ��ά�����ʼ���﷨����:
	 * type arrayname[][] = {value1,value2...valuen};
	 */

	// ʵ�����һ��3��4��������Ԫ�ض�Ϊ0�ľ���
	@Test
	public void test2() {
		int a[][] = new int[3][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * ����Ļ������� ��������
	 */
	// ������λ����,��������Ԫ�ش�ӡ����
	@Test
	public void test3() {
		// ������ά����
		int array[][] = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	// ������λ����,ʹ��foreach������������Ԫ�ش�ӡ����
	@Test
	public void test4() {
		// ������ά����
		int array[][] = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		for (int x[] : array) {
			for (int y : x) {
				System.out.print(y);
			}
		}
	}

}
