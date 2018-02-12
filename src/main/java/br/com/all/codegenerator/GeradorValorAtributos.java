package br.com.all.codegenerator;

import java.util.Random;

public class GeradorValorAtributos {

	public static String ObterValor(String tipo) {
		Random random = new Random();
		String valor = new String();
		if (tipo.equals("String")) {
			valor = "\"ABCDEFGHIJK\"";
		} else {
			if (tipo.equals("char")) {
				valor = "'X'";
			} else {
				if (tipo.equals("int")) {
					valor = String.valueOf(random.nextInt());
				} else {
					if (tipo.equals("long")) {
						valor = String.valueOf(random.nextLong()) + "L";
					} else {
						if (tipo.equals("double")) {
							valor = String.valueOf(random.nextDouble()) + "D";
						} else {
							if (tipo.equals("float")) {
								valor = String.valueOf(random.nextFloat()) + "F";
							} else {
								if (tipo.equals("boolean")) {
									valor = String.valueOf(random.nextBoolean());
								} else {
									if (tipo.contains("Integer")) {
										valor = tipo + ".valueOf(" + String.valueOf(random.nextInt()) + ")";
									} else {
										if (tipo.equals("Long")) {
											valor = tipo + ".valueOf(" + String.valueOf(random.nextLong()) + "L" + ")";
										} else {
											if (tipo.equals("Double")) {
												valor = tipo + ".valueOf(" + String.valueOf(random.nextDouble()) + "D" + ")";
											} else {
												if (tipo.equals("Float") || tipo.equals("BigDecimal")) {
													valor = tipo + ".valueOf(" + String.valueOf(random.nextFloat()) + "F" + ")";
												} else {
													if (tipo.equals("Boolean")) {
														valor = tipo + ".valueOf(" + String.valueOf(random.nextBoolean()) + ")";
													} else {
														if (tipo.equals("Character")) {
															valor = tipo + ".valueOf(" + "'X'" + ")";
														} else {
															valor = "\" \"";	
															}
														}
													}
												}
											}
											
										}
									}
								}
							}
						}
					}
				}
		}
		return valor;
	}

	
}
