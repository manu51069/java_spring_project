package classRoomModules;

public class TwoD_array {

	public static void main(String[] args) {
		int[][]array= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int pdiagsum=0 , sdiagsum =0;
		
		System.out.println("Printing Primary Diogonal details");
		System.out.println("Primary Dioganal values: ");
		
		for(int i=0;i<array.length;i++) {
			pdiagsum=sdiagsum+array[i][i];
				System.out.println(array[i][i]+" ");
			}
			System.out.println("\n Primary Dioganal Sum:"+ pdiagsum);
			System.out.println();
			System.out.println("Printing Primary Dioganal details");
			System.out.println("Primary Dioganal values: ");
			for (int i=0;i<array.length;i++) {
				for (int j=0;j<array[i].length;j++) {	
				if(i+j==array.length-1) {
					System.out.println(array[i][j]+ " ");  
					sdiagsum = sdiagsum+array[i][j];
				}		
			}
		}
	}
}
		
