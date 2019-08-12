package javaSamples.zipout;

import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Starter {

	public static void main(String[] args) throws Exception {
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("zipout.zip"));

		ZipEntry ze1 = new ZipEntry("name1.txt");
		zos.putNextEntry(ze1);
		zos.write("Super 1".getBytes());

		ZipEntry ze2 = new ZipEntry("name2.txt");
		zos.putNextEntry(ze2);
		zos.write("Super 2".getBytes());

		zos.close();
	}

}
