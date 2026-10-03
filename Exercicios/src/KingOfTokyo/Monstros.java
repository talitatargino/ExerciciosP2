package KingOfTokyo;

public class Monstros {
    private String nome;
    private int vida;
    private int sucesso;
    private int energia;
    public Monstros(String nome){
        this.nome = nome;
        this.vida = 10;
        this.sucesso = 0;
        this.energia = 0;
    }
    public void exibeMonstro(){
        System.out.println("Personagem: "+nome +" | Sucesso: "+ getSucesso()+ " | Energia: "+ getEnergia()+" | Vida (s): "+ getVida() );
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return vida;
    }
    public int getSucesso(){
        return sucesso;
    }
    public int getEnergia(){
        return energia;
    }
    public void setSucesso(int sucesso){
        this.sucesso = sucesso;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }
}
