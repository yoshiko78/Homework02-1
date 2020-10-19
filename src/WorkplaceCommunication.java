public class WorkplaceCommunication implements Communication {
	public void greet() {
		
		String str = "";
		switch(str) {
		case "family":
			System.out.println("おはよう");
			break;
		case "friend":
			System.out.println("久しぶり");
			break;
		case "president":
			System.out.println("おはようございます、社長");
			break;
		case "isworkplace":
			System.out.println("お疲れ様!");
			break;
		default:
			System.out.println("初めてお会いします、吉田奈々です。");
			break; }
		}
	public static void main(String[] args) throws WorkplaceException {
		Communication object1 = new WorkplaceCommunication();
		try {
		object1.greet();}
		catch (WorkplaceException e) {
			System.out.println("予期しないエラーが発生しました");}
	}
}