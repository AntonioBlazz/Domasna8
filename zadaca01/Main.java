package zadaca01;

import java.util.Map;
import java.util.HashMap;

public class Main {
public static void main(String[] args) {
Map<String,String> recnik = new HashMap<String,String>();
recnik.put("arm", "raka");
recnik.put("leg", "noga");
recnik.put("hair", "kosa");
recnik.put("eye", "oko");
recnik.put("hi", "zdravo");

System.out.println("Klucevi: " + recnik.keySet());
System.out.println("Vrednosti: " + recnik.values());

for(Map.Entry<String,String> entry: recnik.entrySet()) {
System.out.println(entry.getKey() + " | " + entry.getValue());
}

if(recnik.containsKey("hi")) {
System.out.println("Vrednosta za 'hi' e: " + recnik.get("hi"));
}
else
System.out.println("Ne postoi zbor 'hi'");
}
}