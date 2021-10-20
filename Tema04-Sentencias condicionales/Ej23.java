/*

Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), 

el tipo de IVA aplicado (general,reducido o superreducido) 
Los tipos de IVA general,reducido y superreducido son del 21%, 10% y 4% respectivamente. 

Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%.

El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.

*/

public class Ej23 {
    public static void main(String[] args){
        Double base ;
        String iva;
        String promo;
        double ivaNum = 0.21;
        double promoNum = 0.0;
        
        System.out.println("Introduce La base del producto");
            base = Double.parseDouble(System.console().readLine());
        System.out.println("Introduce el tipo de iva (general/reducido/superreducido) [por defecto general]");
            iva = System.console().readLine();
        System.out.println("Introduce el codigo promocional (nopro, mitad, meno5 o 5porc) [por defecto nopro]");
            promo = System.console().readLine();
            

        switch (iva) {
            case "general":
            ivaNum = 0.21;
            break;
            case "reducido":
                ivaNum = 0.1;                
                break;
            case "superreducido":
                ivaNum = 0.04;
            break;
            default:
                System.out.println("El tipo de iva introducido es incorrecto");
                break;
        }

        base = base-(base*ivaNum);
        System.out.println("El precio con iva es"+base);

        switch (promo) {
            case "nopro":
                break;
            case "mitad":
                promoNum = 0.5;
                base = base*promoNum;
            break;
            case "meno5":
                promoNum = 5;
                base = base-5;
            break;
            case "5porc":
                promoNum = 0.05;
                base= base - (base*promoNum);
            default:
            System.out.println("El descuento es incorrecto");
                break;
        }

        System.out.println("El precio con el descuento es "+base);
        
        }
    }
