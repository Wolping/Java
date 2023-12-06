public class NewsApp {
    public static void main(String[] args) {
        OnlineNews onlineNews = new OnlineNews();

        NewsSubscriber subscriber1 = new NewsSubscriber("Подписчик 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Подписчик 2");
        NewsSubscriber subscriber3 = new NewsSubscriber("Подписчик 3");

        onlineNews.addObserver(subscriber1);
        onlineNews.addObserver(subscriber2);
        onlineNews.addObserver(subscriber3);

        onlineNews.setLatestNews("Новая статья: Исследования показывают, что кофе полезен для здоровья!");

        onlineNews.removeObserver(subscriber2);

        onlineNews.setLatestNews("Важные события: Объявлены результаты мирового чемпионата по футболу!");

    }
}