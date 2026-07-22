import java.util.List;

public class Main {

    public static void main(

            String[] args) {

        FileScanner scanner =

                new FileScanner();

        List<FileRecord> files =

                scanner.scan();

        BackupManager manager =

                new BackupManager();

        BackupVersion backup =

                manager.create(files);

        VersionHistory history =

                new VersionHistory();

        new ReportPrinter().print(

                backup,

                history.history(),

                files.size()

        );

    }

}
