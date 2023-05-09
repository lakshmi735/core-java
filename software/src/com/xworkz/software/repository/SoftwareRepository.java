package com.xworkz.software.repository;


import com.xworkz.software.dto.SoftwareDTO;

public interface SoftwareRepository {
	abstract boolean onSave(SoftwareDTO dto);
	abstract boolean onRead(int id);
	abstract boolean onUpdate(int id);
	abstract boolean onDelete(int id);

}
