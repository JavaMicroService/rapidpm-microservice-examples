package org.rapidpm.microservice.filestoredemo.impl;

import org.rapidpm.microservice.filestoredemo.api.FileStorage;
import org.rapidpm.microservice.filestoredemo.api.FileStoreServiceMessage;

/**
 * Created by b.bosch on 13.10.2015.
 */
public class FileStorageForLive implements FileStorage {
    @Override
    public void archiveFile(FileStoreServiceMessage message) {
        throw new RuntimeException("not implemented");
    }

    @Override
    public boolean isFileArchived(String filename) {
        throw new RuntimeException("not implemented");
    }

    @Override
    public String getFileFromArchive(String filename) {
        throw new RuntimeException("not implemented");
    }
}