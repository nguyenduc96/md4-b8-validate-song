package com.nguyenduc.service;

import com.nguyenduc.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    Page<Song> findAll(Pageable pageable);

    Song findById(Long id);

    void save(Song song);

    void delete(Long id);
}
