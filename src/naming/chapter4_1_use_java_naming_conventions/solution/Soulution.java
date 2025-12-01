package naming.chapter4_1_use_java_naming_conventions.solution;

class Solution {}

class Rover {
    static final double WALKING_SPEED = 3;

    final String serialNumber;
    double milesPerHour;

    Rover(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    void drive() {
        milesPerHour = WALKING_SPEED;
    }

    void stop() {
        milesPerHour = 0;
    }
}
