import java.util.List;

public class FileScanner {

    public List<FileRecord> scan() {

        return SampleFiles.load();

    }

}
