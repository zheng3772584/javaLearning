package array;
/**
 * 
 * @author Venus
 * 
 *  ����ֵ��������Ԫ�ص����ֵ����Сֵ��ƽ�������ܺ͵ȣ�
 *  
 *  ����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ���һЩ���������
 *  Ȼ���������Ԫ�ص����ֵ����Сֵ����ֵ��ƽ��ֵ�������
 *  Ҫ�����������������λ��
 *
 *
 */
public class RandomNum {

	public static void main(String[] args) {
		//��������10��Ԫ�ص�����
		int array[]=new int[10];
		
		
		//��ֵ
		for(int i=0; i < array.length; i++) {
			//�����ֵ����Χ�ڣ�a��b���Ĺ�ʽ��
			//��int����Math.random����*��b-a+1��+a��
			array[i]=(int)(Math.random()*(99-10+1)+10);
		}
		
		//�������飬�������
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		
		
		
		//�����ֵ
		 int maxNum=array[0];//��ʼ�����ֵΪ��һ��Ԫ��
		 for(int i=0;i<array.length;i++) {
			 if(maxNum<array[i]) {
				 maxNum=array[i];
			 }	
		 }
		 System.out.println("���ֵΪ��"+maxNum);
		 
		 
		//����Сֵ
		 int minNum=array[0];//��ʼ����СֵΪ��һ��Ԫ��
		 for(int i=0;i<array.length;i++) {
			 if(minNum>array[i]) {
				 minNum=array[i];
			 }	
		 }
		 System.out.println("��СֵΪ��"+minNum);
		 
		 
		//�����ܺ�
		 int sum =0;
		 for(int i=0;i<array.length;i++) {
			 sum+=array[i]; 
		 }
		 System.out.println("�ܺ�Ϊ��"+sum);
		 
		 
		//����ƽ����
		 int averageNum = sum /array.length;
		 System.out.println("ƽ����Ϊ��"+averageNum);
		
	

	}

}
