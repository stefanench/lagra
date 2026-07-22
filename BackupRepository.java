public class BackupRepository {

    public BackupVersion save(

            String version,

            java.util.List<FileRecord> files) {

        return new BackupVersion(

                version,

                files

        );

    }

}
