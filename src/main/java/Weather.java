import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Weather {
    private static final String APITOKEN = "fa5728e6fef3328dae727c0edf095669";

    //https://api.openweathermap.org/data/2.5/weather?q=Kyiv,ua&appid=a7e9efe7396d9534b525a3124fa1c94a
    public static String getWeather(String message, Model model) throws IOException {
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + message + "&units=metric&appid=a7e9efe7396d9534b525a3124fa1c94a");
        Scanner in = new Scanner((InputStream) url.getContent());

        String result = "";
        while (in.hasNext()) {
            result += in.nextLine();
        }
        return result;
    }
}
