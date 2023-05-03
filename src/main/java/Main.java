public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = " Иванович";
        post.phone = "79475678899";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 24;
        post.birthday.nonth = 6;
        post.birthday.year = 1988;
    }
}
