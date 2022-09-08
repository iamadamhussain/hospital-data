package dao;

public class TestMain {
	
	
	public static void main(String[] args) {
		HospitalDAO dao = new HospitalDAO();
		//Read:
		//read all hospital 
		dao.getAllHospitalData();
		
		//Update:
		//read hospital by id for updating the record
		//if you want update hospital data, pass  id(which you want to update)  in getHospitalDataById shown below
		HospitalDto hospitalDto=dao.getHospitalDataById(8765);
		hospitalDto.setRoomno("112");//change roomno which want to update
		dao.updateHospitalDataById(Integer.parseInt(hospitalDto.getRoomno()), hospitalDto.getId());
		
		//Delete:
		//read hospital by id for deleting the record
		//if you want delete hospital data pass the id(which you want to delete) given in getHospitalDataById below
		HospitalDto deleteHospitalDto=dao.getHospitalDataById(666);
		dao.deleteHospitalDataById(deleteHospitalDto.getId());
		
		
		//if want to insert new record,then change the setter value
		// UI data
				HospitalDto dto = new HospitalDto();
				dto.setId(662);
				dto.setPaitentName("Manju");
				dto.setPaitentAddress("jp nagar");
				dto.setAge("32");
				dto.setGender("Male");
				dto.setPhoneNumber("7769875489");
				dto.setHosiptalAddress("bangalore");
				dto.setHosiptalName("Jp Hosiptal");
				dto.setDoctorName("dr JP");
				dto.setRoomno("521");
				//passing the dto value  to insert
				dao.insertHospitalData(dto);
		
	}
}
