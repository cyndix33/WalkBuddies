package com.example.aixin.walkbuddies.Data;

import com.example.aixin.walkbuddies.Model.*;

import android.location.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aixin on 5/14/16.
 */
public class LocationHandler {
    private final double SEARCHING_STARTING_RANGE = 0.5;
    private final double SEARCHING_DEST_RANGE = 1;


    public List<User> getPossibleBuddies(RouteLocation current, List<User> listings) {
        List<User> res = new ArrayList<>();
        for (User u: listings) {
            if (isPotentialBuddy(current, u))
                res.add(u);
        }
        return res;
    }

    private boolean isPotentialBuddy(RouteLocation current, User potential) {
        boolean closeStart = isWithinRange(current.getStart(),
                potential.getLocation().getStart(), SEARCHING_STARTING_RANGE);
        boolean closeDest = isWithinRange(current.getDest(),
                potential.getLocation().getDest(), SEARCHING_DEST_RANGE);
        return closeStart && closeDest;
    }

    private boolean isWithinRange(Location a, Location b, double range) {
        return false;
    }
}
