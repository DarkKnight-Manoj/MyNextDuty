package com.mynextduty.core.dto.projection;

import org.locationtech.jts.geom.Point;

public interface NearbyUserLocation {
  Long getUserId();

  Point getLocation();
}
