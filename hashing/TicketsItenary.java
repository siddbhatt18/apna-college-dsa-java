import java.util.*;
public class TicketsItenary {
    public static String findStart(HashMap<String, String> ticket) {
        HashMap<String, String> rev = new HashMap<>();
        for(String key : ticket.keySet()) {
            rev.put(ticket.get(key), key);
        }
        for(String key : ticket.keySet()) {
            if(rev.containsKey(key) != true) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Bangalore");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");
        String start = findStart(ticket);
        System.out.print(start);
        while(ticket.get(start) != null) {
            System.out.print(" -> " + ticket.get(start));
            start = ticket.get(start);
        }
    }
}