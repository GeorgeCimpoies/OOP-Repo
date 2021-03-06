/**
 * Created by George Cimpoies on 11/17/2016.
 */

import java.util.HashSet;
import java.util.UUID;

public class UniqueIdProvider {
    private static UniqueIdProvider ourInstance = new UniqueIdProvider();

    public static UniqueIdProvider getInstance() {
        return ourInstance;
    }

    private UniqueIdProvider() {
    }


    private HashSet<String> compartmentIdHistory = new HashSet<>();

    public String getUniqueId() {
        String generatedId = UUID.randomUUID().toString().substring(0, 4);
        while (compartmentIdHistory.contains(generatedId)) {
            generatedId = UUID.randomUUID().toString().substring(0, 4);
        }
        compartmentIdHistory.add(generatedId);
        return generatedId;
    }
}
