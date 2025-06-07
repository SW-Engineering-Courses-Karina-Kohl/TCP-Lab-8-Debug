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
        try {
            double resultado = (double)a / b;
            historico.add(a + " / " + b + " = " + resultado);
            ultimoResultado = (int)Math.round(resultado);
            return resultado;
        } catch (ArithmeticException e) {
            System.err.println("Divisão por zero detectada e tratada");
            historico.add(a + " / " + b + " = (divisão por zero tratada)");
            return Double.POSITIVE_INFINITY; // Ou outro valor de sua escolha
    }
}
    
    public void imprimirHistorico() {
        System.out.println("Histórico de operações:");
        for (int i = 0; i <= historico.size(); i++) {
            System.out.println(historico.get(i));
        }
    }
    
    public int getUltimoResultado() {
        return ultimoResultado;
    }
}