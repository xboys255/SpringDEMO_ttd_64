package com.csis3275.Controller_ttd_64;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csis3275.Model_ttd_64.Employee_ttd_64;

@Controller
//Here we will have this controller respond to requests from /employee for the employee servlet.
@RequestMapping("/employee")
public class EmployeeController_ttd_64 {
	/*
	 * This method will serve as default GET handler.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String newProfile(ModelMap model) {
		Employee_ttd_64 employee = new Employee_ttd_64();
		model.addAttribute("employee", employee);
		return "employee";
	}

	/*
	 * This method will be called on form submission, handling POST request It also
	 * validates the user input
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String saveProfile(Employee_ttd_64 employee, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "employee";
		}
		model.addAttribute("success", "Dear " + employee.getFirstName() + " , your profile completed successfully");
		model.addAttribute("employee", employee);
		return "success";
	}

	/*
	 * Method used to populate the country list in view. Note that here you can call
	 * external systems to provide real data.
	 */
	@ModelAttribute("countries")
	public List<String> initializeCountries() {
		List<String> countries = new ArrayList<String>();
		countries.add("USA");
		countries.add("Canada");
		countries.add("France");
		countries.add("Indonesia");
		countries.add("Australia");
		countries.add("Other");
		return countries;
	}
}
