package collections.list;
import java.util.*;
public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		List<String> list=new ArrayList <String>();
		list.add("d");
		list.add("m");
		list.add("b");
		list.add("g");
		list.add("gm");
		System.out.println("1.insert \n2.remove \n3.display\n4.exit\nenter option");
		int opt=c.nextInt();
		String name;
		while(opt!=4)
		{
			switch(opt)
			{
			case 1:System.out.println("enter data to insert");
			name=c.next();
			list.add(name);
			break;
			case 2:System.out.println("enter name to remove");
			name=c.next();
			if(list.contains(name))
			{
				list.remove(name);
			}
			else
			{
				System.out.println("not in list");
			}
			case 3:System.out.println("the elements are:");
			for(String n:list)
			{
				System.out.println(n);
			}
			break;
		}
		System.out.println("1.insert \n2.remove \n3.display\n4.exit\nenter option");
		opt=c.nextInt();
			
			
		}
		

	}

}

