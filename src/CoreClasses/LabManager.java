package CoreClasses;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import CoreClasses.Lab;

public class LabManager {
    private static String labsFolder = "src/Labs/";

    public static void init() throws Exception {
        try (Stream<Path> paths = Files.walk(Paths.get(labsFolder))) {
            paths.filter(Files::isRegularFile).forEach(System.out::println);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void registerLab(Lab lab) {

    }
    public static void run(int i) throws Exception {

    }
}
