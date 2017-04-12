package Hello;

import java.util.Scanner;

public class Test {
	public static int search(int k, int[] a){
		int l = 0;
		int r = a.length;
		int ret = 0;
		while(l!=r){
			int m = (l+r)/2;
			if(a[m]==k){
				ret = m;
				break;
			}else if(a[m]>k){
				r = m - 1;
			}else{
				l = m + 1;
			}
		}
		if(a[l]==k)
			ret = l;
		return ret;
	}
	public static void selsort(int[] a){
		for(int i=a.length-1;i>=0;i--){
			for(int j=i-1;j>=0;j--){
				if(a[j]>a[i]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args){
//		int[] a = {1,3,5,7,9,11,12,13,14,16,17,18,21,22};
//		System.out.println(search(18,a));
		int[] a = {-1,2,4,1,3,33,5,6,7,77,6,2};
		selsort(a);
	}
}
