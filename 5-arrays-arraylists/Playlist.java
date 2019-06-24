import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    // creating playlist
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    
    // adding songs to playlist
    desertIslandPlaylist.add("Sneaker Pimps - Six Undergound");
    desertIslandPlaylist.add("A Tribe Called Quest - Electric Relaxation");
    desertIslandPlaylist.add("Buena Vista Social Club - Murmullo");
    desertIslandPlaylist.add("Little Dragon - Blinking Pigs");
    desertIslandPlaylist.add("MF DOOM - Guinnesses");
    desertIslandPlaylist.add("Radiohead - Idioteque");
    desertIslandPlaylist.add("Erykah Badu - Drama");
    desertIslandPlaylist.add("Gramatik - Good Evening, Mr. Hitchcock");
    desertIslandPlaylist.add("Jean Grae - Threats");
    desertIslandPlaylist.add("The Modern Jazz Quartet - Django");
    
    // printing playlist
    // System.out.println(desertIslandPlaylist);
    
    // checking playlist size
    // System.out.println(desertIslandPlaylist.size());
    
    // removing songs
    desertIslandPlaylist.remove("Gramatik - Good Evening, Mr. Hitchcock");
    desertIslandPlaylist.remove("Erykah Badu - Drama");
    desertIslandPlaylist.remove("The Modern Jazz Quartet - Django");
    desertIslandPlaylist.remove("MF DOOM - Guinnesses");
    desertIslandPlaylist.remove("Jean Grae - Threats");
    
    // System.out.println(desertIslandPlaylist);
    
    // swapping songs
    int indexA = desertIslandPlaylist.indexOf("Buena Vista Social Club - Murmullo");
    int indexB = desertIslandPlaylist.indexOf("A Tribe Called Quest - Electric Relaxation");
    
    String tempA = "Buena Vista Social Club - Murmullo";
    
    desertIslandPlaylist.set(indexA, "A Tribe Called Quest - Electric Relaxation");
    // System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    
  }
  
}