package com.mynextduty.core.dto.user;

import com.mynextduty.core.enums.LifeStage;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserResponseDto {
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String currentOccupation;
  private LocalDate dateOfBirth;
  private LifeStage lifeStage;
  private Double monthlyIncome;
  private String educationLevel;
  private boolean isVerified;
  private double latitude;
  private double longitude;
}
