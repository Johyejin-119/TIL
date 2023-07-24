package ch18;
// �̱�������

public class Company { 
	// �ϳ��� �ν��Ͻ��� �����ϵ���, ������ ��ü
	private static Company instance = new Company();
	
	// ����Ʈ �����ڸ� �����Ϸ��� �⺻ ������ �������ֱ� ������, public class Company {}; �̷��� �θ� �ܺο��� �״�� ��밡�� => private�� �����
	private Company() {}
	
	// �ν��Ͻ��� �����ϰ� ��, �Ʒ� �޼ҵ带 ȣ���� �� ���� => static���� ���� => �ܺο��� Ŭ�����̸����� �ش� �޼ҵ� ȣ�� ����
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
