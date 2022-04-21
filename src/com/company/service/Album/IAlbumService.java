package com.company.service.Album;

import com.company.model.Album;
import com.company.service.IServiceGeneric;


public interface IAlbumService extends IServiceGeneric<Album> {

    //    @Override
//    void save(Album album);

    Album finByAlbumName(Album album);
}
