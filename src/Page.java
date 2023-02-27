import java.util.ArrayList;

public class Page {
    private String text;
    private ArrayList<String> choices;
    private ArrayList<Page> nextPages;

    public Page(String pageText) {
        this.text = pageText;
        this.choices = new ArrayList<String>();
        this.nextPages = new ArrayList<Page>();
        
    }

    public void displayText(){
        System.out.println(text);
    }

    public void displayChoices(){
        System.out.println("Type the number for the choice you want >");

        for (int loc = 0; loc < choices.size(); loc = loc +1 ) {
            System.out.print(loc);
            String choice = choices.get(loc);
            System.out.println(". " + choice);
        }
    }

    public void addChoice(String choiceText, Page nextPage){
        choices.add(choiceText);
        nextPages.add(nextPage);

    }
}
