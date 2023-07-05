package Lesson_2;

public class task_1 {

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";


        public static void main(String[] args) {
            Render render = new Render();

            Building building = new Building(100);
            Hero hero = new Hero(100, 50);
            Neutral neutral = new Neutral(100);

            building.setCurrentHealthPoint(50);
            hero.setCurrentHealthPoint(30);
            hero.setCurrentManaPoint(27);
            neutral.setCurrentHealthPoint(81);
            System.out.println("-------HERO------");
            render.showIndicator(hero);
            System.out.println("-------NEUTRAL------");
            render.showIndicator(neutral);
            System.out.println("-------BUILDING------");
            render.showIndicator(building); // В консоли должно быть примерно так: Текущий уровень
            // здоровья: 50, максимальный уровень здоровья: 100

            System.out.println(ANSI_RED + "This text has a red background but default text!" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "This text has a green background but default text!" + ANSI_RESET);

            hero.setCurrentHealthPoint(30);






        }

        static class Render {

            /**
             * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
             * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
             * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
             */
            public void showIndicator(Object object) {
                if (object instanceof hasHp){
                    System.out.println(((hasHp)object).getHp());
                }if (object instanceof hasMp){
                    System.out.println(((hasMp)object).getMp());
                }
                // Не должно быть упоминания конкретных классов!!!
            }

        }

        public interface hasHp{
            String getHp();
        };
        public interface hasMp{
            String getMp();
        };

        static class Building implements hasHp{

            private int maxHealthPoint; // максимально количество здоровья
            private int currentHealthPoint; // текущее количество здоровья

            public Building(int maxHealthPoint) {
                this.maxHealthPoint = maxHealthPoint;
                this.currentHealthPoint = maxHealthPoint;
            }

            public void setCurrentHealthPoint(int currentHealthPoint) {
                this.currentHealthPoint = currentHealthPoint;
            }
            public String getHp() {
                return "Max hp is " + maxHealthPoint + "\nCurrent hp is " + currentHealthPoint;
            }

            // FIXME: 29.06.2023 Дописать нужное

        }
        static class Hero implements hasMp, hasHp{

            private int maxHealthPoint; // максимально количество здоровья
            private int currentHealthPoint; // текущее количество здоровья

            private int maxManaPoint; // максимально количество магический энергии
            private int currentManaPoint; // текущее количество магический энергии

            public Hero(int maxHealthPoint, int maxManaPoint) {
                this.maxHealthPoint = maxHealthPoint;
                this.maxManaPoint = maxManaPoint;

                this.currentHealthPoint = maxHealthPoint;
                this.currentManaPoint = maxManaPoint;
            }

            public void setCurrentHealthPoint(int currentHealthPoint) {
                this.currentHealthPoint = currentHealthPoint;
            }

            public void setCurrentManaPoint(int currentManaPoint) {
                this.currentManaPoint = currentManaPoint;
            }
            public String getHp() {
                return "Max hp is " + maxHealthPoint + "\nCurrent hp is " + currentHealthPoint;
            }
            public String getMp() {
                return "Max mp is " + maxManaPoint + "\nCurrent mp is " + currentManaPoint;
            }


            // FIXME: 29.06.2023 Дописать нужное
        }

        static class Neutral implements hasHp {

            private int maxHealthPoint; // максимально количество здоровья
            private int currentHealthPoint; // текущее количество здоровья

            public Neutral(int maxHealthPoint) {
                this.maxHealthPoint = maxHealthPoint;
                this.currentHealthPoint = maxHealthPoint;
            }

            public void setCurrentHealthPoint(int currentHealthPoint) {
                this.currentHealthPoint = currentHealthPoint;
            }

            @Override
            public String getHp() {
                return "Max hp is " + maxHealthPoint + "\nCurrent hp is " + currentHealthPoint;
            }

            // FIXME: 29.06.2023 Дописать нужное
        }

    }

