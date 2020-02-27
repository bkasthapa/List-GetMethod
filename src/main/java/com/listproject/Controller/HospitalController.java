package com.listproject.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.listproject.Services.PatientService;
import com.listproject.patientinfo.PatientInfo;

@Controller
public class HospitalController {
	private PatientService ps;
//list method
	@RequestMapping(value = "hospit", method = RequestMethod.GET)
	public ModelAndView listPatient() throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("view");

		List<PatientInfo> pi = ps.getPatientInfo();
		mv.addObject("list", pi);
		return mv;
	}

	// Update-Edit-Save method

	@RequestMapping(value = "editpage", method = RequestMethod.GET)
	public ModelAndView editPatients(@RequestParam String id) throws Exception {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("editsave-context");

		PatientInfo pif = ps.getPatientById(id);
		mv.addObject("doedit", pif);
		return mv;

	}

	@RequestMapping(value = "editsave", method = RequestMethod.POST)
	public String doupdatePatients(PatientInfo pa) throws Exception {
		ps.updatePatients(pa);
		return "ThankYou";

	}

	public PatientService getPs() {
		return ps;
	}

	public void setPs(PatientService ps) {
		this.ps = ps;
	}

}