package score_graph;

import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class mainUI extends JFrame {
	Font mainFont = new Font("Gulim", Font.BOLD, 18);
	static JComboBox<String> loadCBox;
	static ArrayList<String> result; // 콤보박스에 있는 이름
	static String mainSavePath = "C:\\"; // 기본 저장 폴더 경로
	static DefaultComboBoxModel<String> comboModel;

	mainUI() {
		setTitle("Score Management");
		Container c = getContentPane();
		setLayout(null);

//		Main이미지
		JLabel mainImg = new JLabel("mainIMG 들어갈 곳");
		mainImg.setBounds(10, 10, 310, 110);
		mainImg.setHorizontalAlignment(SwingConstants.CENTER);
//		Label 테두리
		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		mainImg.setBorder(border);
		c.add(mainImg);

//		로딩 콤보박스
		result = new ArrayList<String>();

		String[] modelList = new String[result.size()];
		result.toArray(modelList);
		comboModel = new DefaultComboBoxModel<>(modelList);

		loadCBox = new JComboBox<>(comboModel);
		loadCBox.setSelectedItem(null);
		loadCBox.setBounds(10, 130, 150, 50);
		c.add(loadCBox);

//		'Export Data'버튼
		JButton dataExportB = new ButtonShape("Export Data");
		dataExportB.setBounds(170, 130, 150, 50);
		dataExportB.setFont(mainFont);
		c.add(dataExportB);

//		'Data' 버튼
		JButton editButton = new ButtonShape("Data");
		editButton.setBounds(350, 70, 150, 50);
		editButton.setFont(mainFont);
		c.add(editButton);

//		'Regist' 버튼
		JButton registButton = new ButtonShape("Regist");
		registButton.setBounds(350, 10, 150, 50);
		registButton.setFont(mainFont);
		registButton.setBorder(new LineBorder(Color.black));
		c.add(registButton);

//		'View Graph' 버튼
		JButton graphButton = new ButtonShape("View Graph");
		graphButton.setBounds(350, 130, 150, 50);
		graphButton.setFont(mainFont);
		c.add(graphButton);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(530, 240);
		setVisible(true);

	}

	public static void main(String[] args) {
		mainUI main = new mainUI();
		main.setLocationRelativeTo(null);
	}

}
