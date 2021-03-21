package HashMAp;

public class hAshhmap
{
	node []a=new node[5];
	
	void Print()
	{
		for (int i = 0; i < a.length; i++)
		{
			node p=a[i];
			while (p!=null) {
				System.out.println(p.key+" "+p.value);
				p=p.next;
			}
		}
	}
	
	void add(int key ,String value)
	{
		int index=key%5;
		if (a[index]==null)
		{
			a[index]=new node(key, value);
		}
		else
		{
			node p=a[index];
			while (p.next != null)
			{
				p=p.next;
			}
			p.next= new node(key,value);
		}
	}
}
