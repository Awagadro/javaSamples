package javaSamples.blinov.ch9.io.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializator {
	public boolean serealization(ObjectStudent so, String fileName) {
		boolean flag = false;
		File f = new File(fileName);
		try (FileOutputStream fos = new FileOutputStream(f); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(so); // сериализация
			flag = true;
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return flag;
	}

	public ObjectStudent deserialization(String fileName) throws InvalidObjectException {
		File fr = new File(fileName);
		try (FileInputStream fis = new FileInputStream(fr); ObjectInputStream ois = new ObjectInputStream(fis);) {
			ObjectStudent so = (ObjectStudent) ois.readObject(); // десериализация
			return so;
		} catch (ClassNotFoundException e) {
			System.err.println("Класс не существует" + e);
		} catch (FileNotFoundException e) {
			System.err.println("Файл не существует" + e);
		} catch (InvalidClassException e) {
			System.err.println("Несовпадение версий классов" + e);
		} catch (IOException e) {
			System.err.println("Общая I/O ошибка" + e);
		}
		throw new InvalidObjectException("Объект не восстановлен");
	}

}
