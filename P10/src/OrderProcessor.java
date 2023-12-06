class OrderProcessor {
    public void processOrder(Book book) {
        System.out.println("Order processed for the book: " + book.getTitle() + " by " + book.getAuthor());
    }
}