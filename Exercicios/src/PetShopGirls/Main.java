package PetShopGirls;

public class Main {
    public static void main(String [] args){
        Organizafila sequencia = new Organizafila();
        sequencia.adicionaDoguinho("Nicky", "pequeno");
        sequencia.adicionaDoguinho("Caramelo", "médio");
        sequencia.adicionaDoguinho("Lecy", "grande");
        System.out.print("Total de banhos: ");
        System.out.println(sequencia.contabanhos());
        System.out.print("Faturamento total: RS");
        System.out.println(sequencia.ContaFaturamento());
        sequencia.retiraDoguinho();
        sequencia.retiraDoguinho();
        sequencia.retiraDoguinho();
        sequencia.retiraDoguinho();
    }
}
