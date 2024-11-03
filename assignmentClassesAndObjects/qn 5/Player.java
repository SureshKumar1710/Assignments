package assignmentClassesAndObjects;

class Player { // qn 5

    private String name;
    private String position;
    private int jerseyNumber;

    public Player(String name, String position, int jerseyNumber) 
    {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getPosition() 
    {
        return position;
    }

    public void setPosition(String position) 
    {
        this.position = position;
    }

    public int getJerseyNumber() 
    {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) 
    {
        this.jerseyNumber = jerseyNumber;
    }

    public void playGame() 
    {
        System.out.println(name + " with jersey number " + jerseyNumber + " is playing as " + position + ".");
    }

    public void train() 
    {
        System.out.println(name + " is training for their position: " + position + ".");
    }
}

