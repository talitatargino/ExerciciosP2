package PetShopGirls;
import java.util.Arrays;
public class Organizafila {
    private String[] doguinhos;
    private int [] valores;
    private int indiceatual;
    private int indiceretirada;
    public Organizafila() {
        this.doguinhos = new String [20];
        this.valores = new int[20];
        this.indiceatual = 0;
        this.indiceretirada = 0;
    }
    public void adicionaDoguinho(String nome, String porte) {
        if (indiceatual == 20){
            return;
        }
        doguinhos[indiceatual] = nome;
        if (porte.equals("pequeno")){
            valores[indiceatual] = 30;
        }
        else if (porte.equals("médio")){
            valores[indiceatual] = 40;
        }
        else{
            valores[indiceatual] = 50;
        }
        indiceatual++;
    }
    public int contabanhos(){
        return indiceatual;
    }
    public int ContaFaturamento(){
        return Arrays.stream(valores).sum();
    }
    public void retiraDoguinho(){
        if (indiceretirada == 20 || doguinhos[indiceretirada]==null){
            System.out.println("Sem doguinhos em fila no petshop.");
        }
        else{
        System.out.println(doguinhos[indiceretirada]+ " já está pronto(a)!! O valor do banho foi RS" + valores[indiceretirada]);
        indiceretirada++;}
    }
}
