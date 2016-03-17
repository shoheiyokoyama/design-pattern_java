import com.shohei_yokoyama.prototype_framework.*;

public class UnderLinepen implements PrototypeProduct {
	private char ulChar;

	public UnderLinepen(char ulChar) {
		this.ulChar = ulChar;
	}

	@Override
	public void use(String string) {
		int length = string.getBytes().length;
		System.out.println(string);
		System.out.print("");
		for (int i = 0; i < length; i++) {
			System.out.print(ulChar);
		}
		System.out.println("");
		
	}

	@Override
	public PrototypeProduct createClone() {
		PrototypeProduct p = null;
		try {
			p = (PrototypeProduct)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
