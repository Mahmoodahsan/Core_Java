class Alpha {
	public String toString() {
		return "Alpha";
	}
}

class Beta extends Alpha {
	public String toString() {
		System.out.println(super.toString());// Alpha
		return "Beta";
	}
}

class Gamma extends Beta {
	public String toString() {
		System.out.println(super.toString());// Beta
		return "Gamma";
	}
}

public class AcsessSuperClasNnStaticMethod {

	public static void main(String[] args) {

		Gamma g = new Gamma();
		System.out.println(g);// Gamma
	}

}
