package com.myku.util.util;

import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlFormatUtil {
    static String[] list = {"p", "div", "span", "h1", "h2", "h3", "h4", "h5", "h6"};

    public static String getNewContent(String htmltext) {
        Document doc = Jsoup.parse(htmltext);
        Elements elements = doc.getElementsByTag("img");
        for (Element element : elements) {
            element.attr("width", "100%").attr("height", "auto");
        }

        for (int j = 0; j < list.length; j++) {
            Elements elements1 = doc.getElementsByTag(list[j]);
            for (Element element : elements1) {
                element.attr("style", "font-size:42px");
            }

        }

        Log.e("111111", doc.toString());
        return doc.toString();
    }
}
