class ImovelVenda extends Imovel{
    private float valor_venda;
    private float valor_desconto;
    private float prazo_financiamento;

    public ImovelVenda(){}
    public ImovelVenda(Pessoa proprietario, float area, String tipo, float valor_venda, float valor_desconto, float prazo_financiamento){
        super(proprietario, area, tipo);
        this.valor_venda = valor_venda;
        this.valor_desconto = valor_desconto;
        this.prazo_financiamento = prazo_financiamento;
    }
    public ImovelVenda(Pessoa proprietario, float area, String tipo, String cidade, float valor_venda, float valor_desconto, float prazo_financiamento){
        super(proprietario, area, tipo, cidade);
        this.valor_venda = valor_venda;
        this.valor_desconto = valor_desconto;
        this.prazo_financiamento = prazo_financiamento;
    }
    public ImovelVenda(
        Pessoa proprietario, 
        float area, 
        String tipo, 
        String endereco, 
        String cidade, 
        int numero, 
        String complemento, 
        String bairro, 
        String estado, 
        float valor_venda, 
        float valor_desconto, 
        float prazo_financiamento
    ){
        super(proprietario, area, tipo, endereco, cidade, numero, complemento, bairro, estado);
        this.valor_venda = valor_venda;
        this.valor_desconto = valor_desconto;
        this.prazo_financiamento = prazo_financiamento;
    }

    public float calcular_iptu(float fator){
        return (fator * this.get_area()) + (valor_venda * 0.05f);
    }

    public float calcular_venda(){
        return this.valor_venda - this.valor_desconto;
    }
    public float calcular_itbi(float taxa){
        return this.valor_venda / taxa;
    }

    // gets & sets
    public void set_valor_venda(float value){
        this.valor_venda = value;
    };
    public void set_valor_desconto(float value){
        this.valor_desconto = value;
    };
    public void set_prazo_financiamento(float value){
        this.prazo_financiamento = value;
    };

    public float get_valor_venda(){
        return this.valor_venda;
    };
    public float get_valor_desconto(){
        return this.valor_desconto;
    };
    public float get_prazo_financiamento(){
        return this.prazo_financiamento;
    };
}