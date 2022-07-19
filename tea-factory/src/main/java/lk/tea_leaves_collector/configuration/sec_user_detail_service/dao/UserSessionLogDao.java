package lk.tea_leaves_collector.configuration.sec_user_detail_service.dao;

import lk.tea_leaves_collector.asset.user.entity.User;
import lk.tea_leaves_collector.configuration.sec_user_detail_service.entity.UserSessionLog;
import lk.tea_leaves_collector.configuration.sec_user_detail_service.entity.enums.UserSessionLogStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSessionLogDao extends JpaRepository< UserSessionLog, Integer > {
  UserSessionLog findByUserAndUserSessionLogStatus(User user, UserSessionLogStatus userSessionLogStatus);
}
