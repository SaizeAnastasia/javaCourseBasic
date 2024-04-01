package homework_33.task3;

import homework_33.task3.TourCollection;

public class TourCollectionDemo {
    public static void main(String[] args) {
        TourCollection tourCollection = new TourCollection(5);

        tourCollection.addRequest(" Семейный отдых в Германии ");
        tourCollection.addRequest(" Удивтельные приключения в африканском сафари ");
        tourCollection.addRequest(" Романтическая поездка в Венецию ");
        tourCollection.addRequest(" Необычная Мексика ");
        tourCollection.addRequest("Путешествие по транссибирской магистрали ");
        tourCollection.addRequest(" Бескрайняя великая китайская стена ");


        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();


        System.out.println(" Queue size: " + tourCollection.getQueueSize());
    }
}
