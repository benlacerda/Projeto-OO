package Controle;
/**
 * M�todo que possui m�todos de valida��o de alguns dados das classes de Modelo.
 * @author Victor Le�o
 * @version 1.0 (Out. 2021)
 */
public class ServiceControl {
    /**
     * M�todo que valida o modelo de um bone. Nesse caso, o bone tem que ser um dos tr�s modelos: Casual (C/c), Sand�lia (S/s) ou Esportivo (E/e).
     * @param modelo -> Caract�r a ser verificado.
     * @return boolean:
     * (1) True/Verdadeiro: caso o Modelo seja v�lido.
     * (2) False/Falso: caso o Modelo seja inv�lido.
     */
    public static boolean validaModelo(char modelo) {
        if(modelo == 'C' || modelo == 'c' || modelo == 'E' || modelo == 'e'){
            return true;
        }
        return false;
    }

    /**
     * M�todo que valida a quantidade em estoque de um bone a ser cadastrado.
     * @param qtdEstoque -> Quantidade a ser verificada.
     * @return boolean:
     * (1) True/Verdadeiro: Caso a quantidade seja v�lida.
     * (2) False/Falso: Caso a quantidade seja inv�lida.
     */
    public static boolean validaEstoque(int qtdEstoque) {
        if(qtdEstoque > 0) {
            return true;
        }
        return false;
    }


    /**
     * M�todo que valida ser um valor double � maior que zero. Pode ser usado em mais de um caso no programa.
     * @param valor -> Valor double a ser verificado.
     * @return boolean:
     * (1) True/Verdadeiro: caso o valor seja v�lido.
     * (2) False/Falso: caso o valor seja inv�lido.
     */
    public static boolean validaDouble(double valor) {
        if(valor >= 0) {
            return true;
        }
        return false;
    }
}
