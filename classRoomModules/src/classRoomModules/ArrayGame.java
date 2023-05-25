package classRoomModules;

public class ArrayGame {
	String manu []= {"violet","Blue","Indigo","Green","Yellow","Orange","Red"};
	String guru []= {"Pink","Peach","Sandal","Black","Greay","Vine",
			"Ash","White","Purple","Violet","Brown","Burgandy",
			"Magenta","Navyblue","Gold","silver","Bronze"};

		int i=0,j=0,k=0;
		String[] common=new String[manu.length + guru.length];
		
		while(i<manu.length && j<guru.length) {

			common[k++]=manu[i++];
			common[k++]=guru[j++];
		}
		while(i<manu.length) {
			common[k++]=manu[i++];
		}
		while(i<manu.length) {
			common[k++]=manu[i++];
		}
		ArrayUtility.displayArray(common);
	}
}


