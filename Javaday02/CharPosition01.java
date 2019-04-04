import java.util.*;

public class CharPosition01
{
	public static void main(String[] args){
		char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
		char ch = '��';
		
		int[] ary = charPosition(chs,ch);
		System.out.print(Arrays.toString(ary));
	}
	
	public static int[] charPosition(char[] chs,char ch){
		int[] ary = {};
		for(int i = 0; i < chs.length; i++){
			if(chs[i] == ch){
				ary = Arrays.copyOf(ary,ary.length+1);
				ary[ary.length-1] = i;
			}
		}
		return ary;
	}
}