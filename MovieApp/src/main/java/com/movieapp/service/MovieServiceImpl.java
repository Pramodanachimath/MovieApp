package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService {

	@Override
	public List<String> getByType(String type) {
		if (type.equals("comedy")) {
			return Arrays.asList("TarlenannaMaga", "Adyaksha", "Victory", "RajVishnu");
		} else if (type.equals("horror")) {
			return Arrays.asList("Aptarakshak", "Kanchana", "Utern", "Kabali");
		} else if (type.equals("action")) {
			return Arrays.asList("Robot", "Shivaji", "War", "Hulk");
		} else if (type.equals("thriller")) {
			return Arrays.asList("KGF", "Vikram", "Rangitaranga", "Om");
		} else if (type.equals("love")) {
			return Arrays.asList("Googly", "Love MockTail", "Diya", "MungaruMale");
		} else {
			return Arrays.asList("Drama", "SanvgolliRayanna", "KuruKhsetra", "Bahubali");
		}

	}

}
