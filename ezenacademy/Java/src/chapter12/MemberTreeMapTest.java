package chapter12;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		// ȸ�� ���̵� ������ ������� ȸ�� �߰�
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.showAllMember();
		// TreeMap ������ ���� �ڵ� ���ĵǾ� ���
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
	}
}