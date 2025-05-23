
package modelo;

public class Veiculo {
    private int peso;         // em quilos
    private int velMax;       // em km/h
    private float preco;      // em reais

    // Construtor padrão
    public Veiculo() {
        this.peso = 0;
        this.velMax = 0;
        this.preco = 0.0f;
    }

    // Construtor com parâmetros
    public Veiculo(int peso, int velMax, float preco) {
        this.peso = peso;
        this.velMax = velMax;
        this.preco = preco;
    }

    // Sets
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Gets
    public int getPeso() {
        return peso;
    }

    public int getVelMax() {
        return velMax;
    }

    public float getPreco() {
        return preco;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.println("----- Dados do Veículo -----");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Velocidade Máxima: " + velMax + " km/h");
        System.out.println("Preço: R$ " + preco);
    }
}
