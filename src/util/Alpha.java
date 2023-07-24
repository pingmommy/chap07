package util;


public class Alpha {
	
	static int count;
	protected int line;   //자식 객체는 접근할 수 있다. protected
	protected int column;
	protected Color fg;
	protected Color bg;
	protected char ch;
	
	public Alpha() {
		line = (int)(Math.random()*20 + 1);
		column = (int)(Math.random()*40 + 1);

		do {
			fg = Color.values()[(int)(Math.random()*8)];
			bg = Color.values()[(int)(Math.random()*8)];
		}while(fg==bg);
		//원래는 == 연산자를 쓸 수 없지만 enum은 상수이므로 그냥 쓴다.  
		
		ch=(char)(Math.random()*26+'A');
		
		System.out.printf("\033[%d;%dH",1,42);
		System.out.println(count);
		count++;
		
		
//		System.out.println(line);
//		System.out.println(column);
//		System.out.println(fg);
//		System.out.println(bg);
//		System.out.println(ch);
	}
	
		public void show() {
			VT100.cursorMove(line,column);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
//			System.out.println();
//			System.out.println("==========show==============");
//			System.out.println(line);
//			System.out.println(column);
//			System.out.println(fg);
//			System.out.println(bg);
//			System.out.println(ch);
		}
	
		public void hide() {
			VT100.cursorMove(line, column);
			
			//VT100.setForeground(fg);
			//VT100.setBackground(bg);
			VT100.reset();
			VT100.print('+');
//			VT100.reset();
//			System.out.println("=============hide=============");
//			System.out.println(line);
//			System.out.println(column);
//			System.out.println(fg);
//			System.out.println(bg);
//			System.out.println('+');

			
		}
		
		public int getLine() {
			return line;
		}

		public void setLine(int line) {
			this.line = line;
		}

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			this.column = column;
		}

		public Color getFg() {
			return fg;
		}

		public void setFg(Color fg) {
			this.fg = fg;
		}

		public Color getBg() {
			return bg;
		}

		public void setBg(Color bg) {
			this.bg = bg;
		}

		public char getCh() {
			return ch;
		}

		public void setCh(char ch) {
			this.ch = ch;
		}

		
		
		
		
	
	}
	
	
	


