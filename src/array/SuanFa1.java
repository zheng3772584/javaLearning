package array;


/**
 * 
 * @author Venus
 *
 *在main方法中声明array1和array2两个变量，他们是int[]类型数组；
 *用大括号{} 把array初始化为8个素数   2 3 5 7   11  13  17  19 
 *显示array1的内容
 *赋值array2变量等于array1  修改array2中的偶索引元素，使其等于索引值
 *
 *
 *array1和array2是什么关系==地址值相同，都指向堆空间的唯一的数值实体
 *
 *
 *实现array2对array1数组的复制
 */
public class SuanFa1 {

	public static void main(String[] args) {
		 //声明array1和array2两个变量，他们是int[]类型数组
		int [] array1,array2;
		
		//用大括号{} 把array初始化为8个素数   2 3 5 7   11  13  17  19 
		array1 = new int[] {2,3,5,7,11,13,17,19}; 
		 
		//显示array1的内容
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		
		//赋值array2变量等于array1
		//不能作为数组的复制
		 array2=array1;
		
		
		/*
		 数组的复制
		 
		 array2=new int[array1.length];
		 for(int i=0;i<array2.length;i++){
		 	array2[i]=array1[i];
		 }
		 */
		
		//修改array2中的偶索引元素，使其等于索引值 
		for(int i=0;i<array2.length;i++) {
			if(i%2==0) {
				array2[i]=i;
			}
		}
		
		
		//显示array1
		System.out.println();
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
			
	}

}
