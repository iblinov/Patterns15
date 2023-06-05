package by.epam.pattern.chainofresponsibility;

import java.util.List;

public class TextParserPrimitive {
    // req_ex -> for paragraph
    public void parseText(String text){
        ///
        List<String> paragraphs ;
        //for (int i = 0; i < ; i++){
        parseParagraph("");
        //}
        //
    }
    private void parseParagraph(String paragraph){
        ///
        List<String> sentences ;
      //  for (int i = 0; i < ; i++) {
        parseSentence("");
      //  }

    }
    private void parseSentence(String sentence){
        ///
        List<String> words;
        //  for (int i = 0; i < ; i++) {
        parseWord("");
        //  }
    }
    private void parseWord(String word){
        ///
        List<String> symbols;
//        for (int i = 0; i < ; i++) {
//
//        }
    }
}