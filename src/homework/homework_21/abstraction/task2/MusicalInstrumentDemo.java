package homework.homework_21.abstraction.task2;

public class MusicalInstrumentDemo {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();

        guitar.playNote();
        piano.playNote();
        violin.playNote();
    }
}
