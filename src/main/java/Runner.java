import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        IntroText.returnIntroText();

        Scanner scanner = new Scanner(System.in);
        //        d:\dane.txt

        LoadingFileWithBooksList loadingFileWithBooksList = new LoadingFileWithBooksList();

        try {
            loadingFileWithBooksList.setListWithTextLineFile(scanner);
            System.out.println();
        } catch (IOException e){
            System.out.println("Niepoprawna ścieżka dostępu do pliku");
        }

        List<String> allLines = loadingFileWithBooksList.getAllLinesList();
//        allLines.forEach(System.out::println);

        SetObjectList setObjectList = new SetObjectList();
        try {
            setObjectList.setBookObject(allLines);
        } catch (Exception e){
            System.out.println("Niepoprawny format zapisu książek w pliku");
        }

        List<Book> bookList = setObjectList.getBookList();
//        bookList.forEach(System.out::println);

        MenuText.returnMenuList();

        Scanner scanner1 = new Scanner(System.in);
        int numberOfIndexMenu = scanner1.nextInt();

        switch(numberOfIndexMenu)
        {
            case 1:
                Case1 case1 = new Case1(bookList);
                case1.returnWithLargestNumberOfPage();
                break;
            case 2:
                Case2 case2 = new Case2(bookList);
                case2.sortAndWriteBooksByReleaseYearHighest();
                break;
            case 3:
                System.out.println("3. Wypisz książki w zależności od podanego typu");
                break;
            case 4:
                System.out.println("4. Wypisz książkę w zależności od podanego numeru ISBN");
                break;
            case 5:
                System.out.println("5. Wypisz książki w zależności od podanego autora");
                break;
            case 6:
                System.out.println("6. Zapisz do wskazanego pliku posortowane alfabetycznie (według tytułu) książki");
                break;
            default:
                System.out.println("Nie ma takiej książki");
        }







    }


}

