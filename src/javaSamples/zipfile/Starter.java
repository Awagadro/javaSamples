package javaSamples.zipfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Starter {

	public static void main(String[] args) throws IOException {
		readZip();

	}

	private static void readZip() throws IOException {

		ZipFile zf = new ZipFile("ziptest.zip");

		zf.stream().forEach(new MyZip(zf));
	}
}

class MyZip implements Consumer<ZipEntry> {
	private ZipFile zf;

	public MyZip(ZipFile zf) {
		this.zf = zf;
	}

	@Override
	public void accept(ZipEntry ze) {
		try {
			System.out.println("Enyry: " + ze.getName());
			if (!ze.isDirectory()) {
				BufferedReader br = new BufferedReader(new InputStreamReader(zf.getInputStream(ze)));
				String line = null;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
				System.out.println("------------->>>");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}