package formationOCA.chapter1;

public class Test {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne("mahdi");
		Personne p3 = new Personne("mahdi",30,17.5);
		
		System.out.println(p1.nom);
		System.out.println(p1.age);
		System.out.println(p1.moyenne);
	}

}
