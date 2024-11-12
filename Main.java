
import java.util.Arrays;
import java.util.Scanner;

//Main class to display the report
public class Main {

    public static void main(String[] args) {
        // Movie data
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[][] ticketSales = {
                {3000, 1500, 1700}, // Sales for Napoleon in Jan, Feb, Mar
                {3500, 1200, 1600}  // Sales for Oppenheimer in Jan, Feb, Mar
        };

        MovieTickets movieTickets = new MovieTickets();
        int[] totalSales = new int[movies.length];

        // Display header for the report
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("---------------------------------");
        System.out.println("              JAN    FEB    MAR");

        // Display monthly sales and calculate total sales
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-10s", movies[i]);
            totalSales[i] = movieTickets.TotalMovieSales(ticketSales[i]);
            for (int j = 0; j < ticketSales[i].length; j++) {
                System.out.printf("%8d", ticketSales[i][j]);
            }
            System.out.println();
        }

        // Display total sales for each movie
        System.out.println("---------------------------------");
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("Total movie ticket sales for %s: %d%n", movies[i], totalSales[i]);
        }

        // Determine and display the top-performing movie
        String topMovie = movieTickets.TopMovie(movies, totalSales);
        System.out.println("---------------------------------");
        System.out.printf("Top performing movie: %s%n", topMovie);
    }
}