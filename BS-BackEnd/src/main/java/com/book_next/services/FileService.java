/**
 *  AUTHOR:-> YASH KULAT;
 */
package com.book_next.services;

import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

/**
 *  THIS IS FILE SERVICE INTERFACE
 */
public interface FileService {
	
	String uploadFile (MultipartFile file, String path);
	
	InputStream getResource(String path, String name);
}
