import javax.sound.midi.Track;
import java.util.ArrayList;

public class MusicLibrary {
        private ArrayList<String> tracks;
        private ArrayList<Playlist> playlists;
        private String name;
        private String creator;

        public MusicLibrary(String name, String creator) {
            this.name = name;
            this.creator = creator;
            this.tracks = new ArrayList<>();
            this.playlists = new ArrayList<>();

        }

        public void addTrack(String track) {
            if(!tracks.contains(track))
                tracks.add(track);
        }

        public void removeTrack(String track) {
            tracks.remove(track);
            for(Playlist playlist : playlists){
                playlist.removeTrack(track);
            }
        }

        public void displayTracks() {
            System.out.println("Tracks :");
            for(String track : tracks){
                System.out.println(track);
            }
        }


        public void createPlaylist(String playlistName) {
            playlists.add(new Playlist(playlistName));
        }

        public void findPlaylist(String playlistName) {

            for(Playlist playlist : playlists){
                if(playlist.getName().equals(playlistName)){
                    System.out.println(playlistName);
                }else {
                        System.out.println("No such playlist");
                }

            }


        }

        public void addTrackToPlaylist(String track, String playlistName) {
            for(Playlist playlist : playlists){
                if(playlist.getName().equals(playlistName)){
                    playlist.addTrack(track);
                    return;
                }
            }
            System.out.println("No such playlist");
        }

        public void displayAllPlaylists() {
            System.out.println("Playlists :");
            for(Playlist playlist : playlists){
                System.out.println(playlist.getName());
            }
        }

        public void displayPlaylist(String playlistName) {
            for(Playlist playlist : playlists){
                if(playlist.getName().equals(playlistName)){
                   playlist.displayTracks();
                }
            }
        }


        public void searchTrack(String word) {
            System.out.println("Searching for " + word + " shows: ");
            boolean h = false;
            for(String track : tracks){
                    if(track.toLowerCase().contains(word.toLowerCase())) {
                        System.out.println(track);
                        h = true;
                    }
            }
            for(Playlist playlist : playlists){
                for(String track : playlist.getTracks()){
                    if(track.toLowerCase().contains(word.toLowerCase())){
                        System.out.println(track);
                        h = true;
                    }
                }
            }
            if(!h){
                System.out.println("No such track");
            }
        }

        public int getTrackCount() {
            return tracks.size();
        }
        public int getPlaylistCount() {
            return playlists.size();
        }



        public boolean containsTrack(String track) {
            return tracks.contains(track);
        }

        public ArrayList<String> getTracks() {
            return tracks;
        }

        public ArrayList<Playlist> getPlaylists() {
            return playlists;
        }
        public void setTracks(ArrayList<String> tracks) {
            this.tracks = tracks;
        }
        public void setPlaylists(ArrayList<Playlist> playlists) {
            this.playlists = playlists;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getCreator() {
            return creator;
        }
        public void setCreator(String creator) {
            this.creator = creator;
        }




}
