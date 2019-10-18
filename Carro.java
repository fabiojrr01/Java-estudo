

package modelo;

//atributos
public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int chassi;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int nrDePortas;
    private String tetoSolar;
    private int nDeMarchas;
    private String cambioAutomatico;
    private String volumeDeCombustivel;

    //construtor
    
    
    public Carro(){
        
    }
    
    public Carro(String modelo,String cor,int ano,String marca,int chassi,int velocidadeMaxima,int velocidadeAtual,int nrDePortas,String tetoSolar,int nDeMarchas,String cambioAutomatico,String volumeDeCombustivel){
        this.modelo=modelo;
        this.cor=cor;
        this.ano=ano;
        this.marca=marca;
        this.chassi=chassi;
        this.velocidadeMaxima=velocidadeMaxima;
        this.velocidadeAtual=velocidadeAtual;
        this.nrDePortas=nrDePortas;
        this.tetoSolar=tetoSolar;
        this.nDeMarchas=nDeMarchas;
        this.cambioAutomatico=cambioAutomatico;
        this.volumeDeCombustivel=volumeDeCombustivel;
    }
    
    
    //gatters e setters

    
    public String getModelo() {
        return modelo;
    }

    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public String getCor() {
        return cor;
    }

    
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public int getAno() {
        return ano;
    }

    
    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public String getMarca() {
        return marca;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public int getChassi() {
        return chassi;
    }

    
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    
    public int getNrDePortas() {
        return nrDePortas;
    }

    
    public void setNrDePortas(int nrDePortas) {
        this.nrDePortas = nrDePortas;
    }

    
    public String getTetoSolar() {
        return tetoSolar;
    }

    
    public void setTetoSolar(String tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    
    public int getnDeMarchas() {
        return nDeMarchas;
    }

    
    public void setnDeMarchas(int nDeMarchas) {
        this.nDeMarchas = nDeMarchas;
    }

    
    public String getCambioAutomatico() {
        return cambioAutomatico;
    }

    
    public void setCambioAutomatico(String cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    
    public String getVolumeDeCombustivel() {
        return volumeDeCombustivel;
    }

    
    public void setVolumeDeCombustivel(String volumeDeCombustivel) {
        this.volumeDeCombustivel = volumeDeCombustivel;
    }
    
    
    //metodo
    
    public int Acelerar(){
        return this.velocidadeAtual=velocidadeAtual+1;
    }
    public int Freiar(){
        return this.velocidadeAtual=velocidadeAtual-velocidadeAtual;
    }
    public int TrocarMarcha(){
        return this.nDeMarchas=nDeMarchas +1;
        
    }
    public int ReduzirMarcha(){
        return this.nDeMarchas=nDeMarchas-1;
    }
     public int marchaRe(){
         if (velocidadeAtual>0){
             System.out.println("Não será possivel");
         }
         else{
             System.out.println("Carro em Marcha Ré");
            }
         return 0;
     }

}
    
    
    
    
        
        
        
        
        
    
   