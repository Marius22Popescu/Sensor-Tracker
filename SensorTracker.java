package sensor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
//This program will take the outputs from 3 sensors and will print out to the JFrame the value from the sensor and
//a message. The program will use the external library; it will adapting the sensors .class files. 
public class SensorTracker extends JFrame {
	
	public SensorTracker() {

	setTitle("Sensor Tracker");
	setLayout(new GridLayout(3,1));
	//create variable
	double tempValue;
	String tempReport;
	double pressValue;
	String pressReport;
	double radValue;
	String radReport;
	//create sensor objects
	AdaptorTemperature ts = new AdaptorTemperature();
	AdaptorPressure ps = new AdaptorPressure();
	AdaptorRadiation rs = new AdaptorRadiation();
	
	
	//create temperature panel	
	JPanel  temperaturePnl = new JPanel();
	tempReport = ts.getSensorMessage();
	tempValue = ts.getSensorValue();
	temperaturePnl.setBorder(new TitledBorder("Temperature Sensor ("+ tempReport + ") -->" + tempValue));
	if (tempValue < 235)
		temperaturePnl.setBackground(Color.GREEN);
	else if (tempValue <= 300)
		temperaturePnl.setBackground(Color.YELLOW);
	else
		temperaturePnl.setBackground(Color.RED);
	add(temperaturePnl);
	//create pressure panel
	JPanel  pressurePnl = new JPanel();
	pressReport = ps.getSensorMessage();
	pressValue = ps.getSensorValue();
	pressurePnl.setBorder(new TitledBorder("Pressure Sensor (" + pressReport + ") -->" + pressValue));
	if(pressValue < 5)
		pressurePnl.setBackground(Color.green);
	else if(pressValue <= 6.58)
		pressurePnl.setBackground(Color.YELLOW);
	else
		pressurePnl.setBackground(Color.RED);
	add(pressurePnl);	
	//create radiation panel
	JPanel  radiationPnl = new JPanel();
	radReport = rs.getSensorMessage();
	radValue = rs.getSensorValue();
	radiationPnl.setBorder(new TitledBorder("Radiation Report (" + radReport + ") -->" + radValue));
	if (radValue < 3)
		radiationPnl.setBackground(Color.GREEN);
	else if(radValue <= 4)
		radiationPnl.setBackground(Color.YELLOW);
	else
		radiationPnl.setBackground(Color.RED);
	add(radiationPnl);
	
	setPreferredSize(new Dimension(600,600));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	pack();	
	}
	//the main function
	public static void main(String[] args) {
		SensorTracker sensortraker = new SensorTracker();
	}
	
}
