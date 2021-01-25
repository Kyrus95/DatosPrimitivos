package com.ejemplo.Kyosuke;

import java.math.BigDecimal;

public class Main
{
    static boolean bDef;
    public static void main(String[] args)
    {
        System.out.println("Clase 1: Uso de Tipos de Datos");
        byte b = 1;
        short sh = 1;
        int i = 1;
        float f = 1f;
        double d = 1d;
        System.out.println("Byte :" + b);
        System.out.println("Short :" + sh);
        System.out.println("Int :" + i);
        System.out.println("Float :" + 1f);
        System.out.println("Double :" + 1d);

        //Como utilizar helper classes
        byte b1 = 127;
        System.out.println("Byte :"+ b1);
        if (b1<Byte.MAX_VALUE)
        {
            b1++;
        }
        //Como representar decimales y dinero
        double valor = .012;
        double pSum = valor + valor + valor;
        System.out.println("La suma de los valores es " + pSum);
        String strValue = Double.toString(valor);
        System.out.println("strValue es :" + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSuma = bigValue.add(bigValue).add(bigValue);
        System.out.println("La suma de los valores Bigdecimal es: " + bSuma.toString());
        //Convirtiendo valores numericos - Anchando y Acortando (CAST)
        int intValor1 = 56;
        int intValor2 = intValor1;
        System.out.println("El valor del segundo numero es : " + intValor2);
        long longValor1 = intValor1;
        System.out.println("El valor del numero largo es : " + longValor1);
        short shortValor1 = (short) intValor1;
        System.out.println("El valor del numero corto es : " + shortValor1);
        int intValor3 = 1024;
        byte byteValor1 = (byte) intValor3;
        System.out.println("El valor de byteValor1 es : " + byteValor1);
        double doubleValor = 3.999999d;
        int intValor4 = (int) doubleValor;
        System.out.println("Doble a entero : " + intValor4);
        //Utilizando operadores matematicos y la clase math
        int intValor5 = 56;
        int intValor6 = 42;

        int result1 = intValor5 + intValor6;
        System.out.println("Suma : " + result1);

        int result2 = intValor5 - intValor6;
        System.out.println("Resta : " + result2);

        int result3 = intValor5 * intValor6;
        System.out.println("Multiplicacion : " + result3);

        int result4 = intValor5 / intValor6;
        System.out.println("Division : " + result4);

        int result5 = intValor5 % intValor6;
        System.out.println("Resto : " + result5);

        //Uso de la clase math
        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("Redondeado : " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absoluto : " + absValue);

        //Tipos de datos booleanos
        boolean b10 = true;
        boolean b20 = false;
        System.out.println("El valor de b10 es : " + b10);
        System.out.println("El valor de b20 es : " + b20);
        System.out.println("El valor de bDef es : " + bDef);

        boolean b30 = !b10;
        System.out.println("El valor de b30 es : " + b30);

        int il = 0;
        boolean b40 = (il != 0);
        System.out.println("El valor de b40 es : " + b40);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("parsed valor es : " + parsed);

        //Caracteres y String
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        System.out.println("Char 1 es : " + c1);
        System.out.println("Char 2 es : " + c2);
        System.out.println("Char 3 es : " + c3);
        char signoDolar = '\u0024';
        System.out.println("Char signoDolar es: " + signoDolar);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));
    }
}
