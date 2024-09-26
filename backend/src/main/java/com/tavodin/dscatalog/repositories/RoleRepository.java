package com.tavodin.dscatalog.repositories;

import com.tavodin.dscatalog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
