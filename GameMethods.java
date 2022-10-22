import java.util.*;

public class GameMethods {
	private int data_figures = 0;
	private static int figures_all = 5;
	public List<ArrayList<Integer>> matrix = new ArrayList<>();
	private void devmatrix() {
		ArrayList<Integer> m_1 = new ArrayList<Integer>();
		m_1.add((int) (Math.random() * 10));
		for (int i = 1; i < 3; i++) {
			m_1.add(m_1.get(i-1)+1);
		}
		matrix.add(m_1);
	}
	public void matrixdevbig() {
		for (int i = 0; i < 10; i++) {
			if (figures_all == data_figures) {
				break;
			}
			int rand_res = (int) (Math.random() * 1);
			if (rand_res == 0) {
				devmatrix();
			}
			data_figures++;
		}
	}
	public int boommethod(String data_text) {
		int b = 0;
		String [] num_str = data_text.split(" ");
      	int sys_int = Integer.parseInt(num_str[0])-1;
      	int sys_int_1 = Integer.parseInt(num_str[1])-1;
      	if (matrix.get(sys_int).contains(sys_int_1)) {
      		ArrayList<Integer> matrix_sys = matrix.get(sys_int);
      		matrix.get(sys_int).remove(matrix_sys.indexOf(sys_int_1));
      		b = 1;
      	}
      	System.out.println(b);
		return b;
	}

}