public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";// в ед. числе одна бутылка
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми бутылку.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if ((beerNum % 10) > 1 && (beerNum % 10) < 5) {
                word = "бутылки";
            }

            if ((beerNum % 10) == 1) {
                word = "бутылка";
            }

            if (((beerNum % 10) >= 5) || ((beerNum % 10) == 0) || (beerNum > 10 && beerNum < 20)) {
                word = "бутылок";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println();
            } else {
                System.out.println("Нет бутылок пива на стене.");
            } // конец else
        } // конец цикла while
    } // конец метода main
} // конец класса