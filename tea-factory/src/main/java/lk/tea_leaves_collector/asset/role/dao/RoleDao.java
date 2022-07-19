package lk.tea_leaves_collector.asset.role.dao;


import lk.tea_leaves_collector.asset.role.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository< Role, Integer > {
  Role findByRoleName(String roleName);
}
