package com.mynextduty.core.service;

import com.mynextduty.core.entity.User;

public interface CurrentUserService {

  /**
   * Returns the currently authenticated user.
   *
   * @throws com.mynextduty.core.exception.GenericApplicationException if no user is logged in
   */
  User getCurrentUser();

  /** Returns the current user id without loading the full entity. */
  Long getCurrentUserId();

  boolean isAuthenticated();

  boolean isVerified();

  default boolean isValidUser(Long userId) {
    return userId.equals(getCurrentUserId());
  }
}
