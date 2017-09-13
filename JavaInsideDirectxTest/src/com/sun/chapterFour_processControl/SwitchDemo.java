package com.sun.chapterFour_processControl;

import org.junit.Test;

/**
 * switch���֧��� switch����б��ʽ��ֵ����������,�ַ��ͻ��ַ�������,����ֵ1~nҲ����������,�ַ��ͻ��ַ�������.
 * switch������ȼ�����ʽ��ֵ,������ʽ��ֵ��ĳ��case�����ֵ��ͬ,��ִ�и�case��������ɸ����,ֱ������break���Ϊֹ.
 * ��û��һ��������ֵ����ʽ��ֵ��ͬ,��ִ��default��������.
 * default���Ϊ��ѡ��,�����������,��switch����б��ʽ��ֵ�����κ�case����ֵ��ͬ,switch�����κδ���. �����﷨����:
 * switch(���ʽ) { case ����ֵ1: ����1 break; ... case ����ֵn: ����n break; default:
 * ����n+1 break; }
 * 
 * @author Administrator
 *
 */
public class SwitchDemo {

	public static void main(String[] args) {
		// ����str��ֵ,�����ͬ����ʾ��Ϣ
		String str = "���,����";
		switch (str) {
		case "���":
			System.out.println("�ú�ѧϰ");
			break;
		case "����":
			System.out.println("��������");
			break;
		case "���,����":
			System.out.println("�ú�ѧϰ,��������!");
			break;
		default:
			System.out.println("�𰸴���,������");
		}

		// ��ʾ:ͬһ��switch���,caseֵ������ͬ

	}

	/**
	 * 
	 */
	@Test
	public void test1() {
		// ʹ��switch����ӡ��һ������Ӣ�ﵥ��
		int week = 3;
		switch (week) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("sorry,i don`t know");
		}
	}

}
