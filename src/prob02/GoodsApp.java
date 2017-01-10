package prob02;
import java.util.Scanner;
public class GoodsApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇개입력하시겠씁니까.");
		Goods[] good =new Goods[scanner.nextInt()];
		for(int i=0;i<good.length;i++){
			String name=scanner.next();
			int price=scanner.nextInt();
			int count=scanner.nextInt();
			good[i] = new Goods(name,price,count);
		}
		for(int i=0;i<good.length;i++)
		System.out.println(good[i]);
	}
}
