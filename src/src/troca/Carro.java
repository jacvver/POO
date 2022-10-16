package troca;

public class Carro {
    String tipo;
    String cor;
    String placa;
    Pessoa dono;
    int numPortas;
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }
    
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public int getNumPortas() {
        return numPortas;
    }
    
    public void setDono(Pessoa dono) {
    	this.dono = dono;
    }
    public Pessoa getDono() {
    	return dono;
    }
}