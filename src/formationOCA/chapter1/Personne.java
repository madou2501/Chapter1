package formationOCA.chapter1;

public class Personne {
	
	// attributs d'instance
	String nom;
	int age;
	double moyenne;
	
	public Personne(String n)
	{
		System.out.println("constructeur avec paramétre nom");
		this.nom = nom;
	}
	
	public Personne()
	{
	
	}
	public Personne(String nom, int age, double moy)
	{
		System.out.println("constructeur avec 3 paramétres");
		this.nom = nom;
		this.age = age;
		this.moyenne  = moy;
	}

}
