import java.util.ArrayList;

public class Playlist {
        private String name;
        private ArrayList<String> tracks;

        public Playlist(String name) {
            this.name = name;
            this.tracks = new ArrayList<>();
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public ArrayList<String> getTracks() {
            return tracks;
        }
        public void setTracks(ArrayList<String> tracks) {
            this.tracks = tracks;
        }

    public void addTrack(String track) {
        if(!tracks.contains(track))
            tracks.add(track);
    }

    public void removeTrack(String track) {
        tracks.remove(track);
    }

    public void displayTracks() {
        System.out.println("Tracks :");
        for(String track : tracks){
            System.out.println(track);
        }
    }


    public boolean containsTrack(String track) {
        return tracks.contains(track);
    }
}
