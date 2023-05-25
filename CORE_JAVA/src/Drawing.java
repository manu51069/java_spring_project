
public class Drawing {


	public static void main(String[] args) {


		Drawable d1=(papersize, tool, Image) -> {
			System.out.println(Image+"is drawn");

		};
		d1.drawByUsing("A4","" ,"Graph");
		d1.drawByUsing("A4","" ,"Pie Chart");
		d1.drawByUsing("A4","" ,"Line");
		d1.drawByUsing("A4","" ,"Bar Chart");
		d1.drawByUsing("A4","" ,"Potrait");
	}
}

