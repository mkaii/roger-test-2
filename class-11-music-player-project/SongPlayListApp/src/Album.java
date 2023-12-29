import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private List<Song> playList;


    public Album() {
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        playList = new ArrayList<>();
    }

    /*public Song findSong(String title)
    {
        for(int i = 0;i < songs.size(); i++)
        {
            Song currentSong = songs.get(i);
            if(currentSong.getTitle().equals(title))
            {
                return currentSong;
            }

        }
        return null;
    }*/

    public Song findSong(String title)
    {
        for (Song currentSong : playList) {
            if (currentSong.getTitle().equals(title)) {
                return currentSong;
            }

        }
        return null;// song with the given title does not exist
    }


    // adding songs to the songs list
    public boolean addSong(String title, double duration)
    {
        if(findSong(title) == null)
        {
            Song mySong = new Song(title,duration);

            playList.add(mySong);
            System.out.println("Song with the title " + title + " added");
            return true;
        }
        else {
            System.out.println("Song with the title " + title + " already exists in this album" );
            return false;
        }
    }

    // create a new method add multiple songs to the playlist

    public void addSongs(List<Song> songsToBeAdded)
    {
            for(int i=0;i<songsToBeAdded.size();i++)
            {
                Song currentSong = songsToBeAdded.get(i);
                addSong(currentSong.getTitle(),currentSong.getDuration());
            }
    }


    // i want a method which takes a title and a users list and if the album contains a song with the passed title
    // then that song should be added to the passed list and returned as well

    public List<Song> addSongToMyOwnList(String title,List<Song> userSongList)
    {
        Song mySong = findSong(title);
        if(mySong != null)
        {
            userSongList.add(mySong);
        }

        return userSongList;
    }

    public void printPlyList()
    {
        System.out.println(playList);
    }



}
