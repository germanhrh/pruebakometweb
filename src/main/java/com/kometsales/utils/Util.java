package com.kometsales.utils;

import java.security.SecureRandom;

public class Util {

    public static String generarString(int longitud) {
        // Caracteres que se utilizarán para generar la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Crear una instancia de SecureRandom para generar números aleatorios seguros
        SecureRandom random = new SecureRandom();

        StringBuilder sb = new StringBuilder();

        // Generar caracteres aleatorios y construir la contraseña
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(index);
            sb.append(caracter);
        }

        return sb.toString();
    }
}
