package simpleproblems;

import java.util.UUID;

public class UUIDGeneration {
    public static void main(String[] args) {
        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);
        String uuidString=uuid.toString();
        System.out.println(uuidString);

    }
}
