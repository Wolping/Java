public class NewsApp {
    public static void main(String[] args) {
        OnlineNews onlineNews = new OnlineNews();

        // Создаем подписчиков
        NewsSubscriber subscriber1 = new NewsSubscriber("Подписчик 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Подписчик 2");
        NewsSubscriber subscriber3 = new NewsSubscriber("Подписчик 3");

        // Подписываем подписчиков на новости
        onlineNews.addObserver(subscriber1);
        onlineNews.addObserver(subscriber2);
        onlineNews.addObserver(subscriber3);

        // Публикуем новую статью
        onlineNews.setLatestNews("Новая статья: Исследования показывают, что кофе полезен для здоровья!");

        // Отписываем о��ного из подписчиков
        onlineNews.removeObserver(subscriber2);

        // Публикуем еще одну новую статью
        onlineNews.setLatestNews("Важные события: Объявлены результаты мирового чемпионата по футболу!");

    }
}