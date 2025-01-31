public class TesteTipos {
    public static void main(String[] args) {

    	// Classes Wrapper
    	
        // 1. Trabalhando com Strings
        String nome = "Nathan";  
        System.out.println(nome);  
        System.out.println(nome.length());  
        System.out.println(nome.charAt(0));  

        // 2. Conversão de Strings para tipos numéricos (Double)
        String precoStr01 = "45.75";  
        String precoStr02 = "20.25";  

        double precoDouble01 = Double.parseDouble(precoStr01);  
        double precoDouble02 = Double.parseDouble(precoStr02);  
        System.out.println(precoDouble01 + precoDouble02);  

        // 3. Convertendo o resultado da soma para String
        double somaD = precoDouble01 + precoDouble02;  
        String somaStr = String.valueOf(somaD);  
        System.out.println(somaStr);  

        // 4. Manipulando dados usando o método split()
        String registro = "Dennis;1.81;26;São Paulo";  
        String[] vetor = registro.split(";");  

        System.err.println(vetor[0]);  
        System.err.println(vetor[1]);  
        System.err.println(vetor[2]);  
        System.err.println(vetor[3]);  

    }
}