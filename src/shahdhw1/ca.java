package shahdhw1;

import java.util.ArrayList;

public class ca {
	ArrayList<pr> r=new ArrayList();

	public int getCount() {
		// TODO Auto-generated method stub
		int sum=0;
			for (int i =0;i<r.size();i++){
			sum+=r.get(i).qun;}
		return sum;	}

	public void add(pr p) {
		// TODO Auto-generated method stub
		r.add(p);
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i =0;i<r.size();i++) {
			
			sum=sum+r.get(i).price;}
		return sum;}
}
