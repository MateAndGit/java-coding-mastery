package comments.chapter3_3_replace_comment_with_constant.solution;

enum SmallDistanceUnit {

    CENTIMETER,
    INCH;

    static final double INCH_IN_CENTIMETERS = 2.54;
    static final double CENTIMETER_IN_INCHES = 1 / INCH_IN_CENTIMETERS;
    static final int IDENTITY = 1;

    double getConversionRate(SmallDistanceUnit unit) {
        if (this == unit) {
            return IDENTITY; // identity conversion rate
        }

        if (this == CENTIMETER && unit == INCH) {
            return CENTIMETER_IN_INCHES; // one centimeter in inch
        } else {
            return INCH_IN_CENTIMETERS; // one inch in centimeters
        }
    }
}