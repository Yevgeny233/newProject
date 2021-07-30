import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hypermarket {
   

    public static void main(String[] args) throws IOException {
        ArrayList<Wallpaper> list = new ArrayList<>();
        Wallpaper wallpaper1 = new Wallpaper(52, "белый");
        Wallpaper wallpaper2 = new Wallpaper(35, "красный");
        Wallpaper wallpaper3 = new Wallpaper(22, "синий");
        list.add(wallpaper1);
        list.add(wallpaper2);
        list.add(wallpaper3);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String request = reader.readLine();
        int wishPrise = Integer.parseInt(reader.readLine());

       if (request.toLowerCase().equals("обои")){
           for (int i = 0; i < list.size(); i++){
           if (wishPrise > list.get(i).getPrise()){
               System.out.println("Обои дешевле жилаемой цены: " + list.get(i).getColor() + " по цене " + list.get(i).getPrise());
       }
           }
       }

    }

    SanitaryEngineering sanitaryEngineering1 = new SanitaryEngineering(125, "кран");

}
