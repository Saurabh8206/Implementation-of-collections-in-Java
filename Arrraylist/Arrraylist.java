package Arrraylist;

public class Arrraylist 
{
		int a[]=new int[10];
		int index=0;
		
		void display()
		{
			for (int i = 0; i <index; i++)
			{
				System.out.println(a[i]+" ");
			}
		}
		
		void add(int p)
		{
			if (index<10)
			{
				a[index++]=p;
			}
			else
			{
				int b[]=new int[(int)(1.5*a.length)];
				
				for (int i = 0; i < a.length; i++) 
				{
					b[i]=a[i];
				}
				a=b;
				a[index]=p;
				index++;
			}
		}
}
