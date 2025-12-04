package error_handling.chapter5_2_always_catch_most_specific_exception.problem;

class TransmissionParser {
    static Transmission parse(String rawMessage) {
        if (rawMessage != null
                && rawMessage.length() != Transmission.MESSAGE_LENGTH) {
            throw new IllegalArgumentException("Bad message received!");
        }

        String rawId = rawMessage.substring(0, Transmission.ID_LENGTH);
        String rawContent = rawMessage.substring(Transmission.ID_LENGTH);
        try {
            int id = Integer.parseInt(rawId);
            String content = rawContent.trim();
            return new Transmission(id, content);
        } catch (Exception e) {
            throw new IllegalArgumentException("Bad message received!");
        }
    }
}

class Transmission {

    static final int MESSAGE_LENGTH = 146;
    static final int ID_LENGTH = 6;

    final int id;
    final String content;

    Transmission(int id, String content) {
        this.id = id;
        this.content = content;
    }
}