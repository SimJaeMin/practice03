package prob06;
import java.util.Scanner;
public class CalcApp {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
		System.out.print(">>>");	
		String expression=scanner.nextLine();
		System.out.println(expression);
		if(expression.equals("quit")){
			break;
		}
		String[] tokens=expression.split(" "); //expression 으로 입력받은것 중 띄어쓰기 하면 그결과가 그 순서대로가 토큰 012 에 저장
		int a=Integer.parseInt(tokens[0]);
		int b=Integer.parseInt(tokens[2]);
		switch(tokens[1]){
		case "+" :{
			Add add = new Add();
			add.setA(a);
			add.setB(b);
			System.out.println(add.calculate());
			break;
		}
		case "-" :{
			Sub sub = new Sub();
			sub.setA(a);
			sub.setB(b);
			System.out.println(sub.calculate());
			break;
		}
		case "*" :{
			Mul mul = new Mul();	
			mul.setA(a);
			mul.setB(b);
			System.out.println(mul.calculate());
			break;
		}
		case "/" :{	
			Div div = new Div();		
			div.setA(a);
			div.setB(b);
			System.out.println(div.calculate());
			break;
		}
		}
	}
		scanner.close();

}
}