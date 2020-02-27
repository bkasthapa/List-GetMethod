package com.listproject.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.listproject.PatientInfo.PatientInfo;
import com.listproject.Services.PatientService;

@Controller
public class HospitalController {
	private PatientService ps;

	@RequestMapping(value = "hospit", method = RequestMethod.GET)
	public ModelAndView listPatient() throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("view");

		List<PatientInfo> pi = ps.getPatientInfo();
		mv.addObject("list", pi);
		return mv;
	}

	public PatientService getPs() {
		return ps;
	}

	public void setPs(PatientService ps) {
		this.ps = ps;
	}

}