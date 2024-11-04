package assignmentInheritance;

public class WizardsAndWarriors 
{

	public static void main(String[] args) 
	{
		
		Warrior warrior = new Warrior();
		Wizard wizard = new Wizard();
		
		System.out.println(warrior.toString());
		System.out.println("Vulnerable (warrior): "+warrior.isVulnerable());
		System.out.println("Damage point on vulnerable opponent (warrior): "+warrior.getDamagePoints(wizard));
		System.out.println();
		System.out.println(wizard.toString());
		System.out.println("Vulnerable (wizard): "+wizard.isVulnerable()); 
		System.out.println("Damage point on vulnerable opponent (wizard): "+wizard.getDamagePoints(warrior)); 
		wizard.prepareSpell();
		System.out.println("Spell prepared...\n");
		System.out.println("Vulnerable (wizard): "+wizard.isVulnerable()); 
		System.out.println("Damage point on non vulnerable opponent (warrior): "+warrior.getDamagePoints(wizard));
		System.out.println("Damage point on non vulnerable opponent (wizard): "+wizard.getDamagePoints(warrior));

	}

}

class Fighter{
	
	public boolean isVulnerable() 
	{
		return false;
	}
	
	public int getDamagePoints(Fighter fighter) 
	{
		return 0;
	}
	
}

class Warrior extends Fighter
{
	
	public boolean isVulnerable() 
	{
		return false;
	}
	
	public int getDamagePoints(Fighter fighter) 
	{
		if(fighter.isVulnerable())
			return 10;
		else
			return 6;
	}

	public String toString() 
	{
		return "Fighter is Warrior";
	}
	
}

class Wizard extends Fighter
{	
	private boolean preparedSpell = false;
	
	public void prepareSpell() 
	{
		preparedSpell = true;
	}
	
	public boolean isVulnerable() 
	{
		return !preparedSpell;
	}
	
	public int getDamagePoints(Fighter fighter) 
	{
		if(preparedSpell)
			return 12;
		else
			return 3;
	}
	
	public String toString() 
	{
		return "Fighter is Wizard";
	}
	
}
