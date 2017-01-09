import java.util.HashSet;
import java.util.UUID;

public class UniqueIdProvider {
    private static UniqueIdProvider ourInstance = new UniqueIdProvider();

    public static UniqueIdProvider getInstance() {
        return ourInstance;
    }

    private UniqueIdProvider() {
    }


    private HashSet<String> entityIdHistory = new HashSet<>();

    public String getUniqueId() {
        String generatedId = UUID.randomUUID().toString().substring(0, 4);
        while (entityIdHistory.contains(generatedId)) {
            generatedId = UUID.randomUUID().toString().substring(0, 4);
        }
        entityIdHistory.add(generatedId);
        return generatedId;
    }
}