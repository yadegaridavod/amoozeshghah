package com.davod.amoozeshghah.mapper;

import com.davod.amoozeshghah.dto.AccountDto;
import com.davod.amoozeshghah.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDto toAccountDto(Account account);
    Account toEntity(AccountDto accountDto);
}