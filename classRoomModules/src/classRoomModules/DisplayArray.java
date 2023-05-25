package classRoomModules;

public class DisplayArray {

	public static void main(String[] args) {
		int[]arr= {101,345,564,864,97};
		System.out.print("[");
		for (int i=0;i<=4;i++) {
			System.out.println(arr[i]);
			if(i==arr.length-1) {
				System.out.print("]");
			}
			else {
				System.out.print(", ");
			}
		}
	}


}


