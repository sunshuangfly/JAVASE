package com.sun.chapterSix_Array;
/**
 * ð������
 * 	
 * @author ��
 * @date 2017��9��15��
 */
public class BubbleSort {
	//����main��������ð�����򷽷����������ð������
	public static void main(String[] args) {
		//��������
		int[] array = {20,43,5,42,2,22};
		//����������ñ���������ӡ
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(array);
	}
	
	/**
	 * ����ð�����򷽷�
	 * @param array
	 */
	public void sort(int[] array) {
		//����һ����ʱ����temp
		int temp = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j] >array[j+1]) {
					//��array[j]��ֵ����ʱ����temp
					temp = array[j+1];
					//��array[j]��ֵ��array[j+1]
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		show(array);
	}

	/**
	 * �����������鷽��show
	 * @param array
	 */
	private void show(int[] array) {
		for (int i : array) {
			System.out.print(">"+i);
		}
	}
}
