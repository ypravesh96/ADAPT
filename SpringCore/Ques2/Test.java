package capgeminiAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Question question1=(Question) context.getBean("question1");
        Question question2=(Question) context.getBean("question2");
        
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(question1);
        questions.add(question2);

        ArrayList<String> list = new ArrayList();

        HashSet<String> hash= new HashSet();

         HashMap<String,String> hashMap= new HashMap();

        for(Question a: questions) {
        	list.add(a.answer);
        
        }
        for(Question b: questions) {
        	hash.add(b.answer);
        }
        
        for(Question c: questions) {
        	hashMap.put(c.question,c.answer);
        
        }
        
        System.out.println("Answers in form of List");
        System.out.println(list);
        
        System.out.println("Answers in form of set");
        System.out.println(hash);
        
        System.out.println("Answers in form of Map");
        System.out.println(hashMap);
        
        System.out.println("Printing all Question and answers");
        
        for(Question q: questions)
        {
        	System.out.println(q.getQuestionId()+"  "+q.getQuestion()+"\n"+q.getAnswers());
        }
         
	}

}
