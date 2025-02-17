class LibraryItem {
    String title;
    String itemId;
    static boolean checkOut;
    
        public LibraryItem(String title, String itemId, boolean checkOut) {
            this.title = title;
            this.itemId = itemId;
            this.checkOut = false;
        }
        public void checkOut(){
            if(checkOut == false){
                checkOut = true;
                System.out.println("You have checked out " + title);
            } else {
                System.out.println("Sorry, " + title + " is already checked out.");
            } 
        }
        public void returnItem(){
            if(checkOut == true){
                checkOut = false;
                System.out.println("You have returned " + title);
            } else {
                System.out.println("Sorry, " + title + " is already returned.");
            }
        }
        class Book extends LibraryItem {
            String author;
        
            public Book(String title, String itemId, String author) {
            super(title, itemId, checkOut);
            this.author = author;
        }
        public String getAuthor() {
            return author;
        }
    }
}


