package HW;
// 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо.
// Записать в файл слово TEXT 100 раз: TEXTTEXTTEXT...
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class HW2_1 {
    public static void main(String[] args) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File file = new File(pathFile);
        if (file.createNewFile()) {
            System.out.println("file.created " + file.getAbsolutePath());
            writeToFile(file);
        } else {
            System.out.println("file.existed " + file.getAbsolutePath());
        }
    }
    static void writeToFile(File f) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEXT");
        }
        FileWriter writer = new FileWriter(f);
        writer.write(stringBuilder.toString());
        writer.close();
    }
}
