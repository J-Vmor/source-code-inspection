package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    /*--------------------------------------------------------------------
     Tipo: Omissão
     Ausência de validação: construtor aceita valor <= 0 e quantidade < 0.
     --------------------------------------------------------------------*/
    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        /*----------------------------------------------------------------
         Tipo: Comissão
         Deveria rejeitar valores negativos ou zero para “valor” e
         negativos para “quantidade”.
         ---------------------------------------------------------------*/
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    /*--------------------------------------------------------------------
     Tipo: Omissão
     Falta método que permita alterar a quantidade, essencial para o Troco.
     --------------------------------------------------------------------*/