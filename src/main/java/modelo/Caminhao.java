
package modelo;

public class Caminhao extends Veiculo{
    private int toneladas;       // carga máxima em toneladas
    private int alturaMax;       // altura máxima em metros
    private int comprimento;     // comprimento em metros

    // Construtor padrão
    public Caminhao() {
        super();
        this.toneladas = 0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    // Construtor com parâmetros
    public Caminhao(int peso, int velMax, float preco, int toneladas, int alturaMax, int comprimento) {
        super(peso, velMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    // Sets
    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    // Gets
    public int getToneladas() {
        return toneladas;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    // Método para imprimir os dados
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Carga máxima: " + toneladas + " toneladas");
        System.out.println("Altura máxima: " + alturaMax + " m");
        System.out.println("Comprimento: " + comprimento + " m");
    }
}
