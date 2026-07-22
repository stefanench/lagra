import java.util.ArrayList;
import java.util.List;

public class IncrementalBackup {

    public List<FileRecord> collect(

            List<FileRecord> files) {

        List<FileRecord> result =

                new ArrayList<>();

        for (FileRecord file : files) {

            if (file.isModified()) {

                result.add(file);

            }

        }

        return result;

    }

}
