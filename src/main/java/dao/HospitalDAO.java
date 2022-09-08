package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class HospitalDAO {

	public void insertHospitalData(HospitalDto dto) {
		
		Connection connection = JDBCConnection.getConnection();
		//step3:
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement("insert into hospital values(?,?,?,?,?,?,?,?,?,?)");

			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getPaitentName());
			pst.setString(3, dto.getPaitentAddress());
			pst.setInt(4, Integer.parseInt(dto.getAge()));
			pst.setString(5, dto.getGender());
			pst.setString(6, dto.getDoctorName());
			pst.setString(7, dto.getPhoneNumber());
			pst.setString(8, dto.getHosiptalName());
			pst.setString(9, dto.getHosiptalAddress());
			pst.setString(10, dto.getRoomno());
			// step4
			int count = pst.executeUpdate();
			System.out.println("--------Inserted one record-------------" + count);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void getAllHospitalData() {

		
		String selectQry = "select * from hospital";
		Connection connection = JDBCConnection.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(selectQry);

			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {

				HospitalDto dto = new HospitalDto();
				dto.setId(resultSet.getInt(1));
				dto.setPaitentName(resultSet.getString(2));
				dto.setPaitentAddress(resultSet.getString(3));
				dto.setAge(resultSet.getString(4));
				dto.setGender(resultSet.getString(5));
				dto.setPhoneNumber(resultSet.getString(6));
				dto.setHosiptalAddress(resultSet.getString(7));
				dto.setHosiptalName(resultSet.getString(8));
				dto.setDoctorName(resultSet.getString(9));
				dto.setRoomno(resultSet.getString(10));

				System.out.println("-------------all data--------------"+dto.toString());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateHospitalDataById(int roomNo, int id) {
		String updateQry = "update hospital set roomno=?  where id=?";
		Connection connection = JDBCConnection.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(updateQry);
			pstmt.setInt(1, roomNo);
			pstmt.setInt(2, id);
			int countofrows = pstmt.executeUpdate();
			System.out.println("---------record updated------------------"+countofrows);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteHospitalDataById(int deleteId) {
		String deleteQry = "delete from hospital where id=?";
		Connection connection = JDBCConnection.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(deleteQry);
			pstmt.setInt(1, deleteId);

			int countofrows = pstmt.executeUpdate();
			System.out.println("---------record deleted------------------"+countofrows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

public HospitalDto getHospitalDataById(int id) {
		
		HospitalDto dto=new HospitalDto();
		String selectQry="select * from hospital where id=?";
		Connection connection=JDBCConnection.getConnection();
		
		try {
			PreparedStatement pstmt =connection.prepareStatement(selectQry);
			pstmt.setInt(1, id);
		ResultSet resultSet=pstmt.executeQuery();
		while(resultSet.next())
		{
			dto.setId(resultSet.getInt(1));
			dto.setPaitentName(resultSet.getString(2));
			dto.setPaitentAddress(resultSet.getString(3));
			dto.setAge(resultSet.getString(4));
			dto.setGender(resultSet.getString(5));
			dto.setPhoneNumber(resultSet.getString(6));
			dto.setHosiptalAddress(resultSet.getString(7));
			dto.setHosiptalName(resultSet.getString(8));
			dto.setDoctorName(resultSet.getString(9));
			dto.setRoomno(resultSet.getString(10));						
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
}
}