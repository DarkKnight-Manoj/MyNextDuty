package com.mynextduty.core.service.impl;

import com.mynextduty.core.service.BlackListTokenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BlackListTokenServiceImpl implements BlackListTokenService {
  @Override
  public boolean checkTokenExist(String token) {
    return false;
  }

  @Override
  public void blacklistToken(String token) {}
}
