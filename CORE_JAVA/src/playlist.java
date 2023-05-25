
import java.util.LinkedList;
import java.util.Scanner;

public class playlist {

	static LinkedList<String> playlist = new LinkedList<String>();

	static void addToPlayList(String name) {
		playlist.add(name);
	}

	static void displayPlayList() {
		System.out.println("Songs in Playlist: ");
		System.out.println(playlist);
		System.out.println();
	}

	static void playSong(int index) {
		System.out.println("Now Playing....");
		System.out.println(playlist.get(index));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int default_index = 0;
		do {
			System.out.println("1. Add to PlayList");
			System.out.println("2. Display PlayList");
			System.out.println("3. Play Song");
			System.out.println("4. Previous Song");
			System.out.println("5. Next Song");
			System.out.println("6. First Song");
			System.out.println("7. Last Song");
			System.out.println("8. Exit");
			System.out.println("Enter your choice [1-7]:");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:

				System.out.println("Enter the song name to be added to the playlist:");
				scan.nextLine();
				String song = scan.nextLine();
				addToPlayList(song);
				break;
			case 2:
				displayPlayList();
				break;
			case 3:
				if(default_index >= 0 && playlist.size() !=0) {
					playSong(default_index);
				}
				else {
					System.out.println("Cannot play the song as the list is empty");
				}
				break;
			case 4:
				default_index --;
				if(default_index >= 0 && playlist.size() !=0) {
					playSong(default_index);
				}
				else {
					System.out.println("Cannot play the song as there are no previous songs");
					if(playlist.size() ==0) {

					}
					else {
						System.out.println("Playing the first song in the list......");
						default_index = 0;
						playSong(default_index);
					}
				}
				break;
			case 5:
				default_index ++;
				if(default_index < playlist.size() && playlist.size() !=0) {
					playSong(default_index);
				}
				else {
					System.out.println("Cannot play the song as there are no next songs");
					if(playlist.size() ==0) {
						System.out.println("Playlist is empty. Add the songs using the menu options given");
					}
					else {
						System.out.println("Playing the last song in the list......");
						default_index = playlist.size()-1;
						playSong(default_index);
					}
				}
				break;
			case 6:
				if(playlist.size() !=0) {
					System.out.println("Playing the first song in the list: ");
					System.out.println(playlist.getFirst());
				}
				else {
					System.out.println("Playlist is empty. Add the songs using the menu options given");
				}
				break;
			case 7:
				if(playlist.size() !=0) {
					System.out.println("Playing the last song in the list: ");
					System.out.println(playlist.getLast());
				}
				else {
					System.out.println("Playlist is empty. Add the songs using the menu options given");
				}
				break;
			case 8:
				System.out.println("Thanks for listening....");
				return;
			default:
				System.out.println("Invalid choice");
			}
		}while(true);
	}
}



