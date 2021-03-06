package com.company.service.user_principal;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.UserPrincipal;

import java.util.List;

public class UserPrincipalServiceIMPL implements IUserPrincipalService{
    public static String PATH_USER_PRINCIPAL = ConfigReadAndWriteFile.PATH + "userprincipal.txt";
    public static List<UserPrincipal> userPrincipalList = new ConfigReadAndWriteFile<UserPrincipal>().readFromFile(PATH_USER_PRINCIPAL);
    @Override
    public List<UserPrincipal> findAll() {
        new ConfigReadAndWriteFile<UserPrincipal>().writeToFile(PATH_USER_PRINCIPAL,userPrincipalList);
        return userPrincipalList;
    }

    @Override
    public void save(UserPrincipal userPrincipal) {
        userPrincipalList.clear();
        userPrincipalList.add(userPrincipal);
    }
}
