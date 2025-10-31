package comments.chapter3_2_remove_commented_out_code.soultion;

import general.chapter2_3_favor_foreach_over_for.Commander;
import general.chapter2_3_favor_foreach_over_for.Status;

import java.util.Arrays;
import java.util.List;

class LaunchChecklist {

    List<String> checks = Arrays.asList(
            "Cabin Leak",
            "Engine",
            "Hull",
            "OxygenTank"
    );

    Status prepareLaunch(Commander commander) {
        for (String check : checks) {
            boolean shouldAbortTakeoff = commander.isFailing(check);
            if (shouldAbortTakeoff) {
                return Status.ABORT_TAKE_OFF;
            }
        }
        return Status.READY_FOR_TAKE_OFF;
    }
}
