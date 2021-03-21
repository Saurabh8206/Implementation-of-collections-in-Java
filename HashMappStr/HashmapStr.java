package HashMappStr;

public class HashmapStr 
{
	node a[]=new node[5];
	void add(String key, int value)
	{
		int hash=key.hashCode();
		if (hash<0)
		{
			hash=hash*-1;	
		}
		int index=hash%a.length;
		if (a[index]==null) 
		{
			a[index]=new node(key, value);
		}
		else
		{
			node p=a[index];
			while (p.next!=null) 
			{
				p=p.next;
			}
			p.next=new node(key, value);
		}
	}
	
	int get(String key)
	{
		int index=key.hashCode()%a.length;// array length
		node p=a[index];
		while (p!=null)
		{
			if (p.key.compareToIgnoreCase(key)==0)
			{
				return p.value;
			}
			p=p.next;
		}
		return Integer.MIN_VALUE;
	}
	
}
