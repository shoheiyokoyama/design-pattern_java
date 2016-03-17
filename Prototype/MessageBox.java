import com.shohei_yokoyama.prototype_framework.*;

public class MessageBox implements PrototypeProduct {
	private char decoChar;
	public MessageBox(char decoChar) {
		this.decoChar = decoChar;
	}
	
	public void use(String string) {
		int length = string.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decoChar);
		}
		System.out.println("");
		System.out.println(decoChar + " " + string + " " + decoChar);
		
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decoChar);
		}
		System.out.println("");
	}

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
