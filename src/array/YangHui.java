package array;


/**
 * 
 * @author Venus
 *
 *
 *
 *     ������ǣ�
 * 1����һ����1��Ԫ�ء���n����n��Ԫ�أ�
 * 2��ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1��
 * 3���ӵ����п�ʼ������һ��Ԫ�غ����һ��Ԫ���⣺
 * yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
 * 
 * 
 */
public class YangHui {

	public static void main(String[] args) {
		
		//1��������ʼ����ά����
		int yangHui[][]=new int[10][]; 
		
		
		//2��������Ԫ�ظ�ֵ
		for(int i=0;i<yangHui.length;i++) {
			yangHui[i]=new int[i+1];
			
			//����ĩԪ�ظ�ֵ
			yangHui[i][0]=1;
			yangHui[i][i]=1;
			//yangHui[i][0]=yangHui[i][i]=1;
			
			//��ÿ�з���ĩԪ�ظ�ֵ
			if(i>1) {
				for(int j=1;j<yangHui[i].length-1;j++) {
					 yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
					
				}
			}
		}
		
		
		//3��������ά����
		for(int i=0;i<yangHui.length;i++) {
			for(int j=0;j<yangHui[i].length;j++) {
				System.out.print(yangHui[i][j]+" ");
			}
			System.out.println();//����
		}
		
		
	}
}
