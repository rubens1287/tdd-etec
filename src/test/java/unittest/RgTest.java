package unittest;

import org.junit.Assert;
import org.junit.Test;
import tdd.RG;

public class RgTest {
	
	RG rg = new RG();
	@Test
	public void testIsValidoRG() {
		Assert.assertFalse("Valida RG Nulo: ",rg.isValidaRG(null));
		Assert.assertFalse("Valida RG Vazio: ",rg.isValidaRG(""));
		Assert.assertFalse("Valida RG sem tra�o: ",rg.isValidaRG("335073138"));
		Assert.assertTrue("Valida RG com um tra�o: ", rg.isValidaRG("33507313-X"));
	}

	@Test
	public void testCadastraRG(){
		Assert.assertTrue("Valida cadastro",rg.cadastro("33507313-X"));
	}
}
