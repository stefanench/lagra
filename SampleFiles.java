import java.util.List;

public class SampleFiles {

    public static List<FileRecord> load() {

        return List.of(

                new FileRecord("report.docx", 152000, true),

                new FileRecord("notes.txt", 8100, true),

                new FileRecord("budget.xlsx", 56000, false),

                new FileRecord("photo.jpg", 460000, false),

                new FileRecord("archive.zip", 720000, false)

        );

    }

}
