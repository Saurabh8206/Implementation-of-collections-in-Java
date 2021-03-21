package LinkedHasshmap;

public class LInkedHassmap 
{

	node []a=new node[5];
	node head;
	void print()
	{
		node p=head;
		while (p!=null)
		{
			System.out.println(p.key+" "+p.value);
			p=p.linkedListnext;
		}
	}
	String get(int key)
	{
		int index=key%a.length;
		node p =a[index];
		while (p!=null) 
		{
			if (p.key==key)
			{
				return p.value;
			}
			p=p.hashTableNext;
		}
		return null;
	}
	
	
	void add(int key ,String value)
	{
		node n=new node(key, value);
		
		//adding in hashtable
		int index=key%a.length;
		if (a[index]==null) 
		{
			a[index]=n;
		}
		else
		{
			node p=a[index];
			while (p.hashTableNext!=null) 
			{
				p=p.hashTableNext;
			}
			p.hashTableNext=n;
		}
		
		if (head==null)
		{
			head=n;
		}
		else
		{
			node p=head;
			while (p.linkedListnext!=null) 
			{
				p=p.linkedListnext;
			}
			p.linkedListnext=n;
		}
		
	}
}
