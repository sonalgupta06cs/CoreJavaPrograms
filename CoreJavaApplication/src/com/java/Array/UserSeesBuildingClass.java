package com.java.Array;

import java.util.ArrayList;
import java.util.List;

public class UserSeesBuildingClass {

	public static void main(String[] args) {

		int buildings[] = new int[] { 5, 7, 4, 9, 3, 10 };

		List<Integer> intBuildingList = new ArrayList<>();
		int max = 0;

		//intBuildingList.add(buildings[0]);

		for (int i = 0; i < buildings.length ; i++) {
			if (buildings[i] > max) {
				
				max = buildings[i];
				intBuildingList.add(max);
			} 
			
		}

		System.out.println(intBuildingList);

	}

}
