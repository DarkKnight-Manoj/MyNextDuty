package com.mynextduty.core.service;

public interface BlackListTokenService {
  boolean checkTokenExist(String token);

  void blacklistToken(String token);
}
