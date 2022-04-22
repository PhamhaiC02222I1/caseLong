package com.company.view;

import com.company.controller.AlbumController;
import com.company.dto.AlbumDTO;
import com.company.model.Album;
import com.company.service.Album.IAlbumServiceIMPL;

import java.util.Scanner;

public class AddAlbumView {
    Scanner sc = new Scanner(System.in);
    AlbumController albumController = new AlbumController();
    public AddAlbumView(){
        int id;
        if (IAlbumServiceIMPL.albumList.size()==0){
            id = 1;
        }else {
            id = IAlbumServiceIMPL.albumList.get(IAlbumServiceIMPL.albumList.size()-1).getId()+1;
        }
        System.out.println("======Them Bai Hat======");
        System.out.println("Nhap ten Album: ");
        String name = sc.nextLine();
        System.out.println("Nhap ten Ca Si Album: ");
        String casi = sc.nextLine();
        System.out.println("Nhap hinh anh Album: ");
        String hinhanh = sc.nextLine();
        Album album=new Album(id,name,casi,hinhanh);
        albumController.writeToAlbum(album);
        System.out.println(albumController.showListAlbum());
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
