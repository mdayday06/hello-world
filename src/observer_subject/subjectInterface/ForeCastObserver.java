package observer_subject.subjectInterface;

/**
 * I am a observer, i just update the data
 * @author Administrator
 *
 */
public class ForeCastObserver implements Observer, DisplayElement 
{
    private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	private Subject dataSubject;
	
	public ForeCastObserver(Subject dataSubject)
	{
		this.dataSubject = dataSubject;
		this.dataSubject.registerSubject(this);
	}

	@Override
	public void display() 
	{
		System.out.println("next day, the temperature is " + (temperature > 36 ? "high" : "low") + "...");
	}

	@Override
	public void update(float tem, float humidity, float pressure) 
	{
		this.temperature = tem;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
	}

}
