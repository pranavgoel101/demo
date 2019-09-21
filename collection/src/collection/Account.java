package collection;

public class Account implements Comparable<Account> {
	private int accno;
	private String accname;
	private int accbal;
	
	public Account(int accno, String accname, int accbal) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.accbal = accbal;
	}
	public int getAccno() {
		return accno;
	}
	public String getAccname() {
		return accname;
	}
	public int getAccbal() {
		return accbal;
	}
	@Override
	public int compareTo(Account o) {
		if(this.getAccno()>o.getAccno())
		return 1;
		else if(this.getAccno()<o.getAccno())
		return -1;
		else
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accbal;
		result = prime * result + ((accname == null) ? 0 : accname.hashCode());
		result = prime * result + accno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accbal != other.accbal)
			return false;
		if (accname == null) {
			if (other.accname != null)
				return false;
		} else if (!accname.equals(other.accname))
			return false;
		if (accno != other.accno)
			return false;
		return true;
	}
	
	

}
