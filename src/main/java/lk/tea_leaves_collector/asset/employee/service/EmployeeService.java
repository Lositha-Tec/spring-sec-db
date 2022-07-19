package lk.tea_leaves_collector.asset.employee.service;


import lk.tea_leaves_collector.asset.common_asset.model.enums.LiveDead;
import lk.tea_leaves_collector.asset.employee.dao.EmployeeDao;
import lk.tea_leaves_collector.asset.employee.entity.Employee;
import lk.tea_leaves_collector.asset.employee.entity.enums.EmployeeStatus;
import lk.tea_leaves_collector.util.interfaces.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
// spring transactional annotation need to tell spring to this method work through the project

public class EmployeeService implements AbstractService< Employee, Integer > {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    public List< Employee > findAll() {
        return employeeDao.findAll().stream()
            .filter(x -> LiveDead.ACTIVE.equals(x.getLiveDead()))
            .collect(Collectors.toList());
    }


    public Employee findById(Integer id) {
        return employeeDao.getOne(id);
    }

    public Employee persist(Employee employee) {
        if(employee.getId()==null){
            employee.setLiveDead(LiveDead.ACTIVE);
            employee.setEmployeeStatus(EmployeeStatus.WORKING);
        }
        return employeeDao.save(employee);
    }

    public boolean delete(Integer id) {
        Employee employee =  employeeDao.getOne(id);
        employee.setLiveDead(LiveDead.STOP);
        employeeDao.save(employee);
        return false;
    }

   /*
    public boolean delete(Integer id) {
        employeeDao.deleteById(id);
        return false;
    }
*/

    public List< Employee > search(Employee employee) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example< Employee > employeeExample = Example.of(employee, matcher);
        return employeeDao.findAll(employeeExample);
    }

    public boolean isEmployeePresent(Employee employee) {
        return employeeDao.equals(employee);
    }


    public Employee lastEmployee() {
        return employeeDao.findFirstByOrderByIdDesc();
    }


    public Employee findByNic(String nic) {
        return employeeDao.findByNic(nic);
    }


    public Employee findByOfficeEmail(String officeEmail) { return employeeDao.findByOfficeEmail(officeEmail); }

    public Employee findByMobileOne(String mobileOne) {
        return employeeDao.findByMobileOne(mobileOne);
    }



}
