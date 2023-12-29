import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Album album1 = new Album("Save the world", "Michael Jackson");

        album1.addSong("Thriller",4.3);
        album1.addSong("Smooth Criminal",2.3);
        album1.addSong("Beat it",5.3);
        album1.addSong("They don't care about us",6.0);
        album1.addSong("You are not Alone",5.3);


        System.out.println("##########################");


        album1.printPlyList();

        List<Song> ownList = new ArrayList<>();
        Song s1 = new Song("a",1);
        Song s2 = new Song("b",2);

        ownList.add(s1);
        ownList.add(s2);

        album1.addSongs(ownList);


        System.out.println("##########################");


        album1.printPlyList();



    }
}