package semester2;

public class Method {
        public static void main(String[] args) {
            Calculate p = new Calculate();
            p.setAngka1(8);
            p.setAngka2(9);
            p.addAllNumber();
            p.multiplyNumber(p.getAngka1(), p.getAngka2());
        }
    }

    class Calculate {
        private int angka1;
        private int angka2;

        public int setAngka1(int angka1) {
            this.angka1 = angka1;
            return angka1;
        }

        public int setAngka2(int angka2) {
            this.angka2 = angka2;
            return angka2;
        }

        public int getAngka1() {
            return angka1;
        }

        public int getAngka2() {
            return angka2;
        }

        public void addAllNumber() {
            int jumlah = angka1 + angka2;
            System.out.println("Jumlah: " + jumlah);
        }

        public void multiplyNumber(int angka1, int angka2) {
            int perkalian = angka1 * angka2;
            System.out.println("Perkalian: " + perkalian);
        }
    }


