
package modelo;

public class CarroPasseio extends Veiculo{
    private String cor;
    private String modelo;

    // Construtor padrão
    public CarroPasseio() {
        super();
        this.cor = "";
        this.modelo = "";
    }

    // Construtor com parâmetros
    public CarroPasseio(int peso, int velMax, float preco, String cor, String modelo) {
        super(peso, velMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    // Sets
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Gets
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    // Método para imprimir os dados
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }
}
