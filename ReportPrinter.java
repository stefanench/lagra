public class ReportPrinter {

    public void print(

            BackupVersion backup,

            java.util.List<String> history,

            int totalFiles) {

        System.out.println(

                "Scanning files...\n"

        );

        System.out.println(

                "Files detected: " +

                        totalFiles +

                        "\n"

        );

        System.out.println(

                "Modified\n"

        );

        for (FileRecord file :

                backup.getFiles()) {

            System.out.println(

                    file.getName()

            );

        }

        System.out.println();

        System.out.println(

                "Backup Version\n"

        );

        System.out.println(

                backup.getVersion()

        );

        System.out.println();

        System.out.println(

                "Files stored\n"

        );

        System.out.println(

                backup.getFiles().size()

        );

        System.out.println();

        System.out.println(

                "History\n"

        );

        for (String version :

                history) {

            System.out.println(

                    version

            );

        }

    }

}
