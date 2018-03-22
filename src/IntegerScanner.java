import java.util.Scanner;
public class IntegerScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);


int[]numbers=new int[5];

System.out.println("Enter 5 numbers");
numbers[0]=scan.nextInt();
numbers[1]=scan.nextInt();
numbers[2]=scan.nextInt();
numbers[3]=scan.nextInt();
numbers[4]=scan.nextInt();

System.out.println(numbers[4]);
	}

}
