package com.trinhtrung.library.service;

import com.trinhtrung.library.dto.AdminDto;
import com.trinhtrung.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}