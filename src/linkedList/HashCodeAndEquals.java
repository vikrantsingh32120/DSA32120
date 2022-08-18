package linkedList;
import java.util.*;
public class HashCodeAndEquals {

	public static void main(String[] args) {
		
		pen pen1=new pen(10,"blue");
		pen pen2=new pen(10,"blue");
		
		System.out.println(pen1);
		System.out.println(pen2);
		
		System.out.println(pen1.equals(pen2));
		
		Set<pen> pn=new HashSet<>();
		pn.add(pen1);
		pn.add(pen2);
		System.out.println(pn);
	}
	public static class pen{
		int price;
		String colour;
		public pen(int price,String colour) {
			this.price=price;
			this.colour=colour;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			pen other = (pen) obj;
			if (colour == null) {
				if (other.colour != null)
					return false;
			} else if (!colour.equals(other.colour))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
//		folmula of hashCode function.
//		s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((colour == null) ? 0 : colour.hashCode());
			result = prime * result + price;
			return result;
		}
	}

}
