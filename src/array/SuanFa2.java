package array;


/**
 * �����㷨������ ��ת
 * 
 * @author Venus
 *
 */
public class SuanFa2 {

	public static void main(String[] args) {
		
		String[] array=new String[] {"AA","BB","CC","DD","EE","FF"};
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		
		//����ĸ���
		String[] array1=new String[array.length];
		for (int i=0;i<array.length;i++) {
			 array1[i]=array[i];
		}
		//������ƺ������
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
		
		
		//����ķ�ת
		//��ʽ1
		//for(int i=0;i<array.length/2;i++) {
//			String temp = array[i];
//			array[i] = array[array.length - i -1];
//			array[array.length-i-1]=temp;
//		}
//		
		/*
		 ����2��
		 for(int i =0,j=array.length-1;i<j;i++;j--) {
			 String temp =array[i];
			 array[i]=array[j];
			 array[j]=temp;
		 }
		 */
          for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
          System.out.println();
		
 //����(����)
		//���Բ���
		String test="BB";
		boolean isFlag =true;
		for (int i = 0;i <array.length;i++){
			if(test.equals(array[i])) {
				System.out.println("�ҵ���ָ��Ԫ�أ�"+test+","+"λ���ǣ�"+i);
				isFlag =false;
				break;
			}
		}
		if(isFlag) {
		System.out.println("δ�ҵ�ָ��Ԫ��");
		}
		
		
//���ַ����ң�
		//Ҫ���ҵ������������
		
		int[]  array2=new int[]{54,78,65,21,45,-12,-45,99,33,1,48,-5};
		
		int test2= -12;
		int first =0;//��ʼ��������
		int end=array2.length -1;
		 while (first<=end) {
			 int middle =(first+end)/2;
			 if(test2 == array2[middle]) {
				 System.out.println("�ҵ���ָ��Ԫ�أ�λ��Ϊ:"+middle);
				 break;
			 }else if(array2[middle]>test2) {
				 end=middle -1;
			 }else {
				 first =middle +1;
			 }
		 }
		
		
		
		
		
		
		
		
		
		
		
	}

}
