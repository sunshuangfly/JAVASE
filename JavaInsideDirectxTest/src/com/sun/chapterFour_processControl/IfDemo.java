package com.sun.chapterFour_processControl;
/**
 * ������� : if
 * �﷨:
 * 		if(�������ʽ){
 * 			�������
 * 		}
 * ����:
 * 		if(�������ʽ) {
 * 			�������
 * 		}else if{
 * 			�������
 * 		}else if...
 * 		 else{
 * 			�������
 * 		}
 * @author Administrator
 *
 */
public class IfDemo {

	public static void main(String[] args) {
		//�������
		int a = 10;
		int b = 20;
		if(a == b) {
			System.out.println("a����b");
		}else if(a > b) {
			System.out.println("a����b");
		}else {
			System.out.println("aС��b");
		}
		
		System.out.println("--------------------");
		
		//�������
		int c = 100;
		if(c==100)
			System.out.println("c��ֵ��100");
		//˵�� ��Ȼif����ĸ�������ֻ��һ�����,ʡ��'{}'��û���﷨����,����Ϊ����ǿ����Ŀɶ�����ò�Ҫʡ��
		
		System.out.println("------------------------");
		int math = 90;
		int english = 50;
		if(math > 60) {
			System.out.println("��ѧ������");
		}else {
			System.out.println("��ѧû����");
		}
		if(english > 60) {
			System.out.println("Ӣ�Ｐ����");
		}else {
			System.out.println("Ӣ��û����");
		}
		
		System.out.println("----------------------");
		
		//�������,ʹ��if...else if���֧���ͨ���жϱ���ֵ����������
		int x = 30;
		if(x > 100) {
			System.out.println("x��ֵ����100");
		}else if(x > 50) {
			System.out.println("x��ֵС��100���ڵ���50");
		}else if (x > 0) {
			System.out.println("x��ֵ����0С�ڵ���50");
		}else {
			System.out.println("x��ֵС�ڵ���0");
		}
	}
}
