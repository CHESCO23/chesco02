package M2.src.PdA;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ATV1 {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
        double valorProduto = 13.5;
        System.out.println(valorProduto);
        System.out.println(formatador.format(valorProduto));

        String entrada = "R$ 50,34";

        try {
            double numero = formatador.parse(entrada).doubleValue();
            System.out.println("numero: " + numero);
        }catch (ParseException e){
            System.out.println("entrada invalida");

        }
        BigDecimal bg = new BigDecimal("5131231231000");
        bg = bg.divide(BigDecimal.TEN);
        System.out.println(bg);
    }
}
