public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        int counter = 0;
        if (isCheck()) {
            counter++;
            int chance = (int) (Math.random() * 100);
            do {
                System.out.println("===== " + counter++ + ". Round =====");
                if (chance < 50) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (this.isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (this.isWin()) {
                        break;
                    }
                }
                if (chance >= 50) {
                    this.f1.health = this.f2.hit(this.f1);
                    if (this.isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (this.isWin()) {
                        break;
                    }
                }
            } while (f1.health > 0 && f2.health > 0);
            System.out.println(this.f1.name + " 'in sağlık durumu : " + this.f1.health);
            System.out.println(this.f2.name + " 'ın sağlık durumu : " + this.f2.health);

        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı ! ");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı ! ");
            return true;
        }
        return false;
    }
}
