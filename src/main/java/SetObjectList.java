import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SetObjectList {

    private List<Book> bookList = new ArrayList<>();


    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> setBookObject(List<String> allLines) throws IOException {
        for (String bookLine : allLines) {
            String[] split = bookLine.split(";");
            bookList.add(new Book(split[0], split[1], Integer.valueOf(split[2]), Integer.valueOf(split[3]), split[4], split[5], split[6]));
        } if (bookList.get(0).getAuthor().isEmpty()){
            throw new IOException();
        }
        return this.bookList;
    }
}
