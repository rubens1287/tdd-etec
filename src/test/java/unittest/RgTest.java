package unittest;

import org.junit.Assert;
import org.junit.Test;

import tdd.RG;

public class RgTest {
	
	RG rg = new RG();
	
	@Test
	public void testIsValidoRG() {
		Assert.assertTrue("Valida RG Nulo: ",rg.isValidaRG("33507313-8"));
		Assert.assertTrue("Valida RG Vazio: ",rg.isValidaRG("33507313-8"));
		Assert.assertTrue("Valida RG Tem um traço: ", rg.isValidaRG("33507313-X"));
	}

}
