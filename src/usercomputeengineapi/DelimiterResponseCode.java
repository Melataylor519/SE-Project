package usercomputeengineapi;

public enum DelimiterResponseCode {

	DEFAULT(true),
	DEFINED(false);
	
	private boolean delimiterChoice;
	
	private DelimiterResponseCode(boolean delimiterChoice) {
		this.delimiterChoice = delimiterChoice;
	}
	
	public boolean delimiterChoice() {
		return delimiterChoice;
	}
}
