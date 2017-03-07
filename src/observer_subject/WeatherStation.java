package observer_subject;

import observer_subject.subjectInterface.ForeCastObserver;
import observer_subject.subjectInterface.Subject;

public class WeatherStation 
{

	public static void main(String[] args) 
	{
		//���Ƚ���һ������
		DataSubject dataSubject = new DataSubject();
		
		//�۲���ע������
		CurrentConditionObserver currentConditionObserver = new CurrentConditionObserver(dataSubject);
		ForeCastObserver foreCastObserver = new ForeCastObserver(dataSubject);
		
		//����������� �۲����յ����ݸ���
		dataSubject.setMeasurementChanged(35.8f, 28, 14);
		
		dataSubject.remoceSubject(foreCastObserver);
		
		dataSubject.setMeasurementChanged(38.8f, 21, 19);

	}

}
