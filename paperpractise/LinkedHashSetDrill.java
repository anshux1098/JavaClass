import java.util.*;

public class LinkedHashSetDrill {

    public static Set<String> addPreference(LinkedHashSet<String> preferences, String pref) {
        // TODO: Add the preference to the LinkedHashSet and return the set
        return preferences.add(pref);
    }

    public static void main(String[] args) {
        LinkedHashSet<String> prefs = new LinkedHashSet<>();

        addPreference(prefs, "Dark Mode");
        addPreference(prefs, "Notifications");
        addPreference(prefs, "Dark Mode"); // Duplicate, should be ignored
        addPreference(prefs, "Auto-Save");

        System.out.println("Preferences (Must preserve order and uniqueness):");
        for (String p : prefs) {
            System.out.println("- " + p);
        }
    }
}
