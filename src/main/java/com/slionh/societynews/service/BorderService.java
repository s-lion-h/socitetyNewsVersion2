package com.slionh.societynews.service;

import com.slionh.societynews.entity.Border;

import java.util.List;

public interface BorderService {
    List<Border> listBorder(Integer count);

    int addBorder(Border border);
}
