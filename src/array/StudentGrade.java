package array;

import java.util.Scanner;


 /**
  * 
  * @author Venus
  *
  *
       �Ӽ��̶���ѧ���ɼ� �ҳ���߷� �����ѧ���ɼ��ȼ�
       �ɼ���= ��߷�-10 =A   ��=��߷�-20=B ��=��߷�-30=C  ����ΪD
  *
  */

public class StudentGrade {

	public static void main(String[] args) {
		
		
		//1��ʹ��Scanner ��ȡѧ������
		Scanner scanner= new Scanner(System.in);
		System.out.print("������ѧ��������");
		int number = scanner.nextInt();
		
		//2�����ݸ����������飬�洢ѧ���ɼ�����̬��ʼ��
		int[] scores = new int[number];
		
		
		//3���������е�Ԫ�ظ�ֵ
		System.out.println("������"+number+"��ѧ���ĳɼ���");
		//int max;�Ż�1����ֵͬʱ��ȡ��߷�
		for(int i=0;i<scores.length;i++) {
			
			scores[i]=scanner.nextInt();
			
			//if(max<scores[i]) �Ż�1
			//max =scores[i];  �Ż�1
		
		}
		
		
		//4����ȡ����Ԫ�������ֵ����߷�
		
		int max =0;
		for(int i=0;i<scores.length;i++) {
			if(max<scores[i]) {
				max =scores[i];
			}
		}
		
		//5������ÿ��ѧ���ɼ�����߷ֵĲ�ֵ���õ�ѧ���ɼ��ȼ� ������ɼ��͵ȼ�
		char level;
		for(int i=0;i<scores.length;i++) {
			if(max-scores[i]<=10) {
				level='A';
			}else if (max-scores[i]<=20) {
				level='B';
			}else if (max-scores[i]<=30) {
				level='C';
			}else {
				level ='D';
			}
			System.out.println("ѧ��" + i + "�ɼ��ǣ�" + scores[i] + ",�ȼ��ǣ�"+level);
		}
		
		

	}

}
