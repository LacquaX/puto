package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String operacion = (args[0]);
        Integer primerNumero = Integer.parseInt(args[1]);
        Integer segundoNumero = Integer.parseInt(args[2]);
        resultado(operacion, primerNumero, segundoNumero);
        Arrays.stream(args).forEach(System.out::println);
    }

    private static void resultado(String operacion, Integer primerNumero, Integer segundoNumero) {
        if (operacion.equals("suma")) {
            Integer suma = primerNumero + segundoNumero;
            System.out.println(suma);
        } else if (operacion.equals("resta")) {
            Integer resta = primerNumero - segundoNumero;
            System.out.println(resta);
        }
    }
}
