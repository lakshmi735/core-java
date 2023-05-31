package com.xworkz.serializableapp.comparator;

import java.util.Comparator;

import com.xworkz.serializableapp.dto.PatientDTO;

public class ageComparator implements Comparator<PatientDTO> {

		@Override
		public int compare(PatientDTO o1, PatientDTO o2) {
			return o1.getId()-o2.getId();
		}

	}


