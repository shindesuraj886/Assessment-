
public class TC extends RecentlyPlayedStore{
	
	public TC(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {

	RecentlyPlayedStore store = new RecentlyPlayedStore(3);

	store.addSong("user1", "S1");
	store.addSong("user1", "S2");
	store.addSong("user1", "S3");
	System.out.println(store.getRecentlyPlayedSongs("user1"));  // Output [S1, S2, S3]

	store.addSong("user1", "S4");
	System.out.println(store.getRecentlyPlayedSongs("user1"));  // Outpt: [S2, S3, S4]

	store.addSong("user1", "S2");
	System.out.println(store.getRecentlyPlayedSongs("user1"));  // Output: [S3, S4, S2]

	store.addSong("user1", "S1");
	System.out.println(store.getRecentlyPlayedSongs("user1"));  // Output: [S4, S2, S1]

}
}