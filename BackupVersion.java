import java.util.List;

public class BackupVersion {

    private final String version;

    private final List<FileRecord> files;

    public BackupVersion(

            String version,

            List<FileRecord> files) {

        this.version = version;

        this.files = files;

    }

    public String getVersion() {

        return version;

    }

    public List<FileRecord> getFiles() {

        return files;

    }

}
