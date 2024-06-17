class ImovelAluguel extends Imovel{
    private String modalidade;
    private float caucao;
    private float valor_aluguel;

    public ImovelAluguel(){}
    public ImovelAluguel(Pessoa proprietario, float area, String tipo, String modalidade, float caucao, float valor_aluguel){
        super(proprietario, area, tipo);
        this.modalidade = modalidade;
        this.caucao = caucao;
        this.valor_aluguel = valor_aluguel;
    }
    public ImovelAluguel(Pessoa proprietario, float area, String tipo, String cidade, String modalidade, float caucao, float valor_aluguel){
        super(proprietario, area, tipo, cidade);
        this.modalidade = modalidade;
        this.caucao = caucao;
        this.valor_aluguel = valor_aluguel;
    }
    public ImovelAluguel(
        Pessoa proprietario, 
        float area, 
        String tipo, 
        String endereco, 
        String cidade, 
        int numero, 
        String complemento, 
        String bairro, 
        String estado, 
        String modalidade, 
        float caucao, 
        float valor_aluguel
    ){
        super(proprietario, area, tipo, endereco, cidade, numero, complemento, bairro, estado);
        this.modalidade = modalidade;
        this.caucao = caucao;
        this.valor_aluguel = valor_aluguel;
    }

    public float calcular_iptu(float fator){
        return fator * this.get_area();
    }

    public float calcular_taxas(float iptu, float agua, float condominio){
        return iptu + agua + condominio;
    }

    // gets & sets
    public void set_modalidade(String value){
        this.modalidade = value;
    }
    public void set_caucao(float value){
        this.caucao = value;
    }
    public void set_valor_aluguel(float value){
        this.valor_aluguel = value;
    }

    public String get_modalidade(){
        return this.modalidade;
    }
    public float  get_caucao(){
        return this.caucao;
    }
    public float  get_valor_aluguel(){
        return this.valor_aluguel;
    }
}