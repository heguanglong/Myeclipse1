package Demo5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jisuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buju jpanel=new Buju();
        jpanel.initView("计算器布局");
	}

}
class Buju extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 定义面板
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p1_1 = new JPanel();
		JPanel p1_2 = new JPanel();
		JPanel p2_1 = new JPanel();
		JPanel p3 = new JPanel();
		JButton btn[] = new JButton[12];
		String[] str = { "Num", "/", "*", "1", "2", "3", "4", "5", "6", "7", "8",
				"9" };

		public void initView(String title) {

			// 创建一个窗体对象
			JFrame jFrame = new JFrame(title);

			// Center区域将会扩展并占据这个未用区域的位置
			jFrame.setLayout(new BorderLayout());

			// 面板 1.1(数字：1~9)
			p1_1.setLayout(new GridLayout(4, 3));
			for (int i = 0; i < 12; i++) {
				btn[i] = new JButton(str[i]);
				p1_1.add(btn[i]);
			}

			// 面板 1.2(数字：0,".")
			p1_2.setLayout(new BorderLayout());
			p1_2.add("Center", new JButton("0"));
			p1_2.add("East", new JButton("."));

			// 面板1(数字1~9，0，".")
			p1.setLayout(new BorderLayout());
			p1.add("Center", p1_1);
			p1.add("South", p1_2);

			// 面板2.1("+","Enter")
			p2_1.setLayout(new GridLayout(2, 1));
			p2_1.add(new JButton("+"));
			p2_1.add(new JButton("Enter"));

			// 面板2("-","+","Enter")
			p2.setLayout(new BorderLayout());
			p2.add("North", new JButton("-"));
			p2.add("Center", p2_1);

			// 面板3(面板1+面板2)
			p3.setLayout(new BorderLayout());
			p3.add("East", p2);
			p3.add("Center", p1);

			// JPanel随着JFrame的大小改变而改变
			jFrame.getContentPane().add(p3);

			// 窗体JFrame是否可以用鼠标拖动改变大小(true:可以，false:不可以)
			jFrame.setResizable(false);

			// 根据子组件的PreferredSize或Size及布局类型自动调节窗口大小
			jFrame.pack();
			//设置窗口初始大小
			jFrame.setSize(200,200);
			//设置初始位置
			jFrame.setLocation(300, 200);

			// 设置JFrame窗体是否可见
			jFrame.setVisible(true);

			// 设置窗体右上角关闭是否可用(具体看JDK的帮助文档)
			jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}

}
