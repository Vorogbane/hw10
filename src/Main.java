public class Main {
    public static void main(String[] args) {
    Author pushkin = new Author ("Alexander", "Pushkin");
    Author gogol = new Author("Nikolai", "Gogol");
    Book EugeneOnegin = new Book("Eugene Onegin", pushkin, 1833);
    Book NightBeforeChristmas = new Book("The night before christmas", gogol, 1832);
        System.out.println("EugeneOnegin.getPublishingYear() = " + EugeneOnegin.getPublishingYear());
        System.out.println("EugeneOnegin.getAuthor() = " + EugeneOnegin.getAuthor());
        System.out.println("NightBeforeChristmas.getBookTitle() = " + NightBeforeChristmas.getBookTitle());
        System.out.println("Pushkin.getName() = " + pushkin.getName());
    EugeneOnegin.setPublishingYear(1835);
        System.out.println("EugeneOnegin.getPublishingYear() = " + EugeneOnegin.getPublishingYear());
    }
}