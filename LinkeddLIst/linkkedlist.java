package LinkeddLIst;

public class linkkedlist 
{
	node head;
	int find(int a)
	{
		int index=-1;
		int n=0;
		node p=head;
		while (p!=null)
		{
			if (p.data==a)
			{
				index=n;
				break;
			}
			p=p.next;
			n++;
		}
		return index;
	}
	
	
	void add(int a)
	{
		if (head==null)
		{
			head=new node(a);
		}
		else
		{
			node p=head;
			while (p.next!=null)
			{
				p=p.next;
			}
			p.next=new node(a);
		}
	}
}
