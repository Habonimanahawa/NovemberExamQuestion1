public class MovieTickets {
    public int TotalMovieSales(int[] ticketSale) {
        int total = 0;
        int[] movieTicketSales = new int[0];
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }

    public String TopMovie(String[] movies, int[] totalSales) {
        int maxSales = totalSales[0];
        String topMovie = movies[0];
        for (int i = 1; i < movies.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topMovie = movies[i];
            }
        }
        return topMovie;

    }

    interface IMovieTickets {
        int TotalMovieSales(int[] movieTicketSales);


            }
        }

