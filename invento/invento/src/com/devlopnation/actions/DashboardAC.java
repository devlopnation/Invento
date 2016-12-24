package com.devlopnation.actions;

import java.util.ArrayList;

import com.devlopnation.users.dto.RightDTO;
import com.devlopnation.users.dto.RoleDTO;
import com.devlopnation.users.dto.UserDTO;

public class DashboardAC {
	
	private UserDTO userDTOObject;
	private RoleDTO roleDTOObject = userDTOObject.getRoleDTO();
	private ArrayList<RightDTO> rightList = roleDTOObject.getRightList();
	private String userName = userDTOObject.getUserName();
	
	public UserDTO getUserDTOObject() {
		return userDTOObject;
	}

	public void setUserDTOObject(UserDTO userDTOObject) {
		this.userDTOObject = userDTOObject;
	}

	
	public String execute() throws Exception {
		return "success";
		
	}

	public ArrayList<RightDTO> getRightList() {
		return rightList;
	}

	public void setRightList(ArrayList<RightDTO> rightList) {
		this.rightList = rightList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
