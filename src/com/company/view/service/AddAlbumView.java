package com.company.view.service;

import com.company.controller.AlbumController;

import java.util.Scanner;

public class AddAlbumView {
    Scanner sc = new Scanner(System.in);
    AlbumController albumController = new AlbumController();
    public AddAlbumView(){
        System.out.println("======Th�m B�i H�t======");
        System.out.println("Nhap t�n Album: ");
        String name = sc.nextLine();
        System.out.println("Nhap t�n Ca Si Album: ");
        String casi = sc.nextLine();
//        AlbumDTO albumDTO = new AlbumDTO(name, casi);
//        albumController.writeToAlbum(albumDTO);
//albumController.showListAlbum();
    }
}
