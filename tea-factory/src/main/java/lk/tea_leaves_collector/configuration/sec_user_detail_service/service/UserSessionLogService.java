package lk.tea_leaves_collector.configuration.sec_user_detail_service.service;

import lk.tea_leaves_collector.asset.user.entity.User;
import lk.tea_leaves_collector.configuration.sec_user_detail_service.entity.UserSessionLog;
import lk.tea_leaves_collector.configuration.sec_user_detail_service.entity.enums.UserSessionLogStatus;

import java.util.List;

public interface UserSessionLogService {
  List< UserSessionLog > findAll();

  UserSessionLog findById(Integer id);

  boolean delete(Integer id);

  UserSessionLog persist(UserSessionLog userSessionLog);

  void delete(UserSessionLog userSessionLog);

  UserSessionLog findByUserAndUserSessionLogStatus(User user, UserSessionLogStatus userSessionLogStatus);

}
