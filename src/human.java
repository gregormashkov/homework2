public class human {
    String name;
    String city;
    String position;
    int age;


    String name1 = "Максим";
    String city1 = "Минск";
    String position1 = "бренд-менеджер";
    int age1 = 35;
    String name2 = "Аня";
    String city2 = "Москва";
    String position2 = "методист образовательных программ";
    int age2 = 29;
    String name3 = "Катя";
    String city3 = "Калиниград";
    String position3 = "продакт-менеджер";
    int age3 = 28;
    String name4 = "Артём";
    String position4 = "директор по развитию бизнеса";
    int age4 = 35;

    class main {
        public static void main(String[] args) {

            human human = new human();
            human.city = human.city1;
            human.name = human.name1;
            human.age = human.age1;
            human.position = human.position1;
            System.out.println("Привет! Меня зовут " + human.name1 + ". Я из города " + human.city1 + ". Мне " + human.age1 + " лет. Я работаю на должности " + human.position1 + ". Будем знакомы!");
            human.city = human.city2;
            human.name = human.name2;
            human.age = human.age2;
            System.out.println("Привет! Меня зовут " + human.name2 + ". Я из города " + human.city2 + ". Мне " + human.age2 + " лет. Я работаю на должности " + human.position2 + ". Будем знакомы!");
            human.city = human.city3;
            human.name = human.name3;
            human.age = human.age3;
            System.out.println("Привет! Меня зовут " + human.name3 + ". Я из города " + human.city3 + ". Мне " + human.age3 + " лет. Я работаю на должности " + human.position3 + ". Будем знакомы!");
            human.name = human.name4;
            human.age = human.age4;
            System.out.println("Привет! Меня зовут " + human.name4 + ". Я из города " + human.city2 + ". Мне " + human.age4 + " лет. Я работаю на должности " + human.position4 + ". Будем знакомы!");


        }
    }
}

