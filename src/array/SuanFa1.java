package array;


/**
 * 
 * @author Venus
 *
 *��main����������array1��array2����������������int[]�������飻
 *�ô�����{} ��array��ʼ��Ϊ8������   2 3 5 7   11  13  17  19 
 *��ʾarray1������
 *��ֵarray2��������array1  �޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ
 *
 *
 *array1��array2��ʲô��ϵ==��ֵַ��ͬ����ָ��ѿռ��Ψһ����ֵʵ��
 *
 *
 *ʵ��array2��array1����ĸ���
 */
public class SuanFa1 {

	public static void main(String[] args) {
		 //����array1��array2����������������int[]��������
		int [] array1,array2;
		
		//�ô�����{} ��array��ʼ��Ϊ8������   2 3 5 7   11  13  17  19 
		array1 = new int[] {2,3,5,7,11,13,17,19}; 
		 
		//��ʾarray1������
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		
		//��ֵarray2��������array1
		//������Ϊ����ĸ���
		 array2=array1;
		
		
		/*
		 ����ĸ���
		 
		 array2=new int[array1.length];
		 for(int i=0;i<array2.length;i++){
		 	array2[i]=array1[i];
		 }
		 */
		
		//�޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ 
		for(int i=0;i<array2.length;i++) {
			if(i%2==0) {
				array2[i]=i;
			}
		}
		
		
		//��ʾarray1
		System.out.println();
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
			
	}

}
