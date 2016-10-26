package me.hdnerd.calc;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	static Point mouseDownCompCoords;
	boolean extended = false;
	private String title = "Calculus Redefined 1.2";
	
	public Frame() {

		if (!extended) {
			int width = 320;
			int height = 530;
			setMaximumSize(new Dimension(320, 570));
			setSize(width, height);
		} else {
			int width = 600;
			int height = 400;
			setSize(width, height);
		}

		SetAll();
		setVisible(true);
	}

	void SetAll() {
		add(HPanel.pnl);
		setJMenuBar(HMenu.menubar);
		setUndecorated(true);
		setResizable(false);
		setTitle(title);
		setLocation(10, 10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HButtonEvents.Buttonevents();
		HMenu.Menu();
		ButtonBackground.SetBackgrounds();
		AddButtonsToPanel.addbuttons();
		Hinputoutput.InputOutput();
		HPanel.Panel();
		HButtons.SpecialButtonbounds();
		HButtons.Buttonbounds();
		Mousel();
		addKeyListener(new KEYL());
	}

	void Mousel() {
		mouseDownCompCoords = null;
		addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				mouseDownCompCoords = null;
			}

			public void mousePressed(MouseEvent e) {
				mouseDownCompCoords = e.getPoint();
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});

		addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {
			}
			public void mouseDragged(MouseEvent e) {
				Point currCoords = e.getLocationOnScreen();
				setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
			}
		});
	}
}
