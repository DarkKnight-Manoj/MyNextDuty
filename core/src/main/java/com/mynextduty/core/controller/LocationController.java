package com.mynextduty.core.controller;

import com.mynextduty.core.dto.ResponseDto;
import com.mynextduty.core.dto.location.UpdateLocationRequestDto;
import com.mynextduty.core.dto.user.UserResponseDto;
import com.mynextduty.core.service.LocationService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {

  private final LocationService locationService;

  @PostMapping("/update")
  public ResponseEntity<ResponseDto<UserResponseDto>> updateUserLocation(
      @RequestBody UpdateLocationRequestDto updateLocationRequest,
      @RequestParam("userID") Long userId) {
    return new ResponseEntity<>(
        locationService.updateUserLocation(userId, updateLocationRequest), HttpStatus.CREATED);
  }

  @GetMapping("/nearby")
  public ResponseEntity<ResponseDto<List<UserResponseDto>>> getNearByUsers(
      @RequestParam("userId") Long userId) {
    return new ResponseEntity<>(locationService.getNearByUsers(userId), HttpStatus.OK);
  }
}
