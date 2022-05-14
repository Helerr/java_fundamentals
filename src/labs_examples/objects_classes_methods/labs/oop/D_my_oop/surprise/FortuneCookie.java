package labs_examples.objects_classes_methods.labs.oop.D_my_oop.surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise{
    private final String message;
    private static final ArrayList<String> quotes = new ArrayList<>(Arrays.asList("The way I see it, if you want the rainbow, you gotta put up with the rain.","Do all the good you can, for all the people you can, in all the ways you can, as long as you can." ,"Don’t settle for what life gives you; make life better and build something.","Everybody wants to be famous, but nobody wants to do the work. I live by that. You grind hard so you can play hard. At the end of the day, you put all the work in, and eventually it’ll pay off. It could be in a year, it could be in 30 years. Eventually, your hard work will pay off." ,"Everything negative – pressure, challenges – is all an opportunity for me to rise." ,"I like criticism. It makes you strong.","You never really learn much from hearing yourself speak.","Life imposes things on you that you can’t control, but you still have the choice of how you’re going to live through this.","Life is never easy. There is work to be done and obligations to be met – obligations to truth, to justice, and to liberty.","Live for each second without hesitation.","Life is like riding a bicycle. To keep your balance, you must keep moving.","Life is really simple, but men insist on making it complicated.","Life is a succession of lessons which must be lived to be understood.","Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven’t found it yet, keep looking. Don’t settle. As with all matters of the heart, you’ll know when you find it.","My mama always said, life is like a box of chocolates. You never know what you’re gonna get.","Watch your thoughts; they become words. Watch your words; they become actions. Watch your actions; they become habits. Watch your habits; they become character. Watch your character; it becomes your destiny.","When we do the best we can, we never know what miracle is wrought in our life or the life of another.","The healthiest response to life is joy.","Life is like a coin. You can spend it any way you wish, but you only spend it once.","The best portion of a good man’s life is his little nameless, unencumbered acts of kindness and of love.","In three words I can sum up everything I’ve learned about life: It goes on.","Life is ten percent what happens to you and ninety percent how you respond to it.","Keep calm and carry on.","Maybe that’s what life is… a wink of the eye and winking stars.","Life is a flower of which love is the honey.","Keep smiling, because life is a beautiful thing and there’s so much to smile about.","Health is the greatest gift, contentment the greatest wealth, faithfulness the best relationship.","You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose.","Good friends, good books, and a sleepy conscience: this is the ideal life.","Life would be tragic if it weren't funny.","Live in the sunshine, swim the sea, drink the wild air."));
    private final static Random random = new Random();


    public FortuneCookie(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<String> getQuotes() {
        return quotes;
    }

    public static ISurprise generate(){
        int quoteNumber = random.nextInt(27);
        String quote = quotes.get(quoteNumber);

        return new FortuneCookie(quote);
    }

    @Override
    public String toString() {
        return "FortuneCookie{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public void enjoy() {
        System.out.println("\t***Here's your famous quote! Enjoy!***");
        System.out.println("----" + this.message + "----");
    }
}
