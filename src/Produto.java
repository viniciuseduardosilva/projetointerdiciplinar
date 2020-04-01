public abstract class Produto {
    private String marca;
    private float valor;
    
    public Produto(String m, float v){
        this.marca = m;
        this.valor = v;
    }
    
    public String getMarca() {
    	return this.marca;
    }
    public void setMarca(String marca) {
    	this.marca = marca;
    }
    public float getValor() {
    	return valor;
    }
    public void setValor(float valor) {
    	this.valor = valor;
    }
}
