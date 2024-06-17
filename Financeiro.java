class Financeiro{
    public static float calcular_financiamento(float montante, int meses, float taxa){
        // M = C * [(1 + i)^t – 1] / i
        // calcula juros sobre juros
        float taxa_mensal = (taxa/12) / 100;
        for (int i= 0; i < meses; i++){
            montante *= (1+taxa_mensal);
        }
        
        return montante;
    }
    public static float calcular_acrescimo(float montante, float juros){
        // calcula acrescimo.
        return montante + (montante * (juros/100));
    }
    public static float calcular_desconto(float montante, float percentual){
        // calcula desconto
        return montante - (montante * percentual/100);
    }
}