package com.company.view.service;

import com.company.model.Role;
import com.company.model.RoleName;
import com.company.model.UserPrincipal;
import com.company.service.user_principal.UserPrincipalServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Navbar {
    public Navbar(){

            if (UserPrincipalServiceIMPL.userPrincipalList.size() == 0) {
                new LoginView();
            }
            List<UserPrincipal> userPrincipalList = UserPrincipalServiceIMPL.userPrincipalList;
            boolean checkLogin = false;
            Set<Role> roleSet = userPrincipalList.get(0).getRoleSet();
            List<Role> roleList = new ArrayList<>(roleSet);
            boolean checkAdmin = roleList.get(0).getName() == RoleName.ADMIN;
            Scanner sc = new Scanner(System.in);
            System.out.println("=================== MY NAVBAR ==================");
            if (userPrincipalList.size() != 0) {
                checkLogin = true;
            } else {
                checkLogin = false;
            }
            if (!checkLogin) {
                System.out.println("1. Register");
                System.out.println("2. Login");
            } else {

                System.out.println("3. Show List Role");

                System.out.println("5. My Profile");

                System.out.println("6. Add Album");

                System.out.println("7. Show List Album");

                if (checkAdmin) {
                    System.out.println("4. Show List User");
                }
            }


            int chooseMenu = sc.nextInt();
            switch (chooseMenu) {
                case 1:
                    new RegisterView();
                    break;
                case 2:
                    new LoginView();
                    break;
                case 3:
                    new RoleView().showListRole();
                    break;
                case 4:
                    if (checkAdmin) {
                        new ListUserView();
                        break;
                    } else {
                        System.out.println("You have not permission! ");
                        new Navbar();
                    }

                case 5:
                    new ProfileView();
                    break;
                case 6:
                    new AddAlbumView();
                    break;
                case 7:
                    new ListAlbum();
                    break;
            }


    }

    public static void main(String[] args) {
        new RegisterAndLoginView();
    }
}
