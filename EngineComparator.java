package com.keshab.carsearch.comparators;

import java.util.Comparator;
import com.keshab.carsearch.model.Engine;

public class EngineComparator implements Comparator<Engine> {

	@Override
	public int compare(Engine e1, Engine e2) {
		Integer i = Integer.compare(e1.getCylinder(), e2.getCylinder());
		if (i != 0)
			return i;
		i = Integer.compare(e1.getManualClaimedFE(), e2.getManualClaimedFE());
		if (i != 0)
			return i;
		return 0;
	}

}
