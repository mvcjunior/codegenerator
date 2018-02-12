package br.com.all.codegenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ClasseTesteTest {

	@Test
	public void validaClasseTeste() {
		ClasseTeste vClasseTeste = new ClasseTeste();

		vClasseTeste.setVariavel1(1194778059);
		vClasseTeste.setVariavel2(798308759903128607L);
		vClasseTeste.setVariavel3(0.7154424021603614D);
		vClasseTeste.setVariavel4(0.7813526F);
		vClasseTeste.setVariavel5('X');
		vClasseTeste.setVariavel6(true);
		vClasseTeste.setVariavel7("ABCDEFGHIJK");
		vClasseTeste.setVariavel8(Integer.valueOf(1327942460));
		vClasseTeste.setVariavel9(Long.valueOf(-8041924048000974535L));
		vClasseTeste.setVariavel10(Double.valueOf(0.28613405637878897D));
		vClasseTeste.setVariavel11(Float.valueOf(0.60402286F));
		vClasseTeste.setVariavel12(Character.valueOf('X'));
		vClasseTeste.setVariavel13(Boolean.valueOf(true));
		vClasseTeste.setVariavel14(BigInteger.valueOf(-1640864302));
		vClasseTeste.setVariavel15(BigDecimal.valueOf(0.5553318F));
		vClasseTeste.setVariavel16(" ");

		assertEquals(1194778059,vClasseTeste.getVariavel1());
		assertEquals(798308759903128607L,vClasseTeste.getVariavel2());
		assertEquals(0.7154424021603614D,vClasseTeste.getVariavel3(), 0.000);
		assertEquals(0.7813526F,vClasseTeste.getVariavel4(), 0.000);
		assertEquals('X',vClasseTeste.getVariavel5());
		assertEquals(true,vClasseTeste.isVariavel6());
		assertEquals("ABCDEFGHIJK",vClasseTeste.getVariavel7());
		assertEquals(Integer.valueOf(1327942460),vClasseTeste.getVariavel8());
		assertEquals(Long.valueOf(-8041924048000974535L),vClasseTeste.getVariavel9());
		assertEquals(Double.valueOf(0.28613405637878897D),vClasseTeste.getVariavel10());
		assertEquals(Float.valueOf(0.60402286F),vClasseTeste.getVariavel11());
		assertEquals(Character.valueOf('X'),vClasseTeste.getVariavel12());
		assertEquals(Boolean.valueOf(true),vClasseTeste.getVariavel13());
		assertEquals(BigInteger.valueOf(-1640864302),vClasseTeste.getVariavel14());
		assertEquals(BigDecimal.valueOf(0.5553318F),vClasseTeste.getVariavel15());
		assertEquals(" ",vClasseTeste.getVariavel16());
	}
}
