
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Case1 {

    final private List<Book> bookList;

    public Case1(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void returnWithLargestNumberOfPage() {
        List<Book> collect = new ArrayList<>();
        for (Book book : bookList) {
            collect.add(book);
        }
        collect.sort(Comparator.comparing(Book::getRelaceDate));
        System.out.println(collect.get(collect.size() - 1));
    }


}
