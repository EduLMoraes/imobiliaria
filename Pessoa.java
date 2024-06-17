class Pessoa{
    private String nome;
    private String email;
    private long celular;

    public Pessoa(){}
    public Pessoa(String nome, String email, long celular){
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }

    // gets & sets
    public void set_nome(String value){
        this.nome = value;
    };
    public void set_email(String value){
        this.email = value;
    };
    public void set_celular(long value){
        this.celular = value;
    };

    public String get_nome(){
        return this.nome;
    };
    public String get_email(){
        return this.email;
    };
    public long get_celular(){
        return this.celular;
    };
}