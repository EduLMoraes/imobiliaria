import java.util.Scanner;

public class AppImobiliaria{
    public static void main(String args[]){
        Pessoa p = new Pessoa("Jhon", "Jhon@gmail.com", 53981816262l);
        ImovelAluguel i1 = new ImovelAluguel(
            p, 
            50.0f, 
            "Casa", 
            "Rua José Barros",
            "Bagé",
            248,
            "",
            "Castro Alves",
            "RS",
            "",
            5f,
            500f
        );
        ImovelVenda i2 = new ImovelVenda(
            p, 
            50.0f, 
            "Casa", 
            "Rua José Barros",
            "Bagé",
            248,
            "",
            "Castro Alves",
            "RS",
            230000f,
            5f,
            68f
        );

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a taxa de IPTU: ");
        float iptu_tax = (float) scan.nextDouble();

        System.out.println("Informe a taxa de ITBI: ");
        float itbi_tax = (float) scan.nextDouble();

        System.out.println("Informe a taxa de Financiamento: ");
        float fin_tax = (float) scan.nextDouble();

        System.out.println(":Titulo......................:valor:");
        System.out.println(":============================:=====:");
        System.out.println(":IPTU aluguel................:"+ i1.calcular_iptu(iptu_tax) + ":");
        System.out.println(":IPTU venda..................:"+ i2.calcular_iptu(iptu_tax) + ":");
        System.out.println(":Valor de venda..............:"+ i2.calcular_venda() + ":");

        System.out.println(":Valor do financiamento......:"+ Financeiro.calcular_financiamento(i2.get_valor_venda(), (int) i2.get_prazo_financiamento(), fin_tax) + ":");
        System.out.println(":Valor de compra a vista.....:"+ Financeiro.calcular_desconto(i2.get_valor_venda(), i2.get_valor_desconto()) + ":");
        System.out.println(":Valor do ITBI...............:"+ i2.calcular_itbi(itbi_tax) + ":");
        System.out.println(":Valor de aluguel............:"+ i1.get_valor_aluguel() + ":");
        System.out.println(":Valor devido a atraso.......:"+ Financeiro.calcular_acrescimo(i1.get_valor_aluguel(), i1.get_caucao()) + ":");

        scan.close();
    }
}