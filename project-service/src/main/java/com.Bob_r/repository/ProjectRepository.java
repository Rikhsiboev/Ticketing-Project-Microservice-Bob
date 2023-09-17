package com.Bob_r.repository;


import com.Bob_r.entity.Project;
import com.Bob_r.entity.User;
import com.Bob_r.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project findByProjectCode(String code);
    List<Project> findAllByAssignedManager(User manager);

    List<Project> findAllByAssignedManagerId(Long managerId);

    List<Project> findAllByProjectStatusIsNot(Status status);

}
