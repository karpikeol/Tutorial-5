

 public  class Main {
  public static void main(String[] args) {
      MusicLibrary myLibrary = new MusicLibrary("Vpison collection",
              "Kate Fish");


      myLibrary.addTrack("Michail Krug - Fraer");
      myLibrary.addTrack("Krovostock - Amphibia");
      myLibrary.addTrack("Valentin Strykalo - Nashe leto");
      myLibrary.addTrack("AC/DC - Back in Black");
      myLibrary.addTrack("Morgenshtern - Pososi");


      myLibrary.displayTracks();


      myLibrary.createPlaylist("Ahuevshije tracki");
      myLibrary.createPlaylist("Buchalovka");


      myLibrary.addTrackToPlaylist("Queen - Bohemian Rhapsody",
              "Ahuevshije tracki");
      myLibrary.addTrackToPlaylist("Pink Floyd - Comfortably Numb",
              "Ahuevshije tracki");
      myLibrary.addTrackToPlaylist("AC/DC - Back in Black", "Buchalovka");
      myLibrary.addTrackToPlaylist("Metallica - Nothing Else Matters",
              "Buchalovka");

      System.out.println(" ");
      myLibrary.displayAllPlaylists();

      System.out.println(" ");
      myLibrary.displayPlaylist("Buchalovka");

      System.out.println(" ");
      myLibrary.searchTrack("Queen");

      System.out.println(" ");
      myLibrary.findPlaylist("Buchalovka");

      System.out.println(" ");
      myLibrary.removeTrack("AC/DC - Back in Black");

      System.out.println(" ");
      myLibrary.displayPlaylist("Buchalovka");

      System.out.println(" ");
      System.out.println("Total number of tracks in the library: " +
              myLibrary.getTrackCount());
      System.out.println("Total number of playlists: " +
              myLibrary.getPlaylistCount());


  }
}