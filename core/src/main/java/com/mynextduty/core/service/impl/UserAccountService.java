package com.mynextduty.core.service.impl;

import com.mynextduty.core.dto.GlobalMessageDTO;
import com.mynextduty.core.dto.user.UserRegisterRequestDto;
import jakarta.servlet.http.HttpServletResponse;

public interface UserAccountService {
  GlobalMessageDTO register(
          UserRegisterRequestDto registerRequestDto, HttpServletResponse httpServletResponse);
}
