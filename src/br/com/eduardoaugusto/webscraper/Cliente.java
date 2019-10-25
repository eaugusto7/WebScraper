/*
    PROJETO WEB SCRAPER A PARTIR DO E-COMMERCE SUBMARINO
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.webscraper; //Nome do pacote do projeto

//Inicio da classe Cliente, na qual possui o método main para a chamada inicial
public class Cliente {
    public static void main(String[] args) {
        InfoProdutos info = new InfoProdutos(); //Instancia a classe InfoProdutos
        info.webscraper();                      //Chama o método webscraper na classe InfoProdutos
    }
}
