
public class PrintBannerForDelegation extends PrintForDelegation {
	private Banner banner;
	
	public PrintBannerForDelegation(String string) {
		this.banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();

	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
