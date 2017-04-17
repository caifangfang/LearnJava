package AdvancedTwo;

import java.util.Scanner;

public class Fraction {
	int fenzi;
	int fenmu;
	
	Fraction(int a,int b){
		this.fenzi = a;
		this.fenmu = b;
		if(this.fenzi==this.fenmu)
		{
			this.fenzi = 1;
			this.fenmu = 1;
		}
		else if(this.fenzi>this.fenmu && this.fenmu!=1)
		{
			if(this.fenzi%this.fenmu==0)
			{
				this.fenzi = this.fenzi/this.fenmu;
				this.fenmu = 1;
			}
			else
			{
				for(int i=2;i<=this.fenmu/2;i++){
					if(this.fenzi%i==0 && this.fenmu%i==0)
					{
						this.fenzi /=i;
						this.fenmu /=i;
					}
				}
			}
		}
		else if(this.fenmu>this.fenzi && this.fenzi!=1)
		{
			if(this.fenmu%this.fenzi==0)
			{
				this.fenmu = this.fenmu/this.fenzi;
				this.fenzi = 1;
			}
			else
			{
				for(int i=2;i<=this.fenzi/2;i++){
					if(this.fenzi%i==0 && this.fenmu%i==0)
					{
						this.fenzi /=i;
						this.fenmu /=i;
					}
				}
			}
		}
	}
	
	void print(){
		if(this.fenzi==this.fenmu){
			System.out.println("1");
		}
		else
		{
			System.out.println(this.fenzi+"/"+this.fenmu);
		}
	}
	
	double toDouble(){
		double doublerlt = (double)(fenzi*1.0)/fenmu;
		return doublerlt;
	}
	
	Fraction plus(Fraction r){
		int newfenzi = this.fenzi*r.fenmu + r.fenzi*this.fenmu;
		int newfenmu = this.fenmu*r.fenmu;
		Fraction newfenshu = new Fraction(newfenzi,newfenmu);
		return newfenshu;
	}
	
	Fraction multiply(Fraction r){
		int newfenzi = this.fenzi*r.fenzi;
		int newfenmu = this.fenmu*r.fenmu;
		Fraction newfenshu = new Fraction(newfenzi,newfenmu);
		return newfenshu;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}
