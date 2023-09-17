package com.Bob_r.service;

import com.bob_r.dto.RoleDTO;
import com.bob_r.exception.UserServiceException;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id) throws UserServiceException;
}
