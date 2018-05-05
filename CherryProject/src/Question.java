
public class Question {
	String question = new String();
	String optionA = new String();
	String optionB = new String();
	String optionC = new String();
	String optionD = new String();
	int answer;
	Question(String _question,String _optionA,String _optionB,
			String _optionC,String _optionD,int _answer){
		question = _question;
		optionA = _optionA;
		optionB = _optionB;
		optionC = _optionC;
		optionD = _optionD;
		answer = _answer;
	}
	public String getQuestion() {
		return question;
	}
	public String getOptionA() {
		return optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public int getAnswer() {
		return answer;
	}
	public boolean isTrue(int ans)
	{
		if(answer==ans)
			return true;
		else return false;
	}
}
