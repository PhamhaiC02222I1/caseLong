package com.company.controller;

import com.company.dto.AlbumDTO;
import com.company.model.Album;
import com.company.service.Album.IAlbumServiceIMPL;
import com.company.service.Song.ISongServiceIMPL;

import java.util.List;

public class AlbumController {
    IAlbumServiceIMPL iAlbumServiceIMPL = new IAlbumServiceIMPL();
//    ISongServiceIMPL iSongServiceIMPL = new ISongServiceIMPL();
    public List<Album> showListAlbum(){
        return iAlbumServiceIMPL.findAll();
    }

    public void writeToAlbum(Album album){

//        int id;
//        if (IAlbumServiceIMPL.albumList.size()==0){
//            id = 1;
//        }else {
//            id = IAlbumServiceIMPL.albumList.get(IAlbumServiceIMPL.albumList.size()-1).getId()+1;
//        }




        iAlbumServiceIMPL.save(album);
        iAlbumServiceIMPL.findAll();
    }
}
