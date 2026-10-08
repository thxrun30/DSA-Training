// Q53. Create a phone contact system using name as key and phone number as value.
import java.util.HashMap;

public class HashMap_Q53_Create_a_phone_contact_system_using_name_as_key_and_phone_number_as_value {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Alice", "9876543210");
        contacts.put("Bob", "9123456780");
        contacts.put("Charlie", "9988776655");

        System.out.println("All contacts:");
        for (String name : contacts.keySet()) {
            System.out.println(name + " -> " + contacts.get(name));
        }

        String search = "Bob";
        if (contacts.containsKey(search)) {
            System.out.println("Number of " + search + ": " + contacts.get(search));
        } else {
            System.out.println(search + " not found");
        }
    }
}
