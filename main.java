class main {
	public static void main(String[] args) {
		int rounds = 0;
		GameMethods v1 = new GameMethods();
		v1.matrixdevbig();
		GameHelper m1 = new GameHelper();
		for (int i = 0; i < 10; i++) {
			rounds+=v1.boommethod(m1.getUserInput());
		}
		System.out.println("__"+rounds+"__");
	}
}