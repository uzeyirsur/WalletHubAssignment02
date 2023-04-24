package com.wallethub.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class WordReader {

    private String filePath;

    public WordReader(String filePath) {
        this.filePath = filePath;
    }

    public String readText() throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        XWPFDocument document = new XWPFDocument(file);

        String text = "";
        for (XWPFParagraph para : document.getParagraphs()) {
            text += para.getText() + "\n";
        }

        document.close();

        return text;
    }
}
