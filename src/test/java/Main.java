import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File(System.getProperty("user.dir") + "//src//test//java//Data.json");
        JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject = fileElement.getAsJsonObject();
        String name = fileObject.get("name").getAsString();
        String area = fileObject.get("area").getAsString();

        System.out.println("Name is: " + name);
        System.out.println("Area is: " + area);
        JsonArray JsonArrayOfAddress = fileObject.get("address").getAsJsonArray();
        List<POJOClass> address = new ArrayList();
        for (JsonElement AddressElement : JsonArrayOfAddress.getAsJsonArray()) {
            JsonObject AddressJsonObject = AddressElement.getAsJsonObject();
            String city = AddressJsonObject.get("city").getAsString();
            String country = AddressJsonObject.get("country").getAsString();
            POJOClass Address = new POJOClass(city, country);
            address.add(Address);
        }
        System.out.println("Address is : " + address);
    }
}

