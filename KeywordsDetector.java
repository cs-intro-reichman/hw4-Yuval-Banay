public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        //saves a original array of the sentences
        String[] originSent = new String[sentences.length];
        for (int i = 0; i < sentences.length; i++) originSent[i] = sentences[i];

        //change keywords and sentences strings to lower case
        for (int a = 0; a < keywords.length; a++) keywords[a] = MyString.lowerCase(keywords[a]);
        for (int b = 0; b < sentences.length; b++) sentences[b] = MyString.lowerCase(sentences[b]);

        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if (MyString.contains(sentences[i], keywords[j])) {
                    System.out.println(originSent[i]);
                }
            }
        }
    }
}
