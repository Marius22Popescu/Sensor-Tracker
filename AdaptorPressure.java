package sensor;

public class AdaptorPressure implements SensorInterface{

	private double sensorValue;
	private String sensorMessage;
	//create the object from the class that need to be adapted
	PressureSensor ps = new PressureSensor();

	public double getSensorValue() {
			sensorValue = ps.readValue();
		return sensorValue;
	}

	public String getSensorMessage() {
			sensorMessage = ps.getReport();
		return sensorMessage;
	}	
}
