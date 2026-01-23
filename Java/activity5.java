package Java;

public class activity5 {

	public static void main(String[] args) {
		
		String title = "Art of management";
		
		MyBook newNovel = new MyBook();
		newNovel.setTitle(title);
		System.out.println("The title is: " + newNovel.getTitle());
	}

}
