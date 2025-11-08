import java.util.Scanner;
public class binary_conversion{
{
	public static void int_to_bits(int integer)
	{
		int i=0;
		int[] binary=new int[32];
		if(integer==0){
			System.out.print("Binary form of the given integer is zero 0\n");
			return;
		}
		while(integer>0){
			binary[i++]=integer%2;
			integer/=2;
		}
		for(int j=i-1;j>=0;j--){
			System.out.print(binary[j]);
		}
	}

	public static void main(String []args)
	{
		System.out.printf("Integer to Binary:\n");
		Scanner input=new Scanner(System.in);
		System.out.print("enter any integer to convert into bits: ");
		int num=input.nextInt();
		int_to_bits(num);
		input.close();
	}
}
