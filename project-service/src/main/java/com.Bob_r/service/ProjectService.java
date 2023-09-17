package com.Bob_r.service;

import com.Bob_r.dto.ProjectDTO;
import com.Bob_r.entity.User;
import com.Bob_r.exception.*;

import java.util.List;

public interface ProjectService {

    ProjectDTO getByProjectCode(String code);

    List<ProjectDTO> listAllProjects();

    ProjectDTO save(ProjectDTO dto) throws ProjectServiceException;

    ProjectDTO update(ProjectDTO dto) throws ProjectServiceException;

    void delete(String code) throws ProjectServiceException;

    ProjectDTO complete(String projectCode) throws ProjectServiceException;

    List<ProjectDTO> listAllProjectDetails(String userName) throws ProjectServiceException;

    List<ProjectDTO> readAllByAssignedManager(User user);

    List<ProjectDTO> listAllNonCompletedProjects();
}
