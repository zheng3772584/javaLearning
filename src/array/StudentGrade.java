package array;

import java.util.Scanner;


 /**
  * 
  * @author Venus
  *
  *
       从键盘读入学生成绩 找出最高分 并输出学生成绩等级
       成绩》= 最高分-10 =A   》=最高分-20=B 》=最高分-30=C  其余为D
  *
  */

public class StudentGrade {

	public static void main(String[] args) {
		
		
		//1、使用Scanner 读取学生个数
		Scanner scanner= new Scanner(System.in);
		System.out.print("请输入学生人数：");
		int number = scanner.nextInt();
		
		//2、根据个数创建数组，存储学生成绩，动态初始化
		int[] scores = new int[number];
		
		
		//3、给数组中的元素赋值
		System.out.println("请输入"+number+"个学生的成绩：");
		//int max;优化1：赋值同时获取最高分
		for(int i=0;i<scores.length;i++) {
			
			scores[i]=scanner.nextInt();
			
			//if(max<scores[i]) 优化1
			//max =scores[i];  优化1
		
		}
		
		
		//4、获取数组元素中最大值：最高分
		
		int max =0;
		for(int i=0;i<scores.length;i++) {
			if(max<scores[i]) {
				max =scores[i];
			}
		}
		
		//5、根据每个学生成绩与最高分的差值，得到学生成绩等级 并输出成绩和等级
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
			System.out.println("学生" + i + "成绩是：" + scores[i] + ",等级是："+level);
		}
		
		

	}

}
