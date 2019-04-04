public class CartDemo
{
	public static void main(String[] args){
		for(int i = 1000 ; i < 10000; i++){
			if((i/1000 == i%1000/100) && (i%1000%100/10 == i%1000%100%10) && (((int)Math.sqrt(i)*(int)Math.sqrt(i)) == i)){
				System.out.println("肇事车的车牌号是:"+i);
			}	
		}
	}
}