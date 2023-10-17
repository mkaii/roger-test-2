public class Airplane {

    public int size;
    private int seats;
    public String color;
    private String name;


    public Airplane()
    {

    }

    public Airplane(int newSize,int newSeats,String newColor,String newName)
    {
        size = newSize;
        seats = newSeats;
        color = newColor;
        name = newName;
    }

    public void updateSeats(int numOfSeats)
    {
        seats = numOfSeats;
    }


    //create a method which give the value of seat
    public int retrieveSeats()
    {
        return seats;
    }

    public String getName()
    {
        return name;
    }

    public int retrieveSize()
    {
        return size;
    }

    public void setName(String newName)
    {
        name = newName;
    }


}
