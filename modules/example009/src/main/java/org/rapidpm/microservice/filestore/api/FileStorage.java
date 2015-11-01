package org.rapidpm.microservice.filestoredemo.api;


import java.io.FileNotFoundException;

/**
 * Created by b.bosch on 13.10.2015.
 */
public interface FileStorage {

    void archiveFile(FileStoreServiceMessage message);

    boolean isFileArchived(String filename);

    String getFileFromArchive(String filename) throws FileNotFoundException;
}


