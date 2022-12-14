import user.StandardUser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // Convert JSON string from file to Object
        StandardUser user = mapper.readValue(new File(args[0]), StandardUser.class);

        System.out.println(user.toString());


    }
}
