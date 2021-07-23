import java.util.*;
public class missing 
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i;
	int arr[]=new int[n];
	int total = (n + 1) * (n + 2) / 2;
	for(i=0;i<n;i++)
	{
	    arr[i]=s.nextInt();
        total -= arr[i];
	}
    System.out.println(total);
	}
}
