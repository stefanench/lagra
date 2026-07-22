import java.util.List;

public class BackupManager {

    public BackupVersion create(

            List<FileRecord> files) {

        IncrementalBackup backup =

                new IncrementalBackup();

        List<FileRecord> changed =

                backup.collect(files);

        return new BackupRepository()

                .save(

                        "v" + Config.CURRENT_VERSION,

                        changed

                );

    }

}
