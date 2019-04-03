import java.util.*;

public class TriangleDemo
{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入你想输出三角形的行数");
		int row  = sca.nextInt();
		
		for(int i = 1 ; i <= row*2 ; i++){
			if(i%2 != 0){
				
				for(int k = row; k > i/2+1; k--){
					System.out.print(" ");
				}
				
				for(int j = 1 ; j <= i ; j++){
					
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		}
	}
}