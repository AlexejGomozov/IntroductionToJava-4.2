package Task1_1.by.epam;

public class Sentence {

	 private String sentence;

     Sentence(String sentence) {
         this.sentence = sentence;
     }

 public String getSentence() {
     return sentence;
 }

 public void setSentence(String sentence) {
     this.sentence = sentence;
 }

 @Override
 public String toString() {
     return sentence;
 }
}
