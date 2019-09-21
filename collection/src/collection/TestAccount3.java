package collection;

import java.util.*;


public class TestAccount3 {
	Set<Account> st=new HashSet<Account>();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		TestAccount3 t=new TestAccount3();
		Set<Account> st=new HashSet<Account>();
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1.add account");
		System.out.println("2.display all accounts");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				st=t.insertdata();
				break;
			case 2:
				t.display(st);
				break;
		}
		System.out.println("do you want to continue..press 1");
		ch=sc.nextInt();
		}while(ch==1);
	}
	public Set<Account> insertdata()
	{
		
		System.out.println("enter id name and balance");
		st.add(new Account(sc.nextInt(),sc.next(),sc.nextInt()));
		return st;
		
	}
	
	public static void display(Set<Account> st)
	{
		
		for(Account a:st)
		{
			System.out.println(a.getAccno()+"\t"+a.getAccname()+"\t"+a.getAccbal());
		}
	}
	
}
