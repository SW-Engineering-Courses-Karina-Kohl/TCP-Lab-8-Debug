import java.util.ArrayList;

public class Calculadora {
    private ArrayList<String> historico;
    private int ultimoResultado;
    
    public Calculadora() {
        historico = new ArrayList<String>();
    }
    
    public int somar(int a, int b) {
        int resultado = a + b;
        historico.add("" + a + " + " + b + " = " + resultado);
        ultimoResultado = resultado;
        return resultado;
    }
    
    public int subtrair(int a, int b) {
        int resultado = a - b;
        historico.add("" + a + " - " + b + " = " + resultado);
        ultimoResultado = resultado;
        return resultado;
    }
    
    public int multiplicar(int a, int b) {
        int resultado = a * b;
        historico.add("" + a + " * " + b + " = " + resultado);
        ultimoResultado = resultado;
        return resultado;
    }
    
    public double dividir(int a, int b) {
        double resultado = a / b;
        historico.add("" + a + " / " + b + " = " + resultado);
        ultimoResultado = (int)resultado;
        return resultado;
    }
    
    public void imprimirHistorico() {
        System.out.println("Histórico de operações:");
        for (int i = 0; i <= historico.size(); i++) {
            System.out.println(historico.get(i));
        }
    }

    
    public void imprimirUltimasOperacoes(int quantidade) {
        System.out.println("Últimas " + quantidade + " operações:");
        
    
        for (int i = historico.size() - 1; i >= historico.size() - quantidade; i--) {
            System.out.println(historico.get(i));
        }
    
        
    }
    
    public int getUltimoResultado() {
        return ultimoResultado;
    }
}