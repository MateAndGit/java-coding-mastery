package naming.chapter4_5_avoid_meaningless_words.problem;

class MainSpaceShipManager {
    AbstractRocketPropulsionEngine abstractRocketPropulsionEngine;
    INavigationController navigationController;
    boolean turboEnabledFlag;

    void navigateSpaceShipTo(PlanetInfo planetInfo) {
        RouteData data = navigationController.calculateRouteData(planetInfo);
        LogHelper.logRouteData(data);
        abstractRocketPropulsionEngine.invokeTask(data, turboEnabledFlag);
    }
}
class LogHelper {
    static void logRouteData(RouteData data) {
    }
}

interface RouteData {
}

interface PlanetInfo {
}

interface INavigationController {
    void invokeNavigationTask(RouteData someData);

    RouteData calculateRouteData(PlanetInfo someData);
}

class AbstractRocketPropulsionEngine {
    void invokeTask(RouteData someData, boolean b) {
    }

    ;
}