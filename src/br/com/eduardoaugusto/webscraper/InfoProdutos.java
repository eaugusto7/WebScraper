/*
    PROJETO WEB SCRAPER A PARTIR DO E-COMMERCE SUBMARINO
    NOME: Eduardo Augusto de Oliveira Borges
*/

package br.com.eduardoaugusto.webscraper; //Nome do pacote do projeto

//Importação das Bibliotecas
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class InfoProdutos { //Inicio da classe InfoProdutos

    //Inicio do método responsável pelo webscraper
    public void webscraper() {
        //Declaração de variáveis
        Document doc = null;
        ArrayList<String> listaDetalhes = new ArrayList();

        
        try {
            String url = null;
            url = JOptionPane.showInputDialog("Digite o endereco web: "); //Atribui a varivel url o endereço informado pelo usuário
            doc = Jsoup.connect(url).get(); //Obtem as informações a partir da url informada pelo usuário

            /*A partir de determinadas tags do html, procura informações do produto como nome, preço, descrição e ficha tecnica*/
            String title = doc.title();
            System.out.println("Titulo: " + title);

            Element nome = doc.select("h1.product-title__TitleUI-sc-116vf1e-2.bDZZCj.TitleH1-sc-1wh9e1x-0.iNtPfX").first();
            System.out.println("Nome: " + nome.text());

            Element preco = doc.select("div.main-price").select("span.sales-price.main-offer__SalesPrice-sc-1oo1w8r-1.fiWaea.TextUI-sc-12tokcy-0.CIZtP").first();
            System.out.println("Preco: " + preco.text());

            System.out.println("");

            Element info = doc.select("div.info-description-frame-inside.info__DescriptionCol-sc-1bqsn8f-0.hzrjTN.ColUI-gjy0oc-0.hZFKDP.ViewUI-sc-1ijittn-6.iXIDWU").first();
            System.out.println("Informacoes: " + info.text());
            System.out.println("");

            Elements codig = doc.select("tr.Tr-sc-1wy23hs-3.cNwYXF").select("span.TextUI-sc-12tokcy-0.CIZtP");

            int j = 0;
            
            //Atribui a um ArrayList as informações de ficha tecnica obtidas no html
            for (Element cd : codig) {
                
                //As informações de ficha tecnica são divididas em pares, sendo o primeiro o nome do campo, e o seguindo o valor, por isso utiliza-se operador mod
                if (j % 2 == 0) {
                    listaDetalhes.add(cd.text());
                } else {
                    listaDetalhes.add(": " + cd.text() + "\n");
                }
                j++;
            }

            //Imprime em forma de texto o Array com as informações obtidas da ficha tecnica
            for (int i = 0; i < listaDetalhes.size(); i++) {
                if (i % 2 == 0) {
                    System.out.print(listaDetalhes.get(i) + ": ");
                } else {
                    System.out.println(listaDetalhes.get(i));
                }

            }
            System.out.println("");

            //Exibe as informações ao usuário no modo gráfico, utilizando JFrame
            Tela tela = new Tela(nome.text(), preco.text(), info.text(), listaDetalhes);
            tela.setVisible(true);
        } catch (IOException e) { //Exceção caso ocorra erro na entrada de dados do usuário
            e.printStackTrace();
        }
    }
}
