package sorting;

public class BubbleSort {
	
	public int[] performBubbleSort(int[] a){
		int l = a.length;
		for(int i=l;i>0;i--){
			for(int k=0;k<l-1;k++){
				if(a[k] > a[k+1]){
					int temp = a[k];
					a[k] = a[k+1];
					a[k+1] = temp;
				}
			}
		}
	  return a;	
	}

	public static void main(String args[]){
		BubbleSort bs = new BubbleSort();
		int[] arr = {3,5,15,7,1,90,8};
		 arr = bs.performBubbleSort(arr);
		 for(int i:arr){
			 System.out.println(i);
		 }
	}
}
