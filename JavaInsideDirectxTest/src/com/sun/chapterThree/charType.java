package com.sun.chapterThree;
/**
 * ʵ�ֽ�unicode����ĳЩλ���ϵ��ַ�һ��һЩ�ַ���unicode���е�λ���ڿ���̨���
 * 
 * @author Administrator
 *
 */
public class charType {

	public static void main(String[] args) {
		char word1 = 'd',word2='@';
		int p = 23423,p2 = 43543;
		System.out.println("d��unicode���ܵ�˳��λ����:"+(int)word1);
		System.out.println("@��unicode���ܵ�˳��λ����:"+(int)word1);
		System.out.println("unicode���е�23423λ��:"+(char)p);
		System.out.println("unicode���е�43543λ��:"+(char)p2);
	}
}
