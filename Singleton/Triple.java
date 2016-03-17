
public class Triple {
	
	private static Triple[] triple = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2),
	};
	
	public int id;
	public Triple(int id) {
		System.out.println("Cretae Instance. id = " + id);
		this.id = id;
	}
	
	public static Triple getInstance(int id) {
		return triple[id];
	}
	public String toString() {
		return "[Triple id =" + id + "]";
	}
}
