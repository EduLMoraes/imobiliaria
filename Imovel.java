abstract class Imovel{
    private Pessoa proprietario;
    private float area;
    private String tipo;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Imovel(){}
    public Imovel(Pessoa proprietario, float area, String tipo){
        this.proprietario = proprietario;
        this.area = area;
        this.tipo = tipo;
    }
    public Imovel(Pessoa proprietario, float area, String tipo, String cidade){
        this.proprietario = proprietario;
        this.area = area;
        this.tipo = tipo;
        this.cidade = cidade;
    }
    public Imovel(Pessoa proprietario, float area, String tipo, String endereco, String cidade, int numero, String complemento, String bairro, String estado){
        this.proprietario = proprietario;
        this.area = area;
        this.tipo = tipo;
        this.cidade = cidade;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
    }

    public abstract float calcular_iptu(float fator);

    // gets & sets
    public void set_proprietario(Pessoa proprietario){
        this.proprietario = proprietario;
    }
    public void set_tipo(String value){
        this.tipo = value;
    }
    public void set_endereco(String value){
        this.endereco = value;
    }
    public void set_complemento(String value){
        this.complemento = value;
    }
    public void set_bairro(String value){
        this.bairro = value;
    }
    public void set_cidade(String value){
        this.cidade = value;
    }
    public void set_estado(String value){
        this.estado = value;
    }
    public void set_numero(int value){
        this.numero = value;
    }
    public void set_area(float value){
        this.area = value;
    }

    public Pessoa get_proprietario(){
        return this.proprietario;
    }
    public String get_tipo(){
        return this.tipo;
    }
    public String get_endereco(){
        return this.endereco;
    }
    public String get_complemento(){
        return this.complemento;
    }
    public String get_bairro(){
        return this.bairro;
    }
    public String get_cidade(){
        return this.cidade;
    }
    public String get_estado(){
        return this.estado;
    }
    public int get_numero(){
        return this.numero;
    }
    public float get_area(){
        return this.area;
    }

}