package array;
/**
 * 
 * @author Venus
 *数组的冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] array =new int[] {1,24,57,8,456,-78,15,412,-45,12};
		
		for(int i=0;i<array.length;i++) {  //显示原始数组
			System.out.print(array[i]+"\t");
		}
		
		System.out.println();
		
		
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}	
		for(int i=0;i<array.length;i++) {  //显示原始数组
			System.out.print(array[i]+"\t");
		}
		
		
		
		
		
		
		
		
	}

}
