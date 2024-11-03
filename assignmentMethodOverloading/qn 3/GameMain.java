package assignmentMethodOverloading;

public class GameMain // qn 3
{
	public static void main(String[] args) {
        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);

        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);

        GameMaster gameMaster = new GameMaster();
        
        System.out.println(gameMaster.describe(character));

        System.out.println(gameMaster.describe(destination));

        System.out.println(gameMaster.describe(TravelMethod.HORSEBACK));

        System.out.println(gameMaster.describe(character, destination, TravelMethod.HORSEBACK));

        System.out.println(gameMaster.describe(character, destination));
    }
}

/*
OUTPUT

You're a level 4 Wizard with 28 hit points.
You've arrived at Muros, which has 732 inhabitants.
You're traveling to your destination on horseback.
You're a level 4 Wizard with 28 hit points. You're traveling to your destination on horseback. You've arrived at Muros, which has 732 inhabitants.
You're a level 4 Wizard with 28 hit points. You're traveling to your destination by walking. You've arrived at Muros, which has 732 inhabitants.

*/