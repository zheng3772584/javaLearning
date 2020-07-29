package array;


/**
 * 数组算法：复制 反转
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
		
		//数组的复制
		String[] array1=new String[array.length];
		for (int i=0;i<array.length;i++) {
			 array1[i]=array[i];
		}
		//输出复制后的数组
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
		
		
		//数组的反转
		//方式1
		//for(int i=0;i<array.length/2;i++) {
//			String temp = array[i];
//			array[i] = array[array.length - i -1];
//			array[array.length-i-1]=temp;
//		}
//		
		/*
		 方法2：
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
		
 //查找(搜索)
		//线性查找
		String test="BB";
		boolean isFlag =true;
		for (int i = 0;i <array.length;i++){
			if(test.equals(array[i])) {
				System.out.println("找到了指定元素："+test+","+"位置是："+i);
				isFlag =false;
				break;
			}
		}
		if(isFlag) {
		System.out.println("未找到指定元素");
		}
		
		
//二分法查找：
		//要查找的数组必须有序
		
		int[]  array2=new int[]{54,78,65,21,45,-12,-45,99,33,1,48,-5};
		
		int test2= -12;
		int first =0;//初始的首索引
		int end=array2.length -1;
		 while (first<=end) {
			 int middle =(first+end)/2;
			 if(test2 == array2[middle]) {
				 System.out.println("找到了指定元素，位置为:"+middle);
				 break;
			 }else if(array2[middle]>test2) {
				 end=middle -1;
			 }else {
				 first =middle +1;
			 }
		 }
		
		
		
		
		
		
		
		
		
		
		
	}

}
