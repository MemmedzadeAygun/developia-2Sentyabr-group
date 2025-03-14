package az.developia.spring_project.controller;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "/files")
@CrossOrigin(origins = "*")
public class FileRestController {

	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

	public void upload(@RequestParam(name = "file") MultipartFile file) throws Exception {

		// Get stream from file
		InputStream stream = file.getInputStream();

		// Get file original name
		// Saleh.png
		String originalFilename = file.getOriginalFilename();

		// Create random name
		UUID uuid = UUID.randomUUID();
		String randomName = uuid.toString(); // rewrwerwerwe-rwerwerwerwer

		// Get file original name without extension
		String fileNameWithoutExtension = originalFilename.substring(0, originalFilename.lastIndexOf('.'));

		// File random name for saving on disk
		String fileRandomName = originalFilename.replace(fileNameWithoutExtension, randomName);

		// Save file to disk
		File folder = new File("C:/java13");
		if (!folder.exists()) {
			folder.mkdir();
		}

		Files.copy(stream, Paths.get("C:/java13" + "/" + fileRandomName), StandardCopyOption.REPLACE_EXISTING);

	}
}
