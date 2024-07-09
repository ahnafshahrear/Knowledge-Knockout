public class QuestionsFactory {
    public Questions getQuestions(String topic) {
        if (topic.equals("Java")) {
            return new JavaQuestions();
        } else if (topic.equals("C++")) {
            return new CppQuestions();
        }
        return null;
    };
}
