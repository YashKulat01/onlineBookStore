/**
 *  AUTHOR:-> YASH KULAT;
 */

package com.book_next.servicesImpls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.book_next.services.FileService;

/**
 *  THIS IS FILE SERVICE IMPLEMENTATION CLASS;
 */

@Service
public class FileServiceImpl implements FileService{

	@Override
	public String uploadFile(MultipartFile file, String path) {

		String originalFileName = file.getOriginalFilename();
		
		String extension = originalFileName.substring(originalFileName.lastIndexOf('.'));
		
		String fileName = UUID.randomUUID().toString();
		
		String newFileName = fileName + extension;
		
		File folder = new File(path);
		
		if (!folder.exists()) {
			folder.mkdirs();
		}
		
		try {
			Files.copy(file.getInputStream(), Paths.get(path, newFileName));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return newFileName;
	}

	@Override
	public InputStream getResource(String path, String name) {

		FileInputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream(path + name);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return inputStream;
	}

}
