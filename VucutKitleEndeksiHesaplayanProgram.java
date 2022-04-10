
package vücutkitleendeksihesaplayanprogram;
import java.util.*;

public class VücutKitleEndeksiHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Boy uzunluğunu giriniz(metre cinsinden):");
        double boy = input.nextInt();
        boy = boy/100;
        
        System.out.print("Kilo değerini giriniz:");
        int  kilo = input.nextInt();
        
        double islem = (kilo /(boy*boy)); 
        System.out.print("Vücut kitle endeksi:" + islem );
        
    }
    
}
