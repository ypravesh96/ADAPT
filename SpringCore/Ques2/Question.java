

import java.util.List;

public class Question {
	int questionId;
	String question;
	String answer;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswers() {
		return answer;
	}
	public void setAnswers(String answer) {
		this.answer = answer;
	}
	
	public String printQuestions()
	{
		return "Question Id: "+this.getQuestionId()+"\nQuestion: "+this.getQuestion()+"\nAnswer: "+this.getAnswers();
	}

}
