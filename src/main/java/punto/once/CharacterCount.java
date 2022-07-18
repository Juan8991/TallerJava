package punto.once;

public class CharacterCount {
    Integer contA=0;
    Integer contE=0;
    Integer contI=0;
    Integer contO=0;
    Integer contU=0;

    public Integer getContA() {
        return contA;
    }

    public Integer getContE() {
        return contE;
    }

    public Integer getContI() {
        return contI;
    }

    public Integer getContO() {
        return contO;
    }

    public Integer getContU() {
        return contU;
    }

    public void countCharacter(String text){

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                contA++;
            }else if(text.charAt(i) == 'e' || text.charAt(i) == 'E'){
                contE++;
            }else if(text.charAt(i) == 'i' || text.charAt(i) == 'I'){
                contI++;
            }else if(text.charAt(i) == 'o' || text.charAt(i) == 'O'){
                contO++;
            }else if(text.charAt(i) == 'u' || text.charAt(i) == 'U'){
                contU++;
            }
        }
    }
}
