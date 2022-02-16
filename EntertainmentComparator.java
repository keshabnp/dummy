package com.keshab.carsearch.comparators;

import java.util.Comparator;

import com.keshab.carsearch.model.Entertainment;

public class EntertainmentComparator implements Comparator<Entertainment> {

	@Override
	public int compare(Entertainment o1, Entertainment o2) {
		boolean i = o1.getAudioSystem().equals(o2.getAudioSystem());
		if (Boolean.TRUE.equals(i))
			return 0;
		else
			return 1;
	}

}
