package lk.tea_leaves_collector.configuration.sec_user_detail_service.entity;

import lk.tea_leaves_collector.asset.user.entity.User;
import lk.tea_leaves_collector.configuration.sec_user_detail_service.entity.enums.UserSessionLogStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSessionLog {
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private Integer id;

  private int failureAttempts;

  @Column( updatable = false, nullable = false )
  private LocalDateTime createdAt;

  @Enumerated( EnumType.STRING )
  private UserSessionLogStatus userSessionLogStatus;

  @ManyToOne
  private User user;
}
