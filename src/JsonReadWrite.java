import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Zach on 9/8/16.
 */
public class JsonReadWrite {


    public void writeJson() throws IOException {
        File f = new File(Main.BOWDESCRIPTIONFILE);
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(Main.newBow);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

    public Bow readJson() throws FileNotFoundException {
        File f = new File(Main.BOWDESCRIPTIONFILE);
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        s.close();

        JsonParser parser = new JsonParser();
        Bow newBow = parser.parse(contents, Bow.class);
        return newBow;
    }
}
