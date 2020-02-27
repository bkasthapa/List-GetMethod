package com.listproject.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.listproject.DbUtility.DbUtility;
import com.listproject.PatientInfo.PatientInfo;

public class PatientService {

	public List<PatientInfo> getPatientInfo() throws Exception {

		Connection con=DbUtility.getConnection();

		Statement str = con.createStatement();

		String sql = "select * from Patients";

		ResultSet rs = str.executeQuery(sql);

		List<PatientInfo> patients = new ArrayList<PatientInfo>();

		while (rs.next()) {

			PatientInfo coi = new PatientInfo();
			
			coi.setName(rs.getString("name"));
			coi.setAddress(rs.getString("address"));
			coi.setAge(rs.getString("age"));
			coi.setdOB(rs.getString("doB"));

			patients.add(coi);

		}

		return patients;
	}
}
