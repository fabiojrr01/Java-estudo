
package modelo;



public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private String dataN;
    /*private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;
    private String complemento;*/
		
		
//contrutor

    public Proprietario(){
       
    }
    public Proprietario(String nome,String cpf,String rg,String dataN/*,String rua,String bairro,String cidade,String estado,int cep,String complemento*/){
        this.nome=nome;
        this.cpf=cpf;
        this.rg=rg;
        this.dataN=dataN;
        /*this.rua=rua;
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado=estado;
        this.cep=cep;
        this.complemento=complemento;*/
                
    }
    
    //gatters e setters

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getRg() {
        return rg;
    }

    
    public void setRg(String rg) {
        this.rg = rg;
    }

   
    public String getDataN() {
        return dataN;
    }

    
    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

   /* 
    public String getRua() {
        return rua;
    }

    
    public void setRua(String rua) {
        this.rua = rua;
    }

    
    public String getBairro() {
        return bairro;
    }

    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    public String getCidade() {
        return cidade;
    }

    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
    public String getEstado() {
        return estado;
    }

    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public int getCep() {
        return cep;
    }

    
    public void setCep(int cep) {
        this.cep = cep;
    }

    
    public String getComplemento() {
        return complemento;
    }

    
    public void setComplemento(String complemento) {
        this.complemento = complemento;*/
       
   
    
    public String toString(){
        return   "nome"+this.nome+
                "cpf"+this.cpf+
                "rg"+this.rg+
                "dataN"+this.dataN;}

/*
                "rua"+this.rua+
                "bairro"+this.bairro+
                "cidade"+this.cidade+
                "estado"+this.estado+
                "cep"+this.cep+
                "complemento"+this.complemento;*/
//Metodo
    
    public void mostrarPropietario(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Cpf: "+this.getCpf());
        System.out.println("Rg: "+this.getRg());
        System.out.println("Data de nascimento: "+this.getDataN());
    }
    
    
}


                
    