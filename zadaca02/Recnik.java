package zadaca02;

import java.util.Map;
import java.util.HashMap;
public class Recnik {
Map<String,String> recnik = new HashMap<String,String>();

public void vnesiMapa() {
recnik.put("mother", "majka");
recnik.put("father", "tatko");
recnik.put("sister", "sestra");
recnik.put("brother", "brat");
}

public void translate (String s) {
if(recnik.containsKey(s)) {
System.out.println(recnik.get(s));
}
else
System.out.println("Ne postoi takov zbor vo recnikot.");
}
}
