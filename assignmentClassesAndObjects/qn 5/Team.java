package assignmentClassesAndObjects;

import java.util.*;

public class Team // qn 5
{

    private String name;
    private String city;
    private String division;
    private List<Player> players;

    public Team(String name, String city, String division) 
    {
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = new ArrayList<>();
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getDivision() 
    {
        return division;
    }

    public void setDivision(String division) 
    {
        this.division = division;
    }

    public List<Player> getPlayers() 
    {
        return players;
    }

    public void playGame() 
    {
        System.out.println(name + " from " + city + " is playing a game.");
    }

    public void hireCoach(String coachName) 
    {
        System.out.println("Coach " + coachName + " has been hired for team " + name + ".");
    }

    public void addPlayer(Player player) 
    {
        players.add(player);
    }
}

