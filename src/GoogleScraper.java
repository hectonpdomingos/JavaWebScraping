/**
 * Created by Hecton on 21/11/2016.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GoogleScraper {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows; U; Windows NT 5.1; de; rv:1.9.2.3) Gecko/20100401 Firefox/3.6.3 (FM Scene 4.6.1)";
    public static void main(String[] args) throws Exception{


       // final String query = "Your-keyword";
       // final Document page = Jsoup.connect("https://www.google.com/search?q=" +URLEncoder.encode(query, "UTF-8")).get();

        // final String query = "1USD+to+REAL";
        final Document page = Jsoup.connect("http://economia.uol.com.br/cotacoes/cambio/dolar-comercial-estados-unidos/?historico" ).userAgent(USER_AGENT).get();

       // System.out.println(page.outerHtml());
        for (Element searchResult : page.select("p")) {
            final String title = searchResult.text();

           //final String url = searchResult.attr("cotacao");

            System.out.println(title); // + "->" + url);
        }

    }
}
