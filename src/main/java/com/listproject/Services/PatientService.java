package com.listproject.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.listproject.DbUtility.DbUtility;
import com.listproject.patientinfo.PatientInfo;

public class PatientService {

	public List<PatientInfo> getPatientInfo() throws Exception {

		Connection con = DbUtility.getConnection();

		Statement str = con.createStatement();

		String sql = "select * from Patients";

		ResultSet rs = str.executeQuery(sql);

		List<PatientInfo> patients = new ArrayList<PatientInfo>();

		while (rs.next()) {

			PatientInfo coi = new PatientInfo();

			coi.setId(rs.getString("id"));
			coi.setName(rs.getString("name"));
			coi.setAddress(rs.getString("address"));
			coi.setAge(rs.getString("age"));
			coi.setDoB(rs.getString("doB"));
			patients.add(coi);

		}

		return patients;
	}

	public PatientInfo getPatientById(String id) throws Exception {

		Connection con = DbUtility.getConnection();

		Statement st = con.createStatement();

		String sql = "Select * from Patients where id= " + id;

		ResultSet rs = st.executeQuery(sql);

		PatientInfo pti = new PatientInfo();

		while (rs.next()) {
			int custId = rs.getInt("id");

			pti.setId(custId + "");

			pti.setName(rs.getString("name"));

			pti.setAddress(rs.getString("address"));

			pti.setAge(rs.getString("age"));

			pti.setDoB(rs.getString("doB"));

		}
		return pti;
	}

	public PatientInfo updatePatients(PatientInfo pa) throws Exception {
		Connection con = DbUtility.getConnection();

		Statement str = con.createStatement();
		String sql = "update Patients set name= '" + pa.getName() + "', address='" + pa.getAddress() + "', age='"
				+ pa.getAge() + "', doB='" + pa.getDoB() + "' " + "'where id=" + pa.getId() + "'";

		str.executeUpdate(sql);

		return pa;
	}
}
