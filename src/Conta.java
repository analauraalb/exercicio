
public class Conta {
	 int numero;
	    String dono;
	    double saldo;
	    double limite;
	 
	    
	    boolean saca(double valor) {
	        if (this.saldo < valor) {
	            return false;
	 
	        } else {
	            this.saldo = this.saldo - valor;
	            return true;
	        }
	    }
	 
	    
	    void deposita(double valor) {
	        this.saldo += valor; 
	        
	    }
	    
	    String recuperaDadosParaImpressao() {
	    	String numero = String.valueOf(this.numero);
	    	String saldo =  String.valueOf(this.saldo);
	    	String limite = String.valueOf(this.limite);
	    	return numero+"\n"+dono+"\n"+saldo+"\n"+limite;
	    	
	    	
	    }
	}

	
