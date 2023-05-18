package Java100Programs;

public class DuplicatesArray {

	public static void main(String[] args) {
		int a[] = {1,1,2,3,4,5,5,6,7,8,9,9};
		int i,j;
		int count=0;
		
		for(i=0;i<=a.length;i++)
		{
			for(j= i+1;j < a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					count++;
				}
				
			}
		}
		System.out.println("My count is "+count);

		
		StringBuilder sb  = new StringBuilder();
		StringBuilder newStr = null;
		
		String str = "peddiredd787978reddyHari879reddy213";
		
		char ch[] = str.toCharArray();
		
		int len = ch.length;
		
		int num=0;
		while(num<len)
		{
			if(Character.isDigit(ch[num]))
			{
				num++;
			}
			else
			{
				newStr = sb.append(ch[num]);
				num++;
			}
		}
		System.out.println(newStr);
	}

}
