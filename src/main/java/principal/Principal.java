
package principal;

import modelo.Caminhao;
import modelo.CarroPasseio;
import modelo.Veiculo;

public class Principal {
    
    public static void main(String[] args) {
        
        //Classe Veiculo
        Veiculo veiculo = new Veiculo();

        veiculo.setPeso(1200);
        veiculo.setVelMax(180);
        veiculo.setPreco(35000.0f);

        veiculo.imprimirDados();

        //Classe CarroPasseio
        CarroPasseio carro = new CarroPasseio();

        carro.setPeso(1000);
        carro.setVelMax(200);
        carro.setPreco(50000.0f);
        carro.setCor("Vermelho");
        carro.setModelo("Sedan");

        carro.imprimirDados();

        //Classe Caminhao
        Caminhao caminhao = new Caminhao();

        caminhao.setPeso(8000);
        caminhao.setVelMax(120);
        caminhao.setPreco(250000.0f);
        caminhao.setToneladas(15);
        caminhao.setAlturaMax(4);
        caminhao.setComprimento(12);

        caminhao.imprimirDados();
    }
}
