import java.util.Scanner;

public class Photoshop {

	void open(File f) {
		f.displayInfo();
	}

	public static void main(String[] args) {
		Photoshop p = new Photoshop();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fname = scan.next();
		System.out.println("Enter the file extension");
		String fextn = scan.next();
		System.out.println("Enter the file size");
		double fsize = scan.nextDouble();
		JpegFile j = new JpegFile(fname,fextn,fsize);
		p.open(j);
	}
}

class File{
	String filename, extension;
	double size;

	File(String filename, String extension, double size){
		this.filename = filename;
		this.extension = extension;
		this.size = size;
	}

	void displayInfo() {
		System.out.println("Filename: " + this.filename);
		System.out.println("Extension: " + this.extension);
		System.out.println("File Size: " + this.size + "kb");
	}
}

class JpegFile extends File{

	JpegFile(String filename, String extension, double size) {
		super(filename, extension, size);
	}}
class PdfFile extends File{

	PdfFile(String filename, String extension, double size) {
		super(filename, extension, size);
	}}
class TextFile extends File{

	TextFile(String filename, String extension, double size) {
		super(filename, extension, size);
	}}

