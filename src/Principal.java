public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Testando calculadora...");
        
        // Testes de operações
        System.out.println("5 + 3 = " + calc.somar(5, 3));
        System.out.println("10 - 2 = " + calc.subtrair(10, 2));
        System.out.println("4 * 6 = " + calc.multiplicar(4, 6));
        System.out.println("8 / 2 = " + calc.dividir(8, 2));
        System.out.println("5 / 0 = " + calc.dividir(5, 0)); // Problema intencional
        
        // Teste de histórico
        calc.imprimirHistorico();
    }
}