/**
 * 
 */
package observer_subject;

import observer_subject.subjectInterface.DisplayElement;
import observer_subject.subjectInterface.Observer;
import observer_subject.subjectInterface.Subject;

/**
 * @author Administrator
 * ��ǰ�����۲���
 *
 */
public class CurrentConditionObserver implements Observer, DisplayElement
{
    private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	private Subject dataSubject;
	
	/**
	 * ��ÿ���۲����� �Ĺ��췽����
	 * ע������
	 * @param dataSubject
	 */
	public CurrentConditionObserver(Subject dataSubject)
	{
		this.dataSubject = dataSubject;
		this.dataSubject.registerSubject(this);
	}

	@Override
	public void display() 
	{
		System.out.println("CurrentCondition: the temperature is " + temperature + ", the humidity is " + humidity + ", the pressure is " + pressure);
	}

	@Override
	public void update(float tem, float humidity, float pressure) 
	{
		this.temperature = tem;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

}
