import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Repository {
    public List<User> users;
    public List<User> userList;

    public List<User> getData() {
        try {
            FileReader reader = new FileReader("acount.json");

            // Chuyển từ JSON text -> object
            Type objectType = new TypeToken<List<User>>() {
            }.getType();
            users = new Gson().fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter("acount.json");
            for (User user : users) {
                fileWriter.write(user.toString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}