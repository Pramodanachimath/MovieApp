package com.movieapp.service;

import java.util.List;

public interface IMovieService {

  List<String> getByType(String type);
}
