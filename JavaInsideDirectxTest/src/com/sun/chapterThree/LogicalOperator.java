package com.sun.chapterThree;
/**
 * �߼������: &,&&,||,!
 * &��&&������
 * 	&���ж����б��ʽ,&&���жϳ���falseʱ,��ֱ�ӷ���false,�����ͼ����˼���ʱ��,�����Ч��
 * || ȫfalseΪfalse,��true��Ϊtrue
 * @author Administrator
 *
 */
/**
 * �������������ͱ���,ʹ���߼�������Ա����������㲢��ӡ���
 * @author Administrator
 *
 */
public class LogicalOperator {

	public static void main(String[] args) {
		int a = 2;	//��������
		int b = 5;
		//����boolean�ͱ���,���ڱ���Ӧ���߼������&&��ķ���ֵ
		boolean result = (a > b)&&(a != b); //a>bΪfalse,˫������false���ֱ�ӷ���false,���ڽ��к�����ж�
		boolean result2 = (a > b)||(a != b);//false
		System.out.println(result);
		System.out.println(result2);
	}
}
