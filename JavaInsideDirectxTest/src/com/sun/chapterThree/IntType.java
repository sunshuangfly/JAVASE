package com.sun.chapterThree;
/**
 * ���弸��int�ͱ���
 * int����Ϊ��������,����������,Ҳ�����Ǹ���.
 * @author Administrator
 *
 */
public class IntType {
	//����int���ͱ���x
	static int x=1; 
	//����int���ͱ���,x1,y1
	static int x1=43;
	static int y1=23;
	//����int ���ͱ���,x2,y2
	static int x2=100;
	static int y2=200;
	
	//����Щ������Ӽ���������ӡ
	public static void main(String[] args) {
		int num = x+x1+y1+x2+y2;
		System.out.println(num);
	}
}
