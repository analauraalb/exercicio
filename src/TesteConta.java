

public class TesteConta {
	
	public static void main(String[] args) {
		Conta minhaConta;
        minhaConta = new Conta(); 
        
        minhaConta.dono = "Renato";
        minhaConta.saldo = 34.67;
        
        System.out.println("Saldo atual é: " + minhaConta.saldo);
        
        minhaConta.saca(2.8);
        System.out.println(minhaConta.saldo);
        
        minhaConta.deposita(33);
        System.out.println(minhaConta.saldo);
        
        System.out.println(minhaConta.recuperaDadosParaImpressao());
}
}