package array;
/**
 * 
 * @author Venus
 * 
 *  求数值型数组中元素的最大值、最小值、平均数、总和等；
 *  
 *  定义一个int型的一维数组，包含10个元素，分别赋予一些随机整数；
 *  然后求出所有元素的最大值、最小值、和值、平均值、并输出
 *  要求所有随机数都是两位数
 *
 *
 */
public class RandomNum {

	public static void main(String[] args) {
		//声明含有10个元素的数组
		int array[]=new int[10];
		
		
		//赋值
		for(int i=0; i < array.length; i++) {
			//随机赋值数范围在（a，b）的公式：
			//（int）（Math.random（）*（b-a+1）+a）
			array[i]=(int)(Math.random()*(99-10+1)+10);
		}
		
		//遍历数组，输出数组
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		
		
		
		//求最大值
		 int maxNum=array[0];//初始化最大值为第一个元素
		 for(int i=0;i<array.length;i++) {
			 if(maxNum<array[i]) {
				 maxNum=array[i];
			 }	
		 }
		 System.out.println("最大值为："+maxNum);
		 
		 
		//求最小值
		 int minNum=array[0];//初始化最小值为第一个元素
		 for(int i=0;i<array.length;i++) {
			 if(minNum>array[i]) {
				 minNum=array[i];
			 }	
		 }
		 System.out.println("最小值为："+minNum);
		 
		 
		//求最总和
		 int sum =0;
		 for(int i=0;i<array.length;i++) {
			 sum+=array[i]; 
		 }
		 System.out.println("总和为："+sum);
		 
		 
		//求最平均数
		 int averageNum = sum /array.length;
		 System.out.println("平均数为："+averageNum);
		
	

	}

}
