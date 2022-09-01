public class Main {
    public static void main(String[] args) {
    Author Pushkin = new Author ("Alexander", "Pushkin");
    Author Gogol = new Author("Nikolai", "Gogol");
    Book EugeneOnegin = new Book("Eugene Onegin", Pushkin, 1833);
    Book NightBeforeChristmas = new Book("The night before christmas", Gogol, 1832);
        System.out.println("EugeneOnegin.getPublishingYear() = " + EugeneOnegin.getPublishingYear());
        System.out.println("EugeneOnegin.getAuthor() = " + EugeneOnegin.getAuthor());
        System.out.println("NightBeforeChristmas.getBookTitle() = " + NightBeforeChristmas.getBookTitle());
        System.out.println("Pushkin.getName() = " + Pushkin.getName());
    EugeneOnegin.setPublishingYear(1835);
        System.out.println("EugeneOnegin.getPublishingYear() = " + EugeneOnegin.getPublishingYear());
    }
}