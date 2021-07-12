import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Test 
{
    JMenuBar mb;
    JFrame f;
    JMenu m1,m2,m3,m4,m5;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28;
    
    public Test()
    {
    	f=new JFrame("Notepad");
    	mb=new JMenuBar();
    	
    	m1=new JMenu("File");
    	m2=new JMenu("Edit");
    	m3=new JMenu("Format");
    	m4=new JMenu("View");
    	m5=new JMenu("Help");
    	
    	i1=new JMenuItem("New");
    	i2=new JMenuItem("New Window");
    	i3=new JMenuItem("Open");
    	i4=new JMenuItem("Save");
    	i5=new JMenuItem("Save As");
    	i6=new JMenuItem("Page Setup");
    	i7=new JMenuItem("Print");
    	i8=new JMenuItem("Exit");
    	i9=new JMenuItem("Undo");
    	i10=new JMenuItem("Cut");
    	i11=new JMenuItem("Copy");
    	i12=new JMenuItem("Paste");
    	i13=new JMenuItem("Delete");
    	i14=new JMenuItem("Search With Bing");
    	i15=new JMenuItem("Find");
    	i16=new JMenuItem("Find Next");
    	i17=new JMenuItem("Find Previous");
    	i18=new JMenuItem("Replace");
    	i19=new JMenuItem("Go To");
    	i20=new JMenuItem("Select All");
    	i21=new JMenuItem("Time/Date");
    	i22=new JMenuItem("Word Wrap");
    	i23=new JMenuItem("Font");
    	i24=new JMenuItem("zoom");
    	i25=new JMenuItem("Status Bar");
    	i26=new JMenuItem("View Help");
    	i27=new JMenuItem("Send Feedback");
    	i28=new JMenuItem("About Note Pad");
    	
    	m1.add(i1);
    	m1.add(i2);
    	m1.add(i3);
    	m1.add(i4);
    	m1.add(i5);
    	m1.addSeparator();
    	m1.add(i6);
    	m1.add(i7);
    	m1.addSeparator();
    	m1.add(i8);
    	m2.add(i9);
    	m2.add(i10);
    	m2.add(i11);
    	m2.add(i12);
    	m2.add(i13);
    	m2.addSeparator();
    	m2.add(i14);
    	m2.add(i15);
    	m2.add(i16);
    	m2.add(i17);
    	m2.add(i18);
    	m2.add(i19);
    	m2.addSeparator();
    	m2.add(i20);
    	m2.add(i21);
    	m3.add(i22);
    	m3.add(i23);
    	m4.add(i24);
    	m4.add(i25);
    	m5.add(i26);
    	m5.add(i27);
    	m5.addSeparator();
    	m5.add(i28);
    	
    	mb.add(m1);
    	mb.add(m2);
    	mb.add(m3);
    	mb.add(m4);
    	mb.add(m5);
    	
    	f.setJMenuBar(mb);
    	f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
    	
 	
    }
    public static void main(String[] args) {
		new Test();
	}
    
}

