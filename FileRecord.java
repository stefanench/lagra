public class FileRecord {

    private final String name;

    private final long size;

    private final boolean modified;

    public FileRecord(

            String name,

            long size,

            boolean modified) {

        this.name = name;

        this.size = size;

        this.modified = modified;

    }

    public String getName() {

        return name;

    }

    public long getSize() {

        return size;

    }

    public boolean isModified() {

        return modified;

    }

}
