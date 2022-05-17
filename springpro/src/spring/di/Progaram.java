package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;



public class Progaram {

	public static void main(String[] args) {
		
//		���������� �����ϴ� ������� �ڵ� ����
//		Exam exam = new NewLecExam();
//		ExamConsole console = new GridExamConsole(); //DI
//		
//		console.setExam(exam);
		
//		xml��� config�� �ҷ�����
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		jav��� config�� �ҷ�����
//		ApplicationContext context =
//				new AnnotationConfigApplicationContext(NewLecDiConfig.class);
		
//		������ id�� �ҷ�����
		ExamConsole console =(ExamConsole) context.getBean("console");
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
//		ExamConsole console =context.getBean(ExamConsole.class);
		console.print();

//		List<Exam> exams =new ArrayList<>();
//		exams.add(new NewLecExam(1,1,1,1));
		
//		xml���� ���� List �ҷ�����
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		for(Exam e : exams)
			System.out.println(e);
	}

}
