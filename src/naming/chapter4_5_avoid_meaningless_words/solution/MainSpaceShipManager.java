package naming.chapter4_5_avoid_meaningless_words.solution;

class SpaceShip {
    Engine engine;
    Navigator navigator;
    boolean turboEnabled;

    void navigateTo(Planet destination) {
        Route route = navigator.calculateRouteTo(destination);
        Logger.log(route);
        engine.follow(route, turboEnabled);
    }
}

class Logger {
    static void log(Route r) {
    }
}

interface Route {
}

interface Planet {
}

interface Navigator {
    void invokeNavigationTask(Route someData);

    Route calculateRouteTo(Planet someData);
}

class Engine {
    void follow(Route someData, boolean b) {
    }

    ;
}