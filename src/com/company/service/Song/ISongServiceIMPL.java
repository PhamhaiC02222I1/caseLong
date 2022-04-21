package com.company.service.Song;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Song;

import java.util.List;

public class ISongServiceIMPL implements ISongService {
    public static String PATH_SONG = ConfigReadAndWriteFile.PATH+"song.txt";
    public static List<Song> songList = new ConfigReadAndWriteFile<Song>().readFromFile(PATH_SONG);
    @Override
    public List<Song> findAll() {
        new ConfigReadAndWriteFile<Song>().writeToFile(PATH_SONG, songList);
        return songList;
    }



    @Override
    public void save(Song song) {
        songList.add(song);
        new ConfigReadAndWriteFile<Song>().writeToFile(PATH_SONG, songList);
    }




}
