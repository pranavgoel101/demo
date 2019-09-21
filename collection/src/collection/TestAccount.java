package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestAccount {
	List<Account> lst=new LinkedList<Account>();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		TestAccount t=new TestAccount();
		List<Account> lst=new LinkedList<Account>();
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1.add account");
		System.out.println("2.display all accounts");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				lst=t.insertdata();
				break;
			case 2:
				t.display(lst);
				break;
		}
		System.out.println("do you want to continue..press 1");
		ch=sc.nextInt();
		}while(ch==1);
	}
	public List<Account> insertdata()
	{
		//List<Account> lst=new LinkedList<Account>();
		System.out.println("enter id name and balance");
		lst.add(new Account(sc.nextInt(),sc.next(),sc.nextInt()));
		return lst;
		
	}
	
	public static void display(List<Account> lst)
	{
		/*for(int i=0;i<lst.size();i++)
		{
			System.out.println(a.getAccno()+"\t"+a.getAccname()+"\t"+a.getAccbal());

		}*/
		for(Account a:lst)
		{
			System.out.println(a.getAccno()+"\t"+a.getAccname()+"\t"+a.getAccbal());
		}
	}
	
}
