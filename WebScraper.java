import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class WebScraper {

    public static void main(String[] args) {
        // The target URL for scraping Amazon
        String url = "https://www.amazon.in/s?k=mobile&page=2&qid=1733859171&ref=sr_pg_2";

        try {
            // Connect to the website and fetch the HTML
            Document document = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36") // Set User-Agent
                    .timeout(5000) // Set timeout
                    .get();

            // Select the elements containing product data (inspect HTML for actual selectors)
            Elements products = document.select("div.s-main-slot div.s-result-item");

            // Create a FileWriter to save the data to a CSV file
            FileWriter csvWriter = new FileWriter("products.csv");
            csvWriter.append("Name,Price,Rating\n"); // Write CSV header

            // Iterate through each product and extract the required information
            for (Element product : products) {
                // Extract product name
                String name = product.select("h2.a-size-medium.a-spacing-none.a-color-base.a-text-normal").text();

                // Extract product price
                String price = product.select("span.a-price-whole").text();

                // Extract product rating
                String rating = product.select("i.a-icon.a-icon-star-small.a-star-small-4").text();

                // Write data to CSV file if name and price are available
                if (!name.isEmpty() && !price.isEmpty()) {
                    csvWriter.append("Name: "+name).append(",\n")
                            .append("Price: "+price).append(",\n")
                            .append(rating.isEmpty() ? "No rating" : "Rating: "+rating)
                            .append("\n")
                            .append("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                }
            }

            csvWriter.flush();
            csvWriter.close();
            System.out.println("Data saved to products.csv!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
