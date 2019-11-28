package tdd;

public class RG {
	
	public boolean isValidaRG(String rg) {
		if((rg == null) || (rg.isEmpty()) || (rg.charAt(8) != '-')) {
			return false;
		}
		return true;
	}

}
