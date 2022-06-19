import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SBO_MEN_U12_telefonoCourierArgentina {

	@Test
	void validarCodigoAreaCourier() {
		String codArea = Courier.telefono.substring(0,5);
		
		assertEquals(codArea, "+54 9");
	}

}
