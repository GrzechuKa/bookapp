import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;



public class LoadingFileWithBooksList {

    private String linkToFile;
    private Path path;
    private List<String> allLinesList;

    public List<String> getAllLinesList() {
        return allLinesList;
    }

    public List<String> setListWithTextLineFile(Scanner scanner) throws IOException {
        linkToFile = scanner.nextLine();
        path = Paths.get(linkToFile);
        allLinesList = Files.readAllLines(path);

        if (allLinesList.isEmpty() == true) {
            throw new IOException();
        }
        return this.allLinesList;
    }
}
