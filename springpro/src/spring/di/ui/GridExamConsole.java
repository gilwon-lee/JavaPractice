package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

//	(required = false) -> ��� ����
	@Autowired(required = false)
	@Qualifier("exam")
	private Exam exam;
	
	public GridExamConsole() {
		System.out.println("constructor");
	}
	
//	@Autowired
//	public GridExamConsole(@Qualifier("exam")Exam exam) {
//		System.out.println("over load");
//		this.exam = exam;
//	}
	
	@Override
	public void print() {
		if(exam ==null) {
			System.out.println("�ȳ�");
		}else {
		System.out.println("������������������������������������������");
		System.out.println("��  total  ��   avg   ��");
		System.out.println("������������������������������������������");
		System.out.printf("��   %3d   ��  %3.2f   ��\n",exam.total(),exam.avg());
		System.out.println("������������������������������������������");
		}
	}
	
	//@Autowired
	//@Qualifier("id") -> xml�� id�� �ҷ��� Bean Ư��
	//@Qualifier("exam")
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}
	
}
