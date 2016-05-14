package com.example.aixin.walkbuddies.Model;

import android.location.Location;

/**
 * Created by aixin on 5/14/16.
 */
public class RouteLocation {
    private Location start;
    private Location dest;

    public RouteLocation(double startLat, double startLng, double endLat, double endLng) {
        this.start = new Location("startingLocation");
        this.start.setLatitude(startLat);
        this.start.setLongitude(startLng);

        this.dest = new Location("destLocation");
        this.dest.setLatitude(endLat);
        this.dest.setLongitude(endLng);
    }

    public Location getStart() {    return start;   }

    public Location getDest() {     return dest;    }
}
