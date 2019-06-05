package com.xworkz.maven;

public class LodgeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LoadgDTO dto=new LoadgDTO();
		
		dto.setLname("Suresh");
		dto.setLocation("Hebbal");
		dto.setNoOfPersons(12);
		dto.setPx(2);
		dto.setRoomNo(101);
		
		LodgeDAO dao=new LodgeDAO();
		
		dao.save(dto);
	}

}
