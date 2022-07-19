package lk.tea_leaves_collector.asset.employee.dao;


import lk.tea_leaves_collector.asset.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeDao extends JpaRepository< Employee, Integer> {

    Employee findFirstByOrderByIdDesc();

    Employee findByNic(String nic);

    Employee findByOfficeEmail (String officeEmail);
    Employee findByMobileOne(String mobileOne);

}
