package com.hms.employeemanagement.controller;

import com.hms.employeemanagement.model.Employee;
import com.hms.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

@Autowired
    EmployeeService erepository;

@GetMapping("/start")
    public String showSignUpForm(Employee employee) {
        return "index";
    }

@GetMapping("/adduserform")
public String showForm(ModelMap model) {
    Employee employee = new Employee();
    model.addAttribute("employee", employee);
    return "adduserform";
}

@PostMapping("/register")
    public String submitForm(@ModelAttribute("employee") Employee employee ,BindingResult result, ModelMap model) {
    int y=erepository.createEmployee(employee);
        return "redirect:start";

    }

    @GetMapping("/edituser")
    public String showEmployeeList(ModelMap model) {
    List<Employee> emplist=erepository.findall();
        model.addAttribute("emplist", emplist);
        return "updateForm";
    }



    @GetMapping(value = "/edit")
    public String showEditEmpForm(ModelMap model, @RequestParam("employeeId") int employeeId, @RequestParam("departmentId") int departmentId) {
        try {
            Employee emp = erepository.getEmployeeByCompositeKey(employeeId, departmentId);
            model.addAttribute("employee", emp);
            return "showToBeupdateForm";

        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
}

    @GetMapping("/deleteuser")
    public String showEmployeeDeleteList(ModelMap model) {
        List<Employee> empdeletelist=erepository.findall();
        model.addAttribute("empdeletelist", empdeletelist);
        return "deleteForm";
    }

    @GetMapping(value = "/delete")
    public String showDeleteEmpForm(ModelMap model, @RequestParam("employeeId") int employeeId, @RequestParam("departmentId") int departmentId) {
        try {
            Employee emp = erepository.getEmployeeByCompositeKey(employeeId, departmentId);
            model.addAttribute("employee", emp);
            return "showToBeDeleteForm";

        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }


    @PostMapping("/deleteFinish")
    public String deleteEmp(@ModelAttribute("employee") Employee employee ,BindingResult result, ModelMap model) {
     int delete=erepository.deleteEmp(employee.getEmployeeId(),employee.getDepartmentId());
        return "redirect:start";

    }

    @GetMapping("/viewemployeen")
    public String searchEmpByName(Employee employee) {
     return "searchUser";
    }

    @PostMapping(value = "/viewEmp")
    public String showEmpByName(ModelMap model, @RequestParam("firstName") String firstName) {
        try {
            List<Employee> emp = erepository.viewEmployee(firstName);
            model.addAttribute("employee", emp);
            return "showByName";

        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/viewemployeed")
    public String searchEmpByDepartmentName(Employee employee) {
     return "searchUserD";
    }


    @PostMapping(value = "/viewEmpdept")
    public String showEmpByDepName(ModelMap model, @RequestParam("departmentName") String departmentName) {
        try {
            List<Employee> emp = erepository.findByDdname(departmentName);
            model.addAttribute("employee", emp);
            //System.out.println(emp);
            return "showByDname";

        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }


}



