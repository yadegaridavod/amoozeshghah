package com.davod.amoozeshghah.mapper;

import com.davod.amoozeshghah.dto.RoleDto;
import com.davod.amoozeshghah.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleDto toRoleDto(Role role);
    Role toRole(RoleDto roleDto);

}