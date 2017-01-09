import java.util.HashSet;
import java.util.UUID;

public class UniqueIdProvider {
    private static UniqueIdProvider ourInstance = new UniqueIdProvider();

    public static UniqueIdProvider getInstance() {
        return ourInstance;
    }

    private UniqueIdProvider() {
    }


    private HashSet<String> shelfIdHistory = new HashSet<>();

    public String getUniqueId() {
        String generatedId = UUID.randomUUID().toString().substring(0, 4);
        while (shelfIdHistory.contains(generatedId)) {
            generatedId = UUID.randomUUID().toString().substring(0, 4);
        }
        shelfIdHistory.add(generatedId);
        return generatedId;
    }
}