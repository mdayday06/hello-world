/**
 * 
 */
package observer_subject.subjectInterface;

/**
 * @author Administrator
 * ������  ���ڶ��ġ�ȡ����֪ͨ�۲���
 *
 */
public interface Subject 
{
	/**
	 * ��������
	 * @param o
	 */
	void registerSubject(Observer o);
	
	/**
	 * ȡ������
	 * @param o
	 */
	
	void remoceSubject(Observer o);
	
	/**
	 * ֪ͨ�Ѷ��ĵĹ۲���
	 */
	void notifyObserver();

}
