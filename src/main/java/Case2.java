import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Case2 {


    private List<Book> bookList;

    public Case2(List<Book> bookList) {
        this.bookList = bookList;
    }

    void sortAndWriteBooksByReleaseYearHighest() {
        List<Book> collect = bookList.stream()
                      .sorted(Comparator.comparing(Book::getRelaceDate))
                      .collect(Collectors.toList());
               collect.forEach(System.out::println);
    }
}
