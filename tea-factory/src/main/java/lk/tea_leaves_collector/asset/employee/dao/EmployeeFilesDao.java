package lk.tea_leaves_collector.asset.employee.dao;


import lk.tea_leaves_collector.asset.employee.entity.Employee;
import lk.tea_leaves_collector.asset.employee.entity.EmployeeFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeFilesDao extends JpaRepository< EmployeeFiles, Integer > {
    List< EmployeeFiles > findByEmployeeOrderByIdDesc(Employee employee);

    EmployeeFiles findByName(String filename);

    EmployeeFiles findByNewName(String filename);

    EmployeeFiles findByNewId(String filename);

    EmployeeFiles findByEmployee(Employee employee);
}
