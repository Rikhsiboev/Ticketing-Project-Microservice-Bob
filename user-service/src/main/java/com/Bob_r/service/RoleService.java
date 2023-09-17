package com.Bob_r.service;

import com.Bob_r.dto.RoleDTO;
import com.Bob_r.exception.UserServiceException;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id) throws UserServiceException;
}
