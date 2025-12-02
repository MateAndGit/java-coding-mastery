package naming.chapter4_2_follow_getter_setter_conventions_for_frameworks.problem;

class Astronaut {

    String name;
    boolean retired;

    Astronaut(String name) {
        this.name = name;
    }

    String getFullName() {
        return name;
    }

    void setFullName(String name) {
        this.name = name;
    }

    boolean getRetired() {
        return retired;
    }

    void setRetiredState(boolean retired) {
        this.retired = retired;
    }
}
