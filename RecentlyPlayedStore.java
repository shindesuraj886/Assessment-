import java.util.*;
	

	public class RecentlyPlayedStore {
	  
		private int capacity;
	    private Map<String, Deque<String>> recentlyPlayed;
	    
	    public RecentlyPlayedStore(int capacity) {
	        this.capacity = capacity;
	        this.recentlyPlayed = new HashMap<>();
	    }
	    
	    public void addSong(String userId, String songId) {
	        Deque<String> songs = recentlyPlayed.getOrDefault(userId, new LinkedList<>());
	        if (songs.contains(songId)) {
	            songs.remove(songId);
	        }
	        songs.addLast(songId);
	        recentlyPlayed.put(userId, songs);
	        if (songs.size() > capacity) {
	            songs.removeFirst();
	        }
	    }
	    
	    public List<String> getRecentlyPlayedSongs(String userId) {
	        Deque<String> songs = recentlyPlayed.getOrDefault(userId, new LinkedList<>());
	        return new ArrayList<>(songs);
	    
	        
	     
	    }
	}
	
