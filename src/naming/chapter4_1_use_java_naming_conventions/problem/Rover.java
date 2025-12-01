package naming.chapter4_1_use_java_naming_conventions.problem;

class Problem {}

class Rover {
    static final double WalkingSpeed = 3;

    final String SerialNumber;
    double MilesPerHour;

    Rover(String NewSerialNumber) {
        SerialNumber = NewSerialNumber;
    }

    void Drive() {
        MilesPerHour = WalkingSpeed;
    }
    void Stop() {
        MilesPerHour = 0;
    }
}
